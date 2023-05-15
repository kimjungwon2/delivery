package restaurant;

import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class CustomerInsert implements ActionListener{
	JTable table;
	JTextField text1,text2,text3,text4,text5;
	Connection conn = null;
	
	public CustomerInsert(JTable table, JTextField text1,JTextField text2, JTextField text3,JTextField text4,JTextField text5)
	{
		this.table =table;
		this.text1 = text1;
		this.text2 = text2;
		this.text3= text3;
		this.text4= text4;
		this.text5= text5;
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
		
		String baseQuery = 
		"insert into customerinfo (id, pw, name, address, phoneno) values ('"+id+"', "+"'"+pw+"', "+"'"+name+"', "+"'"+address+"', " +"'"+phoneno+"')"+";";
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.setRowCount(0);
		Statement st = null;
		
		try{
			if((!id.equals(""))&&(!pw.equals(""))&&(!name.equals(""))&&(!address.equals(""))&&(!phoneno.equals("")))
			{
				st=conn.createStatement();
				System.out.println(baseQuery);
				st.executeUpdate(baseQuery);
				st.close();
			}
			else System.out.println("모두 다 입력하셔야합니다.");
			

	}catch(SQLException ex){ex.printStackTrace();}
	}
}

class CustomerDelete implements ActionListener
{
	JTable table;
	 DefaultTableModel model;
	Connection conn = null;
	
	public CustomerDelete(JTable table, DefaultTableModel model)
	{
		this.table = table;
		this.model = model;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/malldb?useSSL=false","root","raincar");
	}
	catch(ClassNotFoundException ex){ex.printStackTrace();}
	catch(SQLException ex){ex.printStackTrace();}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		int rowindex = table.getSelectedRow();            //선택된 Row의 index
		
		String Customerdata = (String)table.getValueAt(rowindex,0); // 선택한 행의 id를 받아옴
		
		String baseQuery = "delete from customerinfo where id ='"+Customerdata+"';";
		
		Statement st = null;
		try{
				st=conn.createStatement();
				System.out.println(baseQuery);
				st.executeUpdate(baseQuery);
				st.close();	
		        model.removeRow(rowindex); 
		        model.fireTableDataChanged();	//지워진 row 가 반영되도록 테이블을 업데이트한다.
		        table.updateUI();
		}catch(SQLException ex){ex.printStackTrace();}
	}	
}

class CustomerUpdate implements ActionListener
{
	JTable table;
	 DefaultTableModel model;
	Connection conn = null;
	
	public CustomerUpdate(JTable table, DefaultTableModel model)
	{
		this.table = table;
		this.model = model;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/malldb?useSSL=false","root","raincar");
	}
	catch(ClassNotFoundException ex){ex.printStackTrace();}
	catch(SQLException ex){ex.printStackTrace();}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		int rowindex = table.getSelectedRow();            //선택된 Row의 index
		int colindex = table.getSelectedColumn();	  //선택된 Column의 index
		
		String Customerdata = (String)table.getValueAt(rowindex,colindex); // 선택한 행과 열의 데이터 받음
		String CustomerID = (String)table.getValueAt(rowindex,0);
		String CustomerPW = (String)table.getValueAt(rowindex,1);
		String CustomerNAME = (String)table.getValueAt(rowindex,2);
		String CustomerADDRESS = (String)table.getValueAt(rowindex,3);
		String CustomerPHONENO = (String)table.getValueAt(rowindex,4);
		String baseQuery = null;
		
		if(colindex==0) //ID 변경
		{
			baseQuery = "update customerinfo set id ='"+Customerdata+
					"' where pw='"+CustomerPW+"'"
					+" AND name='"+CustomerNAME+"'"
					+" AND address='"+CustomerADDRESS+"'"
					+" AND phoneno='"+CustomerPHONENO+"';";
		}
		else if(colindex==1) //PW 변경
		{
			baseQuery = "update customerinfo set pw ='"+Customerdata+"' where id='"+CustomerID+"';";
		}
		else if(colindex==2) //이름 변경
		{
			baseQuery = "update customerinfo set name ='"+Customerdata+"' where id='"+CustomerID+"';";
		}
		else if(colindex==3) //주소 변경
		{
			baseQuery = "update customerinfo set address ='"+Customerdata+"' where id='"+CustomerID+"';";
		}
		else if(colindex==4) //전화번호 변경
		{
			baseQuery = "update customerinfo set phoeno ='"+Customerdata+"' where id='"+CustomerID+"';";
		}
		
		Statement st = null;
		try{
				st=conn.createStatement();
				System.out.println(baseQuery);
				st.executeUpdate(baseQuery);
				st.close();	
		        table.setValueAt(Customerdata,rowindex,colindex);
		        model.fireTableDataChanged();	//update된 데이터가 반영되도록 테이블을 업데이트한다.
		        table.updateUI();
		}catch(SQLException ex){ex.printStackTrace();}
	}	
}
