package restaurant;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.table.*;

public class ServerGUI {

	private ImageIcon ServerButton1 = new ImageIcon(Server.class.getResource("../images/ServerButton1.png"));
	private ImageIcon ServerButton2 = new ImageIcon(Server.class.getResource("../images/ServerButton2.png"));
	private JButton Serverbutton1 = new JButton(ServerButton1);
	private JButton Serverbutton2 = new JButton(ServerButton2);
	
	public ServerGUI()
	{
		JFrame Admin = new JFrame("Administer Window");
		Admin.setPreferredSize(new Dimension(630,860));
		Admin.setLocation(100,100);
		Container contentPane1 = Admin.getContentPane();
		JPanel subPanel2 = new JPanel(new GridLayout(1,2));
		
		subPanel2.add(Serverbutton1);
		subPanel2.add(Serverbutton2);
		contentPane1.add(subPanel2, BorderLayout.CENTER);
		
		Admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Admin.pack();
		
		
		JFrame customer = new JFrame("고객정보");
		customer.setPreferredSize(new Dimension(630,860));
		customer.setLocation(100,100);
		Container contentPane2 = customer.getContentPane();
		JTextField text1 = new JTextField(6);
		JTextField text2 = new JTextField(7);
		JTextField text3 = new JTextField(7);
		JTextField text4 = new JTextField(9);
		JTextField text5 = new JTextField(7);
		
		JButton button1 = new JButton("Insert");
		JButton button2 = new JButton("Update");
		JButton button3 = new JButton("Delete");
		JButton button4 = new JButton("Search");
		JButton button5 = new JButton("주문내역");
		
		JPanel subPanel = new JPanel(new GridLayout(2,1));
		JPanel panel= new JPanel();
		JPanel panel2 = new JPanel();

		panel.add(new JLabel("ID"));
		panel.add(text1);
		panel.add(new JLabel("PW"));
		panel.add(text2);
		panel.add(new JLabel("이름"));
		panel.add(text3);
		panel.add(new JLabel("주소"));
		panel.add(text4);
		panel.add(new JLabel("전화번호"));
		panel.add(text5);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		subPanel.add(panel);
		subPanel.add(panel2);
		contentPane2.add(subPanel, BorderLayout.NORTH);

		String colNames[]={"ID","PW","이름","주소","전화번호"};
		DefaultTableModel model = new DefaultTableModel(colNames,0);
		JTable table = new JTable(model);
		table.getColumn("ID").setPreferredWidth(50);
		table.getColumn("PW").setPreferredWidth(50);
		table.getColumn("이름").setPreferredWidth(10);
		table.getColumn("주소").setPreferredWidth(200);
		table.getColumn("전화번호").setPreferredWidth(50);

		contentPane2.add(new JScrollPane(table),BorderLayout.CENTER);
		
		customer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		customer.pack();
		
		JFrame Orderlist = new JFrame("주문내역");
		Orderlist.setPreferredSize(new Dimension(1280,860));
		Orderlist.setLocation(100,100);
		Container contentPane3 = Orderlist.getContentPane();
		
		JPanel Orderlist_subPanel = new JPanel(new GridLayout(2,1));
		JPanel Orderlist_panel= new JPanel();
		JPanel Orderlist_panel2 = new JPanel();
		
		JTextField text_1 = new JTextField(4);
		JTextField text_2 = new JTextField(8);
		JTextField text_3 = new JTextField(10);

		
		JButton Orderlist_button1 = new JButton("Search");
		JButton Orderlist_button2 = new JButton("고객목록");
		
		Orderlist_panel.add(new JLabel("주문번호"));
		Orderlist_panel.add(text_1);
		Orderlist_panel.add(new JLabel("이름"));
		Orderlist_panel.add(text_2);
		Orderlist_panel.add(new JLabel("아이디"));
		Orderlist_panel.add(text_3);
		
		Orderlist_panel2.add(Orderlist_button1);
		Orderlist_panel2.add(Orderlist_button2);


		Orderlist_subPanel.add(Orderlist_panel);
		Orderlist_subPanel.add(Orderlist_panel2);
		contentPane3.add(Orderlist_subPanel, BorderLayout.NORTH);
		
		String Order_colNames[]={"주문번호","배달시간","이름","주소","전화번호","메뉴목록", "가격", "아이디"};
		DefaultTableModel Order_model = new DefaultTableModel(Order_colNames,0);
		JTable Order_table = new JTable(Order_model);
		Order_table.getColumn("주문번호").setPreferredWidth(60);
		Order_table.getColumn("배달시간").setPreferredWidth(100);
		Order_table.getColumn("이름").setPreferredWidth(70);
		Order_table.getColumn("주소").setPreferredWidth(300);
		Order_table.getColumn("전화번호").setPreferredWidth(100);
		Order_table.getColumn("메뉴목록").setPreferredWidth(300);
		Order_table.getColumn("가격").setPreferredWidth(70);
		Order_table.getColumn("아이디").setPreferredWidth(70);
		
		contentPane3.add(new JScrollPane(Order_table),BorderLayout.CENTER);
		
		Orderlist.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Orderlist.pack();

		Serverbutton1.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				Orderlist.setVisible(false);
				Admin.setVisible(false);
				customer.setVisible(true);
			}
		});	
		Serverbutton2.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				Admin.setVisible(false);
				customer.setVisible(false);
				Orderlist.setVisible(true);
			}
		});	
		button5.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				Admin.setVisible(false);
				customer.setVisible(false);
				Orderlist.setVisible(true);
			}
		});	
		
		Orderlist_button2.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				Admin.setVisible(false);
				customer.setVisible(true);
				Orderlist.setVisible(false);
			}
		});	
		
		button1.addActionListener(new CustomerInsert(table,text1,text2,text3,text4,text5));
		button2.addActionListener(new CustomerUpdate(table,model));
		button3.addActionListener(new CustomerDelete(table,model));
		button4.addActionListener(new CustomerSearch(table,text1,text2,text3,text4,text5));
		
		Orderlist_button1.addActionListener(new OrderSearch(Order_table,text_1,text_2,text_3));
		
		//초기화면
		Admin.setVisible(true);
		Orderlist.setVisible(false);
		customer.setVisible(false);

	}
	
}
