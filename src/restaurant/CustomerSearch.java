package restaurant;

import java.awt.event.*;
import java.sql.*;

import javax.swing.*;
import javax.swing.table.*;


public class CustomerSearch implements ActionListener {
	
	JTable table;
	JTextField text1,text2,text3,text4,text5;
	Connection conn = null;
	
	public CustomerSearch(JTable table, JTextField text1,JTextField text2, JTextField text3,JTextField text4,JTextField text5)
	{
		this.table = table;
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
		this.text4 = text4;
		this.text5 = text5;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/malldb?useSSL=false","root","raincar");
	}
	catch(ClassNotFoundException ex){ex.printStackTrace();}
	catch(SQLException ex){ex.printStackTrace();}
	}
	public void actionPerformed(ActionEvent e){
		String id = text1.getText();
		String pw = text2.getText();
		String name = text3.getText();
		String address = text4.getText();
		String phoneno =  text5.getText();
		
		String baseQuery = "SELECT id, pw, name, address , phoneno from customerinfo";
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.setRowCount(0);
		Statement stmt =null;
		
		try{
			stmt= conn.createStatement();
			String whereClause="";
			if(!id.equals(""))
				whereClause = " WHERE id LIKE '%"+id+"%'";
			if(!pw.equals(""))
				if(whereClause.equals(""))
					whereClause=" WHERE pw LIKE '%"+pw+"%'";
				else
					whereClause+=" AND pw LIKE '%"+pw+"%'";
			if(!name.equals(""))
				if(whereClause.equals(""))
					whereClause=" WHERE name LIKE '%"+name+"%'";
				else
					whereClause+=" AND name LIKE '%"+name+"%'";
			if(!address.equals(""))
				if(whereClause.equals(""))
					whereClause=" WHERE address LIKE '%"+address+"%'";
				else
					whereClause+=" AND address LIKE '%"+address+"%'";
			if(!phoneno.equals(""))
				if(whereClause.equals(""))
					whereClause=" WHERE phoneno LIKE '%"+phoneno+"%'";
				else
					whereClause+=" AND phoneno LIKE '%"+phoneno+"%'";
			
			String query = baseQuery + whereClause+";";

			ResultSet rs= stmt.executeQuery(query);
			while(rs.next())
			{
				id=rs.getString("id");
				pw= rs.getString("pw");
				name = rs.getString("name");
				address = rs.getString("address");
				phoneno = rs.getString("phoneno");
				
				Object data[]= {id,pw,name,address,phoneno};
				model.addRow(data);
			}
			stmt.close();
		}catch(SQLException ex){ex.printStackTrace();}
	}

}
