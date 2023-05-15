package restaurant;

import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class OrderSearch implements ActionListener 
{
	JTable table;
	JTextField text1,text2,text3;
	Connection conn = null;
	
	public OrderSearch(JTable table, JTextField text1 , JTextField text2,JTextField text3)
	{
		this.table = table;
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/malldb?useSSL=false","root","raincar");
		}
		catch(ClassNotFoundException ex){ex.printStackTrace();}
		catch(SQLException ex){ex.printStackTrace();}
	}
		
		public void actionPerformed(ActionEvent e)
		{
			String number = text1.getText();
			String time;
			String name = text2.getText();
			String address;
			String phoneno;
			String menulist;
			int price;
			String id = text3.getText();
			
			String baseQuery = "SELECT oi.number,oi.time,ci.name,ci.address,ci.phoneno,oi.menulist,oi.price,oi.id"
							   +" FROM orderinfo AS oi"
							   +" JOIN customerinfo AS ci"
							   +" ON oi.id = ci.id";
							  
			
			DefaultTableModel Order_model = (DefaultTableModel)table.getModel();
			Order_model.setRowCount(0);
			Statement stmt =null;
			
			try{
				stmt= conn.createStatement();
				String whereClause="";
				
				if(!number.equals(""))
					if(whereClause.equals(""))
						whereClause=" WHERE number LIKE '%"+number+"%'";
					else
						whereClause+=" AND number LIKE '%"+number+"%'";
				if(!name.equals(""))
					if(whereClause.equals(""))
						whereClause=" WHERE name LIKE '%"+name+"%'";
					else
						whereClause+=" AND name LIKE '%"+name+"%'";
				if(!id.equals(""))
					if(whereClause.equals(""))
						whereClause=" WHERE oi.id LIKE '%"+id+"%'";
					else
						whereClause+=" AND oi.id LIKE '%"+id+"%'";

				String query = baseQuery + whereClause+" order by oi.number desc;";
				
				ResultSet rs= stmt.executeQuery(query);
				
				while(rs.next())
				{
					number = rs.getString("number");
					time= rs.getString("time");
					name = rs.getString("name");
					address = rs.getString("address");
					phoneno = rs.getString("phoneno");
					menulist = rs.getString("menulist");
					price = rs.getInt("price");
					id = rs.getString("id");

					Object data[]= {number, time, name, address, phoneno, menulist, price, id};
					Order_model.addRow(data);
				}
				stmt.close();
			}catch(SQLException ex){ex.printStackTrace();}
		}
	}

