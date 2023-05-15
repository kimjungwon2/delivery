package restaurant;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.sql.*;
import java.text.*;

import javax.swing.*;



public class ClientGUI extends JFrame
{
	private Image screenImage;
	private Graphics screenGraphic;

	private ImageIcon login = new ImageIcon(Client.class.getResource("../images/login.png"));
	private ImageIcon Right = new ImageIcon(Client.class.getResource("../images/화살표.png"));
	private ImageIcon TransparentLeft = new ImageIcon(Client.class.getResource("../images/투명한 왼쪽화살표.png"));
	private ImageIcon member = new ImageIcon(Client.class.getResource("../images/회원가입.png"));
	private ImageIcon Registmember = new ImageIcon(Client.class.getResource("../images/회원가입버튼.png"));
	private ImageIcon Cancel = new ImageIcon(Client.class.getResource("../images/취소버튼.png"));
	private ImageIcon Left = new ImageIcon(Client.class.getResource("../images/왼쪽화살표.png"));
	private ImageIcon TransparentRight = new ImageIcon(Client.class.getResource("../images/������ ������ ȭ��ǥ.png"));
	private ImageIcon AddOrder = new ImageIcon(Client.class.getResource("../images/�ֹ�ǥ �߰�.png"));
	private ImageIcon Minus = new ImageIcon(Client.class.getResource("../images/minus.png"));
	private ImageIcon Plus = new ImageIcon(Client.class.getResource("../images/plus.png"));
	private ImageIcon delete = new ImageIcon(Client.class.getResource("../images/delete.png"));
	
	private Image PleaseInputScreen = new ImageIcon(Client.class.getResource("../images/��� �Է��ϼ���.png")).getImage();
	private Image background= new ImageIcon(Client.class.getResource("../Images/background.png")).getImage();
	private Image Memberbackground= new ImageIcon(Client.class.getResource("../Images/MemberBackground.png")).getImage();
	private Image Confirmpw = new ImageIcon(Client.class.getResource("../Images/��й�ȣ Ȯ��â.png")).getImage();
	private Image NotRegist = new ImageIcon(Client.class.getResource("../Images/����Xâ.png")).getImage();
	private Image Differentpw = new ImageIcon(Client.class.getResource("../Images/��й�ȣXâ.png")).getImage();
	private Image OrderScreen = new ImageIcon(Client.class.getResource("../Images/��ٱ���.png")).getImage();
	private Image OrderMenu = new ImageIcon(Client.class.getResource("../Images/�ֹ�1.png")).getImage();
	private Image OverOrder = new ImageIcon(Client.class.getResource("../Images/OverOrder.png")).getImage();
	private Image OrderAlert = new ImageIcon(Client.class.getResource("../Images/AddOrder.png")).getImage();
	private Image Blank = new ImageIcon(Client.class.getResource("../Images/Blank.png")).getImage();
	private Image Overlap = new ImageIcon(Client.class.getResource("../Images/Overlap.png")).getImage();
	private Image OrderEnd = new ImageIcon(Client.class.getResource("../Images/�ֹ��Ϸ�ȭ��.png")).getImage();
	private Image ConfirmOr = new ImageIcon(Client.class.getResource("../Images/�ֹ��Ͻðڽ��ϱ�.png")).getImage();
	private Image WrongID = new ImageIcon(Client.class.getResource("../Images/���̵��ߺ�üũ.png")).getImage();
	private Image OverlapID = new ImageIcon(Client.class.getResource("../Images/�ߺ��Ⱦ��̵�.png")).getImage();
	private Image OverlapIDX = new ImageIcon(Client.class.getResource("../Images/�ߺ���x.png")).getImage();
	
	private JButton loginButton = new JButton(login);
	private JButton RightButton1 = new JButton(Right);
	private JButton LeftButton1 = new JButton(TransparentLeft);
	private JButton RightButton2 = new JButton(Right);
	private JButton LeftButton2 = new JButton(Left);
	private JButton RightButton3 = new JButton(TransparentRight);
	private JButton LeftButton3 = new JButton(Left);
	private JButton MemberButton = new JButton(member);
	private JButton RegistMemberButton = new JButton(Registmember);
	private JButton CancelButton = new JButton(Cancel);
	private JButton Exitbutton = new JButton( new ImageIcon(Client.class.getResource("../Images/xbutton.png")));
	private JButton LogoutButton = new JButton(new ImageIcon(Client.class.getResource("../Images/�α׾ƿ�.png")));
	private JButton OrderButton = new JButton(new ImageIcon(Client.class.getResource("../Images/OrderButton.png")));
	private JButton OrderlistButton = new JButton(new ImageIcon(Client.class.getResource("../Images/�ֹ����.png")));
	private JButton Confirmbutton = new JButton( new ImageIcon(Client.class.getResource("../Images/button.gif")));
	private JButton Confirmbuttonx = new JButton( new ImageIcon(Client.class.getResource("../Images/button.gif")));
	private JButton Confirmbutton1 = new JButton( new ImageIcon(Client.class.getResource("../Images/button.gif")));
	private JButton Confirmbutton2 = new JButton( new ImageIcon(Client.class.getResource("../Images/button.gif")));
	private JButton OrderConfirm = new JButton( new ImageIcon(Client.class.getResource("../Images/button.gif")));
	private JButton OverOrderConfirm = new JButton( new ImageIcon(Client.class.getResource("../Images/button.gif")));
	private JButton OverLapConfirm = new JButton( new ImageIcon(Client.class.getResource("../Images/button.gif")));
	private JButton DoOrder = new JButton( new ImageIcon(Client.class.getResource("../Images/�ֹ��ϱ�.png")));
	private JButton MenuADD = new JButton( new ImageIcon(Client.class.getResource("../Images/�޴��߰�.png")));
	private JButton Ordering = new JButton( new ImageIcon(Client.class.getResource("../Images/�ֹ��ϱ�Button.png")));
	private JButton LastOrderButton = new JButton( new ImageIcon(Client.class.getResource("../Images/�����ֹ�����.png")));
	private JButton YesButton = new JButton( new ImageIcon(Client.class.getResource("../Images/Yes.png")));
	private JButton NoButton = new JButton( new ImageIcon(Client.class.getResource("../Images/No.png")));
	private JButton ConfirmIDButton = new JButton( new ImageIcon(Client.class.getResource("../Images/�ߺ�Ȯ��.png")));
	
	private JButton Order1 = new JButton(AddOrder);
	private JButton Order2 = new JButton(AddOrder);
	private JButton Order3 = new JButton(AddOrder);
	private JButton Order4 = new JButton(AddOrder);
	private JButton Order5 = new JButton(AddOrder);
	private JButton Order6 = new JButton(AddOrder);
	private JButton Order7 = new JButton(AddOrder);
	private JButton Order8 = new JButton(AddOrder);
	private JButton Order9 = new JButton(AddOrder);
	private JButton Order10 = new JButton(AddOrder);
	private JButton Order11 = new JButton(AddOrder);
	private JButton Order12 = new JButton(AddOrder);
	private JButton Minus1 = new JButton(Minus);
	private JButton Minus2 = new JButton(Minus);
	private JButton Minus3 = new JButton(Minus);
	private JButton Minus4 = new JButton(Minus);
	private JButton Minus5 = new JButton(Minus);
	private JButton Minus6 = new JButton(Minus);
	private JButton Minus7 = new JButton(Minus);
	private JButton Minus8 = new JButton(Minus);
	private JButton Minus9 = new JButton(Minus);
	private JButton Plus1 = new JButton(Plus);
	private JButton Plus2 = new JButton(Plus);
	private JButton Plus3 = new JButton(Plus);
	private JButton Plus4 = new JButton(Plus);
	private JButton Plus5 = new JButton(Plus);
	private JButton Plus6 = new JButton(Plus);
	private JButton Plus7 = new JButton(Plus);
	private JButton Plus8 = new JButton(Plus);
	private JButton Plus9 = new JButton(Plus);
	private JButton delete1 = new JButton(delete);
	private JButton delete2 = new JButton(delete);
	private JButton delete3 = new JButton(delete);
	private JButton delete4 = new JButton(delete);
	private JButton delete5 = new JButton(delete);
	private JButton delete6 = new JButton(delete);
	private JButton delete7 = new JButton(delete);
	private JButton delete8 = new JButton(delete);
	private JButton delete9 = new JButton(delete);

	private JLabel Menubar =new JLabel(new ImageIcon(Client.class.getResource("../Images/menubar.png")));
	private JTextField IDInput = new JTextField("���̵�"); int IDcount = 0;
	private JPasswordField PWInput = new JPasswordField("��й�ȣ�Է�"); int PWCount=0;
	private JTextField Regist_ID = new JTextField("���̵� �Է�");int RICount=0;
	private JPasswordField Regist_PW = new JPasswordField("��й�ȣ �Է�");int RPCount=0;
	private JPasswordField Regist_RePW = new JPasswordField("��й�ȣ Ȯ��");int RRPCount=0;
	private JTextField Regist_name = new JTextField("�̸� �Է�");int RNCount=0;
	private JTextField Regist_phone = new JTextField("��ȭ��ȣ �Է�");int RphCount=0;
	private JTextField Regist_address = new JTextField("�ּ� �Է�");int RACount=0;

	private String ID,PW,name,phoneno,address;
	private String MyID;
	private String MyPW;
	private String MyName;
	private String MyAddress;
	private String MyPhoneno;
	private String MyMenu;
	private int MenuPrice;
	private int MenuNumber;
	private String Menu1,Menu2,Menu3,Menu4,Menu5,Menu6,Menu7,Menu8,Menu9;
	private int MenuPrice1,MenuPrice2,MenuPrice3,MenuPrice4,MenuPrice5,MenuPrice6,MenuPrice7,MenuPrice8,MenuPrice9;
	private int MenuNum1,MenuNum2,MenuNum3,MenuNum4,MenuNum5,MenuNum6,MenuNum7,MenuNum8,MenuNum9;
	private int MenuxPrice1,MenuxPrice2,MenuxPrice3,MenuxPrice4,MenuxPrice5,MenuxPrice6,MenuxPrice7,MenuxPrice8,MenuxPrice9;
	
	boolean wrongID = false,pleaseConfirm = false,pleaseID=false,correctID=false;
	boolean IDConfirm = false;
	boolean ConfirmOrder = false;
	boolean PleaseInput = false;
	boolean buttonPress = false;
	boolean loginScreen = true;
	boolean orderScreen = false;
	boolean MemberScreen = false;
	boolean WrongPwScreen = false;
	boolean DifferentPWAlert = false;
	boolean NotRegistAlert = false;
	boolean ShoppingBasket = false;
	boolean OrAlert = false;
	boolean Over = false;
	boolean OverLap = false;
	boolean OrderEnding = false;
	boolean Food1 = false,Food2=false,Food3=false,Food4=false,Food5=false,Food6=false;
	boolean Food7 = false,Food8=false,Food9=false,Food10=false,Food11=false,Food12=false;
	int mouseX,mouseY;
	
	Order order = new Order();
	OrderList ol = new OrderList();
	
	public ClientGUI()
	{
		MyID=null; MyPW=null; MyName=null; MyAddress=null; MyPhoneno=null; //�α��� ����
		MyMenu = null; MenuPrice = 0; // �޴����� 
		Menu1=null;Menu2=null;Menu3=null;Menu4=null;Menu5=null;Menu6=null;Menu7=null;Menu8=null;Menu9=null;
		MenuPrice1=0;MenuPrice2=0;MenuPrice3=0;MenuPrice4=0;MenuPrice5=0;MenuPrice6=0;MenuPrice7=0;MenuPrice8=0;MenuPrice9=0;
		MenuxPrice1=0;MenuxPrice2=0;MenuxPrice3=0;MenuxPrice4=0;MenuxPrice5=0;MenuxPrice6=0;MenuxPrice7=0;MenuxPrice8=0;MenuxPrice9=0;
		MenuNum1=0;MenuNum2=0;MenuNum3=0;MenuNum4=0;MenuNum5=0;MenuNum6=0;MenuNum7=0;MenuNum8=0;MenuNum9=0;
		MenuNumber = 0;	
		
		
		setTitle("Restaurant");
		setSize(630,860);
		setResizable(false); // ũ������ x
		setLocationRelativeTo(null); //â�� ���߾ӿ� �߰Բ����� 
		setLayout(null);

		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// x��ư�� ������ ���� ����ǰ� �� ����
		setVisible(true);
		setBackground(new Color(0,0,0,0));
		
		Exitbutton.setBounds(596,0,34,30);
		Exitbutton.setBorderPainted(false);
		Exitbutton.setContentAreaFilled(false);
		Exitbutton.setFocusPainted(false);
		Exitbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				System.exit(0);
			}
		});
		add(Exitbutton);
		
		Menubar.setBounds(0,0,860,30);
		Menubar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		Menubar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - mouseX, y - mouseY);
			}
		});
		add(Menubar);
		
		// �α��� ������
		loginButton.setBounds(165, 700, 315, 100);
		loginButton.setBorderPainted(false);
		loginButton.setContentAreaFilled(false);
		loginButton.setFocusPainted(false);
		loginButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				add(Confirmbutton1);add(Confirmbutton2);
				
				Login A= new Login(IDInput,PWInput);	// �α��� ���� �Է�
				
				if(A.NotRegist==true)		// ��ϵ��� ���� ����
				{
					NotRegistAlert = true;
				}
				else if(A.DifferentPW==true)	//��й�ȣ�� �ٸ���� 
				{
					DifferentPWAlert = true;
				}
				
				else if(A.PassLogin==true)  // �α��� ����
				{
					MyID=A.r_id; MyPW=A.r_pw; MyName=A.r_name; MyAddress=A.r_address; MyPhoneno=A.r_phoneno; 
					// �α��� ������ ����� ���� ����
					
					loginScreen=false;
					orderScreen = true;
					
					IDInput.setVisible(false);
					PWInput.setVisible(false);
					
					MemberButton.setVisible(false);
					RightButton1.setVisible(true);
					LeftButton1.setVisible(true);
					loginButton.setVisible(false);
					

					add(Order1);add(Order2);add(Order3);add(Order4);add(Order5);add(Order6);
					add(Order7);add(Order8);add(Order9);add(Order10);add(Order11);add(Order12);
					add(DoOrder);
					order.page1=true;order.page2=false;order.page3=false;
					System.out.println(MyID+" "+MyPW+" "+ MyName+" "+MyAddress+" "+MyPhoneno);
					
					IDInput.setText("���̵�");IDcount = 0;PWCount=0; PWInput.setText("��й�ȣ�Է�");
				}			
			}
		});	
		
		Confirmbutton1.setBounds(390, 490, 100, 50);
		Confirmbutton1.setBorderPainted(false);
		Confirmbutton1.setContentAreaFilled(false);
		Confirmbutton1.setFocusPainted(false);
		Confirmbutton1.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				NotRegistAlert = false;
			}
		});	
		
		Confirmbutton2.setBounds(390, 490, 100, 50);
		Confirmbutton2.setBorderPainted(false);
		Confirmbutton2.setContentAreaFilled(false);
		Confirmbutton2.setFocusPainted(false);
		Confirmbutton2.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				DifferentPWAlert = false;
			}
		});	
		
		
		//�����ֹ���ư 
		Order1.setBounds(485, 205, 130, 50);
		Order1.setBorderPainted(false);
		Order1.setContentAreaFilled(false);
		Order1.setFocusPainted(false);
		Order1.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(Food1 == true){OverLap = true; add(OverLapConfirm);}
				else if(MenuNumber<9)
				{
					MenuPrice+=4000;
					MenuNumber++; Food1 = true;
					OrAlert=true;add(OrderConfirm);
					
					if(Menu1==null) {MenuNum1=1; MenuPrice1 =4000;MenuxPrice1 =4000; Menu1 = "�����";} 
					else if(Menu2==null){MenuNum2=1;MenuPrice2 =4000;MenuxPrice2 =4000; Menu2 = "�����";}
					else if(Menu3==null){MenuNum3=1;MenuPrice3 =4000;MenuxPrice3 =4000; Menu3 = "�����";}
					else if(Menu4==null) {MenuNum4=1;MenuPrice4 =4000;MenuxPrice4 =4000;Menu4 = "�����";}
					else if(Menu5==null){MenuNum5=1;MenuPrice5 =4000;MenuxPrice5 =4000; Menu5 = "�����";}
					else if(Menu6==null){MenuNum6=1;MenuPrice6 =4000;MenuxPrice6 =4000; Menu6 = "�����";}
					else if(Menu7==null){MenuNum7=1;MenuPrice7 =4000;MenuxPrice7 =4000; Menu7 = "�����";}
					else if(Menu8==null){MenuNum8=1;MenuPrice8 =4000;MenuxPrice8 =4000;Menu8 = "�����";}
					else if(Menu9==null){MenuNum9=1;MenuPrice9 =4000;MenuxPrice9 =4000;Menu9 = "�����";}
				}
				else if(MenuNumber>=9){Over = true; add(OverOrderConfirm);}
			}
		});	
		Order2.setBounds(485, 385, 130, 50);
		Order2.setBorderPainted(false);
		Order2.setContentAreaFilled(false);
		Order2.setFocusPainted(false);
		Order2.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(Food2==true){OverLap = true; add(OverLapConfirm);}
				else if(MenuNumber<9)
				{
					MenuPrice+=5000;Food2 = true;
					MenuNumber++;
					OrAlert=true;add(OrderConfirm);
					
					if(Menu1==null) {MenuNum1=1;MenuPrice1 =5000;MenuxPrice1 =5000; Menu1 = "��¥��";}
					else if(Menu2==null) {MenuNum2=1;MenuPrice2 =5000;MenuxPrice2 =5000; Menu2 = "��¥��";}
					else if(Menu3==null) {MenuNum3=1;MenuPrice3 =5000;MenuxPrice3 =5000; Menu3 = "��¥��";}
					else if(Menu4==null) {MenuNum4=1;MenuPrice4 =5000;MenuxPrice4 =5000; Menu4 = "��¥��";}
					else if(Menu5==null){MenuNum5=1;MenuPrice5 =5000;MenuxPrice5=5000;  Menu5 = "��¥��";}
					else if(Menu6==null) {MenuNum6=1;MenuPrice6 =5000;MenuxPrice6 =5000; Menu6 = "��¥��";}
					else if(Menu7==null){MenuNum7=1;MenuPrice7 =5000;MenuxPrice7 =5000;  Menu7 = "��¥��";}
					else if(Menu8==null) {MenuNum8=1;MenuPrice8 =5000;MenuxPrice8 =5000; Menu8 = "��¥��";}
					else if(Menu9==null) {MenuNum9=1;MenuPrice9 =5000;MenuxPrice9 =5000; Menu9 = "��¥��";}
				}
				else if(MenuNumber>=9){Over = true; add(OverOrderConfirm);}
			}
		});	
		Order3.setBounds(485, 565, 130, 50);
		Order3.setBorderPainted(false);
		Order3.setContentAreaFilled(false);
		Order3.setFocusPainted(false);
		Order3.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(Food3 ==true){OverLap = true; add(OverLapConfirm);}
				else if(MenuNumber<9)
				{
					MenuPrice+=4500;Food3 = true;
					MenuNumber++;
					OrAlert=true;add(OrderConfirm);
					
					if(Menu1==null) {MenuNum1=1;MenuPrice1 =4500;MenuxPrice1 =4500; Menu1 = "������";}
					else if(Menu2==null) {MenuNum2=1;MenuPrice2 =4500;MenuxPrice2 =4500;Menu2 = "������";}
					else if(Menu3==null) {MenuNum3=1;MenuPrice3 =4500;MenuxPrice3 =4500;Menu3 = "������";}
					else if(Menu4==null) {MenuNum4=1;MenuPrice4 =4500;MenuxPrice4 =4500;Menu4 = "������";}
					else if(Menu5==null) {MenuNum5=1;MenuPrice5 =4500;MenuxPrice5 =4500;Menu5 = "������";}
					else if(Menu6==null) {MenuNum6=1;MenuPrice6 =4500;MenuxPrice6 =4500;Menu6 = "������";}
					else if(Menu7==null) {MenuNum7=1;MenuPrice7 =4500;MenuxPrice7 =4500;Menu7 = "������";}
					else if(Menu8==null) {MenuNum8=1;MenuPrice8 =4500;MenuxPrice8 =4500; Menu8 = "������";}
					else if(Menu9==null) {MenuNum9=1;MenuPrice9 =4500;MenuxPrice9 =4500;Menu9 = "������";}
				}
				else if(MenuNumber>=9){Over = true; add(OverOrderConfirm);}
			}
		});	
		Order4.setBounds(485, 745, 130, 50);
		Order4.setBorderPainted(false);
		Order4.setContentAreaFilled(false);
		Order4.setFocusPainted(false);
		Order4.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(Food4==true){OverLap = true; add(OverLapConfirm);}
				else if(MenuNumber<9)
				{
					MenuPrice+=5000;Food4 = true;
					MenuNumber++;
					OrAlert=true;add(OrderConfirm);
					
					if(Menu1==null) {MenuNum1=1;MenuPrice1 =5000;MenuxPrice1 =5000;Menu1 = "�ø�";}
					else if(Menu2==null) {MenuNum2=1;MenuPrice2 =5000;MenuxPrice2 =5000;Menu2 = "�ø�";}
					else if(Menu3==null){MenuNum3=1;MenuPrice3 =5000; MenuxPrice3 =5000;Menu3 = "�ø�";}
					else if(Menu4==null) {MenuNum4=1;MenuPrice4 =5000;MenuxPrice4 =5000;Menu4 = "�ø�";}
					else if(Menu5==null) {MenuNum5=1;MenuPrice5 =5000;MenuxPrice5 =5000;Menu5 = "�ø�";}
					else if(Menu6==null) {MenuNum6=1;MenuPrice6 =5000;MenuxPrice6 =5000;Menu6 = "�ø�";}
					else if(Menu7==null) {MenuNum7=1;MenuPrice7 =5000;MenuxPrice7 =5000;Menu7 = "�ø�";}
					else if(Menu8==null) {MenuNum8=1;MenuPrice8 =5000;MenuxPrice8 =5000;Menu8 = "�ø�";}
					else if(Menu9==null) {MenuNum9=1;MenuPrice9 =5000;MenuxPrice9 =5000;Menu9 = "�ø�";}
				}
				else if(MenuNumber>=9){Over = true; add(OverOrderConfirm);}
			}
		});	
		Order5.setBounds(485, 205, 130, 50);
		Order5.setBorderPainted(false);
		Order5.setContentAreaFilled(false);
		Order5.setFocusPainted(false);
		Order5.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(Food5==true){OverLap = true; add(OverLapConfirm);}
				else if(MenuNumber<9)
				{
					MenuPrice+=10000;Food5 = true;
					MenuNumber++;
					OrAlert=true;add(OrderConfirm);
					
					if(Menu1==null) {MenuNum1=1;MenuPrice1 =10000;MenuxPrice1 =10000;Menu1 = "���ĵκ�";}
					else if(Menu2==null) {MenuNum2=1;MenuPrice2 =10000;MenuxPrice2 =10000;Menu2 = "���ĵκ�";}
					else if(Menu3==null) {MenuNum3=1;MenuPrice3 =10000;MenuxPrice3 =10000;Menu3 = "���ĵκ�";}
					else if(Menu4==null){MenuNum4=1;MenuPrice4 =10000; MenuxPrice4 =10000;Menu4 = "���ĵκ�";}
					else if(Menu5==null) {MenuNum5=1;MenuPrice5 =10000;MenuxPrice5 =10000;Menu5 = "���ĵκ�";}
					else if(Menu6==null) {MenuNum6=1;MenuPrice6 =10000;MenuxPrice6 =10000;Menu6 = "���ĵκ�";}
					else if(Menu7==null) {MenuNum7=1;MenuPrice7 =10000;MenuxPrice7 =10000;Menu7 = "���ĵκ�";}
					else if(Menu8==null) {MenuNum8=1;MenuPrice8 =10000;MenuxPrice8 =10000;Menu8 = "���ĵκ�";}
					else if(Menu9==null) {MenuNum9=1;MenuPrice9 =10000;MenuxPrice9 =10000;Menu9 = "���ĵκ�";}
				}
				else if(MenuNumber>=9){Over = true; add(OverOrderConfirm);}
			}
		});	
		Order6.setBounds(485, 385, 130, 50);
		Order6.setBorderPainted(false);
		Order6.setContentAreaFilled(false);
		Order6.setFocusPainted(false);
		Order6.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(Food6==true){OverLap = true; add(OverLapConfirm);}
				else if(MenuNumber<9)
				{
					MenuPrice+=5000;Food6 = true;
					MenuNumber++;
					OrAlert=true;add(OrderConfirm);
					
					if(Menu1==null)  {MenuNum1=1;MenuPrice1 =5000;MenuxPrice1 =5000;Menu1 = "������";}
					else if(Menu2==null)  {MenuNum2=1;MenuPrice2 =5000;MenuxPrice2 =5000;Menu2 = "������";}
					else if(Menu3==null)  {MenuNum3=1;MenuPrice3 =5000;MenuxPrice3 =5000;Menu3 = "������";}
					else if(Menu4==null)  {MenuNum4=1;MenuPrice4 =5000;MenuxPrice4 =5000;Menu4 = "������";}
					else if(Menu5==null)  {MenuNum5=1;MenuPrice5 =5000;MenuxPrice5 =5000;Menu5 = "������";}
					else if(Menu6==null)  {MenuNum6=1;MenuPrice6 =5000;MenuxPrice6 =5000;Menu6 = "������";}
					else if(Menu7==null)  {MenuNum7=1;MenuPrice7 =5000;MenuxPrice7 =5000;Menu7 = "������";}
					else if(Menu8==null)  {MenuNum8=1;MenuPrice8 =5000;MenuxPrice8 =5000;Menu8 = "������";}
					else if(Menu9==null)  {MenuNum9=1;MenuPrice9 =5000;MenuxPrice9 =5000;Menu9 = "������";}
				}
				else if(MenuNumber>=9){Over = true; add(OverOrderConfirm);}
			}
		});	
		Order7.setBounds(485, 565, 130, 50);
		Order7.setBorderPainted(false);
		Order7.setContentAreaFilled(false);
		Order7.setFocusPainted(false);
		Order7.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(Food7==true){OverLap = true; add(OverLapConfirm);}
				else if(MenuNumber<9)
				{
					MenuPrice+=7000;Food7 = true;
					MenuNumber++;
					OrAlert=true;add(OrderConfirm);
					
					if(Menu1==null) {MenuNum1=1;MenuPrice1 =7000;MenuxPrice1 =7000;Menu1 = "���쵤��";}
					else if(Menu2==null) {MenuNum2=1;MenuPrice2 =7000;MenuxPrice2 =7000;Menu2 = "���쵤��";}
					else if(Menu3==null) {MenuNum3=1;MenuPrice3 =7000;MenuxPrice3 =7000;Menu3 = "���쵤��";}
					else if(Menu4==null) {MenuNum4=1;MenuPrice4 =7000;MenuxPrice4 =7000;Menu4 = "���쵤��";}
					else if(Menu5==null) {MenuNum5=1;MenuPrice5 =7000;MenuxPrice5 =7000;Menu5 = "���쵤��";}
					else if(Menu6==null) {MenuNum6=1;MenuPrice6 =7000;MenuxPrice6 =7000;Menu6 = "���쵤��";}
					else if(Menu7==null) {MenuNum7=1;MenuPrice7 =7000;MenuxPrice7 =7000;Menu7 = "���쵤��";}
					else if(Menu8==null) {MenuNum8=1;MenuPrice8 =7000;MenuxPrice8 =7000; Menu8 = "���쵤��";}
					else if(Menu9==null) {MenuNum9=1;MenuPrice9 =7000;MenuxPrice9 =7000;Menu9 = "���쵤��";}
				}
				else if(MenuNumber>=9){Over = true; add(OverOrderConfirm);}
			}
		});	
		Order8.setBounds(485, 745, 130, 50);
		Order8.setBorderPainted(false);
		Order8.setContentAreaFilled(false);
		Order8.setFocusPainted(false);
		Order8.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(Food8==true){OverLap = true; add(OverLapConfirm);}
				else if(MenuNumber<9)
				{
					MenuPrice+=5000;Food8 = true;
					MenuNumber++;
					OrAlert=true;add(OrderConfirm);
					
					if(Menu1==null) {MenuNum1=1;MenuPrice1 =5000;MenuxPrice1 =5000;Menu1 = "�쵿";}
					else if(Menu2==null) {MenuNum2=1;MenuPrice2 =5000;MenuxPrice2 =5000;Menu2 = "�쵿";}
					else if(Menu3==null) {MenuNum3=1;MenuPrice3 =5000;MenuxPrice3 =5000;Menu3 = "�쵿";}
					else if(Menu4==null) {MenuNum4=1;MenuPrice4 =5000;MenuxPrice4 =5000;Menu4 = "�쵿";}
					else if(Menu5==null) {MenuNum5=1;MenuPrice5 =5000;MenuxPrice5 =5000;Menu5 = "�쵿";}
					else if(Menu6==null) {MenuNum6=1;MenuPrice6 =5000;MenuxPrice6 =5000;Menu6 = "�쵿";}
					else if(Menu7==null) {MenuNum7=1;MenuPrice7 =5000;MenuxPrice7 =5000;Menu7 = "�쵿";}
					else if(Menu8==null) {MenuNum8=1;MenuPrice8 =5000;MenuxPrice8 =5000;Menu8 = "�쵿";}
					else if(Menu9==null) {MenuNum9=1;MenuPrice9 =5000;MenuxPrice9 =5000;Menu9 = "�쵿";}
				}
				else if(MenuNumber>=9){Over = true; add(OverOrderConfirm);}
			}
		});	
		Order9.setBounds(485, 205, 130, 50);
		Order9.setBorderPainted(false);
		Order9.setContentAreaFilled(false);
		Order9.setFocusPainted(false);
		Order9.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(Food9==true){OverLap = true; add(OverLapConfirm);}
				else if(MenuNumber<9)
				{
					MenuPrice+=7000;Food9 = true;
					MenuNumber++;
					OrAlert=true;add(OrderConfirm);
					
					if(Menu1==null) {MenuNum1=1;MenuPrice1 =7000;MenuxPrice1 =7000;Menu1 = "��������";}
					else if(Menu2==null) {MenuNum2=1;MenuPrice2 =7000;MenuxPrice2 =7000;Menu2 = "��������";}
					else if(Menu3==null) {MenuNum3=1;MenuPrice3 =7000;MenuxPrice3 =7000;Menu3 = "��������";}
					else if(Menu4==null) {MenuNum4=1;MenuPrice4 =7000;MenuxPrice4 =7000;Menu4 = "��������";}
					else if(Menu5==null) {MenuNum5=1;MenuPrice5 =7000;MenuxPrice5 =7000;Menu5 = "��������";}
					else if(Menu6==null) {MenuNum6=1;MenuPrice6 =7000;MenuxPrice6 =7000;Menu6 = "��������";}
					else if(Menu7==null) {MenuNum7=1;MenuPrice7 =7000;MenuxPrice7 =7000;Menu7 = "��������";}
					else if(Menu8==null) {MenuNum8=1;MenuPrice8 =7000;MenuxPrice8 =7000;Menu8 = "��������";}
					else if(Menu9==null) {MenuNum9=1;MenuPrice9 =7000;MenuxPrice9 =7000;Menu9 = "��������";}
				}
				else if(MenuNumber>=9){Over = true; add(OverOrderConfirm);}
			}
		});	
		Order10.setBounds(485, 385, 130, 50);
		Order10.setBorderPainted(false);
		Order10.setContentAreaFilled(false);
		Order10.setFocusPainted(false);
		Order10.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(Food10==true){OverLap = true; add(OverLapConfirm);}
				else if(MenuNumber<9)
				{
					MenuPrice+=5000;Food10 = true;
					MenuNumber++;
					OrAlert=true;add(OrderConfirm);
					
					if(Menu1==null) {MenuNum1=1;MenuPrice1 =5000;MenuxPrice1 =5000;Menu1 = "�����";}
					else if(Menu2==null) {MenuNum2=1;MenuPrice2 =5000;MenuxPrice2 =5000;Menu2 = "�����";}
					else if(Menu3==null) {MenuNum3=1;MenuPrice3 =5000;MenuxPrice3 =5000;Menu3 = "�����";}
					else if(Menu4==null) {MenuNum4=1;MenuPrice4 =5000;MenuxPrice4 =5000;Menu4 = "�����";}
					else if(Menu5==null) {MenuNum5=1;MenuPrice5 =5000;MenuxPrice5 =5000; Menu5 = "�����";}
					else if(Menu6==null) {MenuNum6=1;MenuPrice6 =5000;MenuxPrice6 =5000;Menu6 = "�����";}
					else if(Menu7==null) {MenuNum7=1;MenuPrice7 =5000;MenuxPrice7 =5000;Menu7 = "�����";}
					else if(Menu8==null) {MenuNum8=1;MenuPrice8 =5000;MenuxPrice8 =5000;Menu8 = "�����";}
					else if(Menu9==null) {MenuNum9=1;MenuPrice9 =5000;MenuxPrice9 =5000;Menu9 = "�����";}
				}
				else if(MenuNumber>=9){Over = true; add(OverOrderConfirm);}
			}
		});	
		Order11.setBounds(485, 565, 130, 50);
		Order11.setBorderPainted(false);
		Order11.setContentAreaFilled(false);
		Order11.setFocusPainted(false);
		Order11.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(Food11==true){OverLap = true; add(OverLapConfirm);}
				else if(MenuNumber<9)
				{
					MenuPrice+=5000;Food11 = true;
					MenuNumber++;
					OrAlert=true;add(OrderConfirm);
					
					if(Menu1==null) {MenuNum1=1;MenuPrice1 =5000;MenuxPrice1 =5000;Menu1 = "«��";}
					else if(Menu2==null) {MenuNum2=1;MenuPrice2 =5000;MenuxPrice2 =5000;Menu2 = "«��";}
					else if(Menu3==null) {MenuNum3=1;MenuPrice3 =5000;MenuxPrice3 =5000;Menu3 = "«��";}
					else if(Menu4==null) {MenuNum4=1;MenuPrice4 =5000;MenuxPrice4 =5000;Menu4 = "«��";}
					else if(Menu5==null) {MenuNum5=1;MenuPrice5 =5000;MenuxPrice5 =5000;Menu5 = "«��";}
					else if(Menu6==null) {MenuNum6=1;MenuPrice6 =5000;MenuxPrice6 =5000;Menu6 = "«��";}
					else if(Menu7==null) {MenuNum7=1;MenuPrice7 =5000;MenuxPrice7 =5000;Menu7 = "«��";}
					else if(Menu8==null) {MenuNum8=1;MenuPrice8 =5000;MenuxPrice8 =5000; Menu8 = "«��";}
					else if(Menu9==null) {MenuNum9=1;MenuPrice9 =5000;MenuxPrice9 =5000;Menu9 = "«��";}
				}
				else if(MenuNumber>=9){Over = true; add(OverOrderConfirm);}
			}
		});	
		Order12.setBounds(485, 745, 130, 50);
		Order12.setBorderPainted(false);
		Order12.setContentAreaFilled(false);
		Order12.setFocusPainted(false);
		Order12.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(Food12==true){OverLap = true; add(OverLapConfirm);}
				else if(MenuNumber<9)
				{
					MenuPrice+=12000;Food12 = true;
					MenuNumber++;
					OrAlert=true;add(OrderConfirm);
					
					if(Menu1==null) {MenuNum1=1;MenuPrice1 =12000;MenuxPrice1 =12000;Menu1 = "������";}
					else if(Menu2==null) {MenuNum2=1;MenuPrice2 =12000;MenuxPrice2 =12000;Menu2 = "������";}
					else if(Menu3==null) {MenuNum3=1;MenuPrice3 =12000;MenuxPrice3 =12000;Menu3 = "������";}
					else if(Menu4==null) {MenuNum4=1;MenuPrice4 =12000;MenuxPrice4 =12000;Menu4 = "������";}
					else if(Menu5==null) {MenuNum5=1;MenuPrice5 =12000;MenuxPrice5 =12000;Menu5 = "������";}
					else if(Menu6==null) {MenuNum6=1;MenuPrice6 =12000;MenuxPrice6 =12000;Menu6 = "������";}
					else if(Menu7==null) {MenuNum7=1;MenuPrice7 =12000;MenuxPrice7 =12000;Menu7 = "������";}
					else if(Menu8==null) {MenuNum8=1;MenuPrice8 =12000; MenuxPrice8 =12000;Menu8 = "������";}
					else if(Menu9==null) {MenuNum9=1;MenuPrice9 =12000;MenuxPrice9 =12000;Menu9 = "������";}
				}
				else if(MenuNumber>=9){Over = true; add(OverOrderConfirm);}
			}
		});	
		
		OrderConfirm.setBounds(390, 490, 100, 50);
		OrderConfirm.setBorderPainted(false);
		OrderConfirm.setContentAreaFilled(false);
		OrderConfirm.setFocusPainted(false);
		OrderConfirm.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				OrAlert = false; OrderConfirm.setVisible(false);
			}
		});	
		
		OverOrderConfirm.setBounds(390, 490, 100, 50);
		OverOrderConfirm.setBorderPainted(false);
		OverOrderConfirm.setContentAreaFilled(false);
		OverOrderConfirm.setFocusPainted(false);
		OverOrderConfirm.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				Over = false; OverOrderConfirm.setVisible(false);
			}
		});
		OverLapConfirm.setBounds(390, 490, 100, 50);
		OverLapConfirm.setBorderPainted(false);
		OverLapConfirm.setContentAreaFilled(false);
		OverLapConfirm.setFocusPainted(false);
		OverLapConfirm.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				OverLap = false; OverLapConfirm.setVisible(false);
			}
		});
		
		DoOrder.setBounds(250, 810, 145, 50);
		DoOrder.setBorderPainted(false);
		DoOrder.setContentAreaFilled(false);
		DoOrder.setFocusPainted(false);
		DoOrder.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				ShoppingBasket = true; orderScreen = false;
				Order1.setVisible(false);Order2.setVisible(false);Order3.setVisible(false);Order4.setVisible(false);
				Order5.setVisible(false);Order6.setVisible(false);Order7.setVisible(false);Order8.setVisible(false);
				Order9.setVisible(false);Order10.setVisible(false);Order11.setVisible(false);Order12.setVisible(false);
				LogoutButton.setVisible(false);OrderlistButton.setVisible(false);
				DoOrder.setVisible(false);RightButton1.setVisible(false);LeftButton1.setVisible(false);
				RightButton2.setVisible(false);LeftButton2.setVisible(false);
				RightButton3.setVisible(false);LeftButton3.setVisible(false);
				Minus1.setVisible(false);Plus1.setVisible(false);Minus2.setVisible(false);Plus2.setVisible(false);
				Minus3.setVisible(false);Plus3.setVisible(false);Minus4.setVisible(false);Plus4.setVisible(false);
				Minus5.setVisible(false);Plus5.setVisible(false);Minus6.setVisible(false);Plus6.setVisible(false);
				Minus7.setVisible(false);Plus7.setVisible(false);Minus8.setVisible(false);Plus8.setVisible(false);
				Minus9.setVisible(false);Plus9.setVisible(false);
				delete1.setVisible(false);			delete1.setVisible(false);delete2.setVisible(false);delete3.setVisible(false);delete4.setVisible(false);
				delete5.setVisible(false);delete6.setVisible(false);delete7.setVisible(false);delete8.setVisible(false);delete9.setVisible(false);
				add(MenuADD);add(Ordering);
				
			}
		});	
		
		
		
		//���� ȭ��ǥ (1������)
		RightButton1.setBounds(420, 760, 160, 150);
		RightButton1.setBorderPainted(false);
		RightButton1.setContentAreaFilled(false);
		RightButton1.setFocusPainted(false);
		RightButton1.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				order.page2 = true; order.page1=false;
				RightButton1.setVisible(false);LeftButton1.setVisible(false);
				RightButton2.setVisible(true);LeftButton2.setVisible(true);
				add(RightButton2);add(LeftButton2);
			}
		});	
		
		LeftButton1.setBounds(50, 760, 160, 150);
		LeftButton1.setBorderPainted(false);
		LeftButton1.setContentAreaFilled(false);
		LeftButton1.setFocusPainted(false);
		
		//���� ȭ��ǥ (2������)
		RightButton2.setBounds(420, 760, 160, 150);
		RightButton2.setBorderPainted(false);
		RightButton2.setContentAreaFilled(false);
		RightButton2.setFocusPainted(false);
		RightButton2.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				order.page2 =false; order.page3=true;
				RightButton2.setVisible(false);LeftButton2.setVisible(false);
				RightButton3.setVisible(true);LeftButton3.setVisible(true);
				add(RightButton3);add(LeftButton3);
			}
		});	
		
		LeftButton2.setBounds(50, 760, 160, 150);
		LeftButton2.setBorderPainted(false);
		LeftButton2.setContentAreaFilled(false);
		LeftButton2.setFocusPainted(false);
		LeftButton2.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				order.page2 =false; order.page1=true;
				RightButton2.setVisible(false);LeftButton2.setVisible(false);
				RightButton1.setVisible(true);LeftButton1.setVisible(true);
			}
		});	
		//����ȭ��ǥ 3������
		RightButton3.setBounds(420, 760, 160, 150);
		RightButton3.setBorderPainted(false);
		RightButton3.setContentAreaFilled(false);
		RightButton3.setFocusPainted(false);

		
		LeftButton3.setBounds(50, 760, 160, 150);
		LeftButton3.setBorderPainted(false);
		LeftButton3.setContentAreaFilled(false);
		LeftButton3.setFocusPainted(false);
		LeftButton3.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				order.page2 =true; order.page3=false;
				RightButton2.setVisible(true);LeftButton2.setVisible(true);
				RightButton3.setVisible(false);LeftButton3.setVisible(false);
			}
		});	
		

		IDInput.setBounds(220, 500, 250, 50);
		IDInput.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				IDcount++;
				if(IDcount==1)IDInput.setText("");
			}
		});	
		
		PWInput.setBounds(220, 590, 250, 50);
		PWInput.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				PWCount++;
				if(PWCount==1)PWInput.setText("");
			}
		});	
		// ȸ������ 
		
		Regist_ID.setBounds(40, 300, 550, 30);
		Regist_ID.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				RICount++;
				if(RICount==1)Regist_ID.setText("");
			}
		});	
		Regist_PW.setBounds(40, 360, 550, 30);
		Regist_PW.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				RPCount++;
				if(RPCount==1)Regist_PW.setText("");
			}
		});	
		Regist_RePW.setBounds(40, 420, 550, 30);
		Regist_RePW.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				RRPCount++;
				if(RRPCount==1)Regist_RePW.setText("");
			}
		});	
		Regist_name.setBounds(40, 510, 550, 30);
		Regist_name.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				RNCount++;
				if(RNCount==1)Regist_name.setText("");
			}
		});	
		Regist_phone.setBounds(40, 570, 550, 30);
		Regist_phone.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				RphCount++;
				if(RphCount==1)Regist_phone.setText("");
			}
		});	
		Regist_address.setBounds(40, 635, 550, 30);
		Regist_address.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				RACount++;
				if(RACount==1)Regist_address.setText("");
			}
		});	

		add(IDInput);add(PWInput);
		
		ConfirmIDButton.setBounds(80, 270, 62, 25);
		ConfirmIDButton.setBorderPainted(false);
		ConfirmIDButton.setContentAreaFilled(false);
		ConfirmIDButton.setFocusPainted(false);
		ConfirmIDButton.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				wrongID=true;
				
				String confirmID = null;
				String JQuery;
				
				confirmID = Regist_ID.getText();
				String myID = null;
				
				try{
					Socket socket = new Socket("127.0.0.1",5000);
					PrintWriter writer = new PrintWriter(socket.getOutputStream());
					BufferedReader reader =new BufferedReader(new InputStreamReader(socket.getInputStream()));
					JQuery = "SELECT* FROM customerinfo WHERE id='"+confirmID+"';";
					
					writer.println(JQuery);
					writer.flush();
					
					myID = reader.readLine();
					
					// �ߺ��Ⱦ��̵� �˻�
					
					if(myID==null) {IDConfirm = true;correctID=true;} 
					else {IDConfirm = false; pleaseID = true;}
					
				}
				catch(UnknownHostException x){x.printStackTrace();}
				catch(FileNotFoundException x){x.printStackTrace();}
				catch(IOException x){x.printStackTrace();} 
			}
		});	
		
		// ȸ������ ��ư
		RegistMemberButton.setBounds(180, 720, 100, 50);
		RegistMemberButton.setBorderPainted(false);
		RegistMemberButton.setContentAreaFilled(false);
		RegistMemberButton.setFocusPainted(false);
		RegistMemberButton.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				int confirmPW;
					
				MemberRegist MR = 
			new MemberRegist(Regist_ID ,Regist_PW,Regist_RePW,Regist_name,Regist_phone,Regist_address);
				
				confirmPW=MR.VerifyPW();
				
				String Regist_ID1,Regist_name1,Regist_phone1,Regist_address1;
				Regist_ID1=Regist_ID.getText();Regist_name1=Regist_name.getText();
				Regist_phone1=Regist_phone.getText();Regist_address1=Regist_address.getText();
				
				if(wrongID == false) pleaseConfirm = true;
				else if(IDConfirm == false) pleaseConfirm = true;
				else if(Regist_ID1.equals("���̵� �Է�")||Regist_ID1.equals("")) PleaseInput = true;
				else if(Regist_name1.equals("�̸� �Է�")||Regist_name1.equals("")) PleaseInput = true;
				else if(Regist_phone1.equals("��ȭ��ȣ �Է�")||Regist_phone1.equals("")) PleaseInput = true;
				else if(Regist_address1.equals("�ּ� �Է�")||Regist_address1.equals("")) PleaseInput = true;
				else if(confirmPW==0) WrongPwScreen = true; // ��й�ȣ Ȯ�� ��ư�̶� ��й�ȣ�� �ٸ��� 
				else if(confirmPW==1)			// ��й�ȣ Ȯ�� ��ư�̶� ��й�ȣ�� ������ ȸ������
				{
					buttonPress=true;
					
					ID = MR.R_ID;
					PW= MR.R_PW;
					name = MR.R_NAME;
					phoneno = MR.R_PHONE;
					address = MR.R_ADDRESS;
					String JQuery;
					
					try{
						Socket socket = new Socket("127.0.0.1",5000);
						PrintWriter writer = new PrintWriter(socket.getOutputStream());
						
						JQuery="insert into customerinfo (id, pw, name, address, phoneno) values ('"+ID+"', "+"'"+PW+"', "+"'"+name+"', "+"'"+address+"', " +"'"+phoneno+"')"+";";
			
						writer.println(JQuery);
						writer.flush();
						
						socket.close();
						
						MemberScreen = false;
						loginScreen = true;
						IDConfirm = false;wrongID = false;IDConfirm = false;

						CancelButton.setVisible(false);
						RegistMemberButton.setVisible(false);
						ConfirmIDButton.setVisible(false);
						
						Regist_ID.setVisible(false);
						Regist_PW.setVisible(false);
						Regist_RePW.setVisible(false);
						Regist_name.setVisible(false);
						Regist_phone.setVisible(false);
						Regist_address.setVisible(false);
					}
					catch(UnknownHostException x){x.printStackTrace();}
					catch(FileNotFoundException x){x.printStackTrace();}
					catch(IOException x){x.printStackTrace();} 
				}
			}
		});	
		Confirmbutton.setBounds(370, 490, 100, 50);
		Confirmbutton.setBorderPainted(false);
		Confirmbutton.setContentAreaFilled(false);
		Confirmbutton.setFocusPainted(false);
		Confirmbutton.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				WrongPwScreen = false; PleaseInput = false;
				pleaseConfirm = false; pleaseID = false;
			}
		});	
		Confirmbuttonx.setBounds(370, 490, 100, 50); // ���̵� �ߺ��˻�
		Confirmbuttonx.setBorderPainted(false);
		Confirmbuttonx.setContentAreaFilled(false);
		Confirmbuttonx.setFocusPainted(false);
		Confirmbuttonx.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				correctID = false;
			}
		});	
		
		CancelButton.setBounds(340, 720, 100, 50);
		CancelButton.setBorderPainted(false);
		CancelButton.setContentAreaFilled(false);
		CancelButton.setFocusPainted(false);
		CancelButton.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				MemberScreen = false;
				loginScreen = true;
				WrongPwScreen = false;
				wrongID = false;
				IDConfirm = false;
				
				CancelButton.setVisible(false);
				RegistMemberButton.setVisible(false);
				Confirmbutton.setVisible(false);
				ConfirmIDButton.setVisible(false);
				
				Regist_ID.setVisible(false);
				Regist_PW.setVisible(false);
				Regist_RePW.setVisible(false);
				Regist_name.setVisible(false);
				Regist_phone.setVisible(false);
				Regist_address.setVisible(false);
				
				IDcount = 0;PWCount=0;
				IDInput.setText("���̵�");
				PWInput.setText("��й�ȣ�Է�");
			}
		});	

		MemberButton.setBounds(450, 660, 100, 30);
		MemberButton.setBorderPainted(false);
		MemberButton.setContentAreaFilled(false);
		MemberButton.setFocusPainted(false);
		MemberButton.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				add(Regist_ID);add(Regist_PW);add(Regist_RePW);add(Regist_name);
				add(Regist_phone);add(Regist_address);
				add(RegistMemberButton);add(CancelButton);add(Confirmbutton);
				add(Confirmbuttonx);
				add(ConfirmIDButton);
				
				loginButton.setVisible(false);
				IDInput.setVisible(false);
				PWInput.setVisible(false);
				MemberButton.setVisible(false);
				
				MemberScreen = true;
				loginScreen=false;
				
				RICount=0;RPCount=0;RRPCount=0;RNCount=0;RphCount=0;RACount=0;
				Regist_ID.setText("���̵� �Է�");
				Regist_PW.setText("��й�ȣ �Է�");
				Regist_RePW.setText("��й�ȣ Ȯ��");
				Regist_name.setText("�̸� �Է�");
				Regist_phone.setText("��ȭ��ȣ �Է�");
				Regist_address.setText("�ּ� �Է�");
			}
		});	
		// �α׾ƿ� & �ֹ����
		LogoutButton.setBounds(20, 40, 100, 30);
		LogoutButton.setBorderPainted(false);
		LogoutButton.setContentAreaFilled(false);
		LogoutButton.setFocusPainted(false);
		LogoutButton.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				
				LogoutButton.setVisible(false);
				OrderlistButton.setVisible(false);
				RightButton1.setVisible(false);
				LeftButton1.setVisible(false);
				RightButton2.setVisible(false);
				LeftButton2.setVisible(false);
				RightButton3.setVisible(false);
				LeftButton3.setVisible(false);
				OrderButton.setVisible(false);
				
				DoOrder.setVisible(false);
				Order1.setVisible(false);Order2.setVisible(false);Order3.setVisible(false);Order4.setVisible(false);
				Order5.setVisible(false);Order6.setVisible(false);Order7.setVisible(false);Order8.setVisible(false);
				Order9.setVisible(false);Order10.setVisible(false);Order11.setVisible(false);Order12.setVisible(false);
				
				orderScreen=false;loginScreen=true;ol.LastOrderScreen=false;IDConfirm = false;
				Food1=false;Food2=false;Food3=false;Food4=false;Food5=false;Food6=false;
				Food7=false;Food8=false;Food9=false;Food10=false;Food11=false;Food12=false;
				
				//�α��� ���� �ʱ�ȭ
				MyID=null; MyPW=null; MyName=null; MyAddress=null; MyPhoneno=null; //�α��� ����
				MyMenu = null; MenuPrice = 0; // �޴����� 
				Menu1=null;Menu2=null;Menu3=null;Menu4=null;Menu5=null;Menu6=null;Menu7=null;Menu8=null;Menu9=null;
				MenuPrice1=0;MenuPrice2=0;MenuPrice3=0;MenuPrice4=0;MenuPrice5=0;MenuPrice6=0;MenuPrice7=0;MenuPrice8=0;MenuPrice9=0;
				MenuxPrice1=0;MenuxPrice2=0;MenuxPrice3=0;MenuxPrice4=0;MenuxPrice5=0;MenuxPrice6=0;MenuxPrice7=0;MenuxPrice8=0;MenuxPrice9=0;
				MenuNum1=0;MenuNum2=0;MenuNum3=0;MenuNum4=0;MenuNum5=0;MenuNum6=0;MenuNum7=0;MenuNum8=0;MenuNum9=0;
				MenuNumber = 0;	IDcount = 0;PWCount=0;ol.listNum = 0;ConfirmOrder=false;
				IDInput.setText("���̵�");
				PWInput.setText("��й�ȣ�Է�");
				
				System.out.println(MyID+" "+MyPW+" "+ MyName+" "+MyAddress+" "+MyPhoneno);
			}
		});
		
		OrderButton.setBounds(520, 40, 100, 30);
		OrderButton.setBorderPainted(false);
		OrderButton.setContentAreaFilled(false);
		OrderButton.setFocusPainted(false);
		OrderButton.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				
				OrderButton.setVisible(false);  ol.LastOrderScreen= false;
				orderScreen = true; 
				Order1.setVisible(true);Order2.setVisible(true);Order3.setVisible(true);Order4.setVisible(true);
				Order5.setVisible(false);Order6.setVisible(false);Order7.setVisible(false);Order8.setVisible(false);
				Order9.setVisible(false);Order10.setVisible(false);Order11.setVisible(false);Order12.setVisible(false);
				RightButton1.setVisible(true);LeftButton1.setVisible(true);RightButton2.setVisible(false);LeftButton2.setVisible(false);
				RightButton3.setVisible(false);LeftButton3.setVisible(false);
				MyMenu = null; MenuPrice = 0; // �޴����� 
				Menu1=null;Menu2=null;Menu3=null;Menu4=null;Menu5=null;Menu6=null;Menu7=null;Menu8=null;Menu9=null;
				MenuPrice1=0;MenuPrice2=0;MenuPrice3=0;MenuPrice4=0;MenuPrice5=0;MenuPrice6=0;MenuPrice7=0;MenuPrice8=0;MenuPrice9=0;
				MenuxPrice1=0;MenuxPrice2=0;MenuxPrice3=0;MenuxPrice4=0;MenuxPrice5=0;MenuxPrice6=0;MenuxPrice7=0;MenuxPrice8=0;MenuxPrice9=0;
				MenuNum1=0;MenuNum2=0;MenuNum3=0;MenuNum4=0;MenuNum5=0;MenuNum6=0;MenuNum7=0;MenuNum8=0;MenuNum9=0;
				MenuNumber = 0;ol.listNum = 0;
				Food1=false;Food2=false;Food3=false;Food4=false;Food5=false;Food6=false;
				Food7=false;Food8=false;Food9=false;Food10=false;Food11=false;Food12=false;	
			}
		});
		
		OrderlistButton.setBounds(520, 40, 100, 30);
		OrderlistButton.setBorderPainted(false);
		OrderlistButton.setContentAreaFilled(false);
		OrderlistButton.setFocusPainted(false);
		OrderlistButton.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				orderScreen=false; ol.LastOrderScreen=true;
				Order1.setVisible(false);Order2.setVisible(false);Order3.setVisible(false);Order4.setVisible(false);
				Order5.setVisible(false);Order6.setVisible(false);Order7.setVisible(false);Order8.setVisible(false);
				Order9.setVisible(false);Order10.setVisible(false);Order11.setVisible(false);Order12.setVisible(false);
				DoOrder.setVisible(false);OrderlistButton.setVisible(false);
				RightButton1.setVisible(false);LeftButton1.setVisible(false);
				RightButton2.setVisible(false);LeftButton2.setVisible(false);
				RightButton3.setVisible(false);LeftButton3.setVisible(false);
				ol.Link(MyID);
			}
		});
		
		//��ٱ��� 
		
		MenuADD.setBounds(80, 810, 219, 45);
		MenuADD.setBorderPainted(false);
		MenuADD.setContentAreaFilled(false);
		MenuADD.setFocusPainted(false);
		MenuADD.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				ShoppingBasket= false; orderScreen=true;
				order.page1=true;order.page2=false;order.page3=false;
				Order1.setVisible(true);Order2.setVisible(true);Order3.setVisible(true);Order4.setVisible(true);
				Order5.setVisible(false);Order6.setVisible(false);Order7.setVisible(false);Order8.setVisible(false);
				Order9.setVisible(false);Order10.setVisible(false);Order11.setVisible(false);Order12.setVisible(false);
				RightButton1.setVisible(true);LeftButton1.setVisible(true);
				RightButton2.setVisible(false);LeftButton2.setVisible(false);
				RightButton3.setVisible(false);LeftButton3.setVisible(false);
				MenuADD.setVisible(false);	Ordering.setVisible(false);
				Minus1.setVisible(false);Plus1.setVisible(false);Minus2.setVisible(false);Plus2.setVisible(false);
				Minus3.setVisible(false);Plus3.setVisible(false);Minus4.setVisible(false);Plus4.setVisible(false);
				Minus5.setVisible(false);Plus5.setVisible(false);Minus6.setVisible(false);Plus6.setVisible(false);
				Minus7.setVisible(false);Plus7.setVisible(false);Minus8.setVisible(false);Plus8.setVisible(false);
				Minus9.setVisible(false);Plus9.setVisible(false);
				delete1.setVisible(false);	delete1.setVisible(false);delete2.setVisible(false);delete3.setVisible(false);delete4.setVisible(false);
				delete5.setVisible(false);delete6.setVisible(false);delete7.setVisible(false);delete8.setVisible(false);delete9.setVisible(false);
				YesButton.setVisible(false);NoButton.setVisible(false);ConfirmOrder=false;
				
			}
		});
		
		Minus1.setBounds(505, 135 , 20, 20);
		Minus1.setBorderPainted(false);
		Minus1.setContentAreaFilled(false);
		Minus1.setFocusPainted(false);
		Minus1.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(MenuNum1 !=1) {MenuPrice-=MenuPrice1;MenuNum1--; MenuxPrice1-=MenuPrice1;}
			}
		});
		
		Plus1.setBounds(595, 135, 20, 20);
		Plus1.setBorderPainted(false);
		Plus1.setContentAreaFilled(false);
		Plus1.setFocusPainted(false);
		Plus1.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				MenuNum1++;MenuxPrice1+=MenuPrice1;
				MenuPrice+=MenuPrice1;
			}
		});
		
		delete1.setBounds(25,135,50,20);
		delete1.setBorderPainted(false);
		delete1.setContentAreaFilled(false);
		delete1.setFocusPainted(false);
		delete1.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(Menu1.equals("�����")) Food1 = false;
				else if(Menu1.equals("��¥��")) Food2 = false;
				else if(Menu1.equals("������")) Food3 = false;
				else if(Menu1.equals("�ø�"))  Food4 = false;
				else if(Menu1.equals("���ĵκ�")) Food5 = false;
				else if(Menu1.equals("������")) Food6 = false;
				else if(Menu1.equals("���쵤��")) Food7 = false;
				else if(Menu1.equals("�쵿")) Food8 = false;
				else if(Menu1.equals("��������")) Food9 = false;
				else if(Menu1.equals("�����")) Food10 = false;
				else if(Menu1.equals("«��")) Food11 = false;
				else if(Menu1.equals("������")) Food12 = false;
				
				MenuxPrice1 = 0; Menu1=null;
				MenuPrice-=MenuPrice1*MenuNum1;MenuNum1=0;MenuPrice1=0;MenuNumber--;
				delete1.setVisible(false);Plus1.setVisible(false);Minus1.setVisible(false);
			}
		});
		
		Minus2.setBounds(505, 207 , 20, 20);
		Minus2.setBorderPainted(false);
		Minus2.setContentAreaFilled(false);
		Minus2.setFocusPainted(false);
		Minus2.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(MenuNum2 !=1) {MenuPrice-=MenuPrice2;MenuxPrice2-=MenuPrice2;MenuNum2--;}
			}
		});
		
		Plus2.setBounds(595, 207, 20, 20);
		Plus2.setBorderPainted(false);
		Plus2.setContentAreaFilled(false);
		Plus2.setFocusPainted(false);
		Plus2.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				MenuNum2++;MenuxPrice2+=MenuPrice2;
				MenuPrice+=MenuPrice2;
			}
		});
		
		delete2.setBounds(25,207,50,20);
		delete2.setBorderPainted(false);
		delete2.setContentAreaFilled(false);
		delete2.setFocusPainted(false);
		delete2.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(Menu2.equals("�����")) Food1 = false;
				else if(Menu2.equals("��¥��")) Food2 = false;
				else if(Menu2.equals("������")) Food3 = false;
				else if(Menu2.equals("�ø�"))  Food4 = false;
				else if(Menu2.equals("���ĵκ�")) Food5 = false;
				else if(Menu2.equals("������")) Food6 = false;
				else if(Menu2.equals("���쵤��")) Food7 = false;
				else if(Menu2.equals("�쵿")) Food8 = false;
				else if(Menu2.equals("��������")) Food9 = false;
				else if(Menu2.equals("�����")) Food10 = false;
				else if(Menu2.equals("«��")) Food11 = false;
				else if(Menu2.equals("������")) Food12 = false;
				
				MenuxPrice2 = 0; Menu2=null;
				MenuPrice-=MenuPrice2*MenuNum2;MenuNum2=0;MenuPrice2=0;MenuNumber--;
				delete2.setVisible(false);Plus2.setVisible(false);Minus2.setVisible(false);
			}
		});
		Minus3.setBounds(505, 279 , 20, 20);
		Minus3.setBorderPainted(false);
		Minus3.setContentAreaFilled(false);
		Minus3.setFocusPainted(false);
		Minus3.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(MenuNum3 !=1) {MenuPrice-=MenuPrice3;MenuxPrice3-=MenuPrice3;MenuNum3--;}
			}
		});
		
		Plus3.setBounds(595, 279, 20, 20);
		Plus3.setBorderPainted(false);
		Plus3.setContentAreaFilled(false);
		Plus3.setFocusPainted(false);
		Plus3.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				MenuNum3++;MenuxPrice3+=MenuPrice3;
				MenuPrice+=MenuPrice3;
			}
		});
		
		delete3.setBounds(25,279,50,20);
		delete3.setBorderPainted(false);
		delete3.setContentAreaFilled(false);
		delete3.setFocusPainted(false);
		delete3.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(Menu3.equals("�����")) Food1 = false;
				else if(Menu3.equals("��¥��")) Food2 = false;
				else if(Menu3.equals("������")) Food3 = false;
				else if(Menu3.equals("�ø�"))  Food4 = false;
				else if(Menu3.equals("���ĵκ�")) Food5 = false;
				else if(Menu3.equals("������")) Food6 = false;
				else if(Menu3.equals("���쵤��")) Food7 = false;
				else if(Menu3.equals("�쵿")) Food8 = false;
				else if(Menu3.equals("��������")) Food9 = false;
				else if(Menu3.equals("�����")) Food10 = false;
				else if(Menu3.equals("«��")) Food11 = false;
				else if(Menu3.equals("������")) Food12 = false;
				
				MenuxPrice3 = 0; Menu3=null;
				MenuPrice-=MenuPrice3*MenuNum3;MenuNum3=0;MenuPrice3=0;MenuNumber--;
				delete3.setVisible(false);Plus3.setVisible(false);Minus3.setVisible(false);
			}
		});
		Minus4.setBounds(505, 351 , 20, 20);
		Minus4.setBorderPainted(false);
		Minus4.setContentAreaFilled(false);
		Minus4.setFocusPainted(false);
		Minus4.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(MenuNum4 !=1) {MenuPrice-=MenuPrice4;MenuxPrice4-=MenuPrice4;MenuNum4--;}
			}
		});
		
		Plus4.setBounds(595, 351, 20, 20);
		Plus4.setBorderPainted(false);
		Plus4.setContentAreaFilled(false);
		Plus4.setFocusPainted(false);
		Plus4.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				MenuNum4++;MenuxPrice4+=MenuPrice4;
				MenuPrice+=MenuPrice4;
			}
		});
		
		delete4.setBounds(25,351,50,20);
		delete4.setBorderPainted(false);
		delete4.setContentAreaFilled(false);
		delete4.setFocusPainted(false);
		delete4.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(Menu4.equals("�����")) Food1 = false;
				else if(Menu4.equals("��¥��")) Food2 = false;
				else if(Menu4.equals("������")) Food3 = false;
				else if(Menu4.equals("�ø�"))  Food4 = false;
				else if(Menu4.equals("���ĵκ�")) Food5 = false;
				else if(Menu4.equals("������")) Food6 = false;
				else if(Menu4.equals("���쵤��")) Food7 = false;
				else if(Menu4.equals("�쵿")) Food8 = false;
				else if(Menu4.equals("��������")) Food9 = false;
				else if(Menu4.equals("�����")) Food10 = false;
				else if(Menu4.equals("«��")) Food11 = false;
				else if(Menu4.equals("������")) Food12 = false;
				
				MenuxPrice4 = 0; Menu4=null;
				MenuPrice-=MenuPrice4*MenuNum4;MenuNum4=0;MenuPrice4=0;MenuNumber--;
				delete4.setVisible(false);Plus4.setVisible(false);Minus4.setVisible(false);
			}
		});
		Minus5.setBounds(505, 423 , 20, 20);
		Minus5.setBorderPainted(false);
		Minus5.setContentAreaFilled(false);
		Minus5.setFocusPainted(false);
		Minus5.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(MenuNum5 !=1) {MenuPrice-=MenuPrice5;MenuxPrice5-=MenuPrice5;MenuNum5--;}
			}
		});
		
		Plus5.setBounds(595, 423, 20, 20);
		Plus5.setBorderPainted(false);
		Plus5.setContentAreaFilled(false);
		Plus5.setFocusPainted(false);
		Plus5.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				MenuNum5++;MenuxPrice5+=MenuPrice5;
				MenuPrice+=MenuPrice5;
			}
		});
		
		delete5.setBounds(25,423,50,20);
		delete5.setBorderPainted(false);
		delete5.setContentAreaFilled(false);
		delete5.setFocusPainted(false);
		delete5.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(Menu5.equals("�����")) Food1 = false;
				else if(Menu5.equals("��¥��")) Food2 = false;
				else if(Menu5.equals("������")) Food3 = false;
				else if(Menu5.equals("�ø�"))  Food4 = false;
				else if(Menu5.equals("���ĵκ�")) Food5 = false;
				else if(Menu5.equals("������")) Food6 = false;
				else if(Menu5.equals("���쵤��")) Food7 = false;
				else if(Menu5.equals("�쵿")) Food8 = false;
				else if(Menu5.equals("��������")) Food9 = false;
				else if(Menu5.equals("�����")) Food10 = false;
				else if(Menu5.equals("«��")) Food11 = false;
				else if(Menu5.equals("������")) Food12 = false;
				
				MenuxPrice5 = 0; Menu5=null;
				MenuPrice-=MenuPrice5*MenuNum5;MenuNum5=0;MenuPrice5=0;MenuNumber--;
				delete5.setVisible(false);Plus5.setVisible(false);Minus5.setVisible(false);
			}
		});
		Minus6.setBounds(505, 495 , 20, 20);
		Minus6.setBorderPainted(false);
		Minus6.setContentAreaFilled(false);
		Minus6.setFocusPainted(false);
		Minus6.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(MenuNum6 !=1) {MenuPrice-=MenuPrice6;MenuxPrice6-=MenuPrice6;MenuNum6--;}
			}
		});
		
		Plus6.setBounds(595, 495, 20, 20);
		Plus6.setBorderPainted(false);
		Plus6.setContentAreaFilled(false);
		Plus6.setFocusPainted(false);
		Plus6.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				MenuNum6++;MenuxPrice6+=MenuPrice6;
				MenuPrice+=MenuPrice6;
			}
		});
		
		delete6.setBounds(25,495,50,20);
		delete6.setBorderPainted(false);
		delete6.setContentAreaFilled(false);
		delete6.setFocusPainted(false);
		delete6.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(Menu6.equals("�����")) Food1 = false;
				else if(Menu6.equals("��¥��")) Food2 = false;
				else if(Menu6.equals("������")) Food3 = false;
				else if(Menu6.equals("�ø�"))  Food4 = false;
				else if(Menu6.equals("���ĵκ�")) Food5 = false;
				else if(Menu6.equals("������")) Food6 = false;
				else if(Menu6.equals("���쵤��")) Food7 = false;
				else if(Menu6.equals("�쵿")) Food8 = false;
				else if(Menu6.equals("��������")) Food9 = false;
				else if(Menu6.equals("�����")) Food10 = false;
				else if(Menu6.equals("«��")) Food11 = false;
				else if(Menu6.equals("������")) Food12 = false;
				
				MenuxPrice6 = 0; Menu6=null;
				MenuPrice-=MenuPrice6*MenuNum6;MenuNum6=0;MenuPrice6=0;MenuNumber--;
				delete6.setVisible(false);Plus6.setVisible(false);Minus6.setVisible(false);
			}
		});
		Minus7.setBounds(505, 567 , 20, 20);
		Minus7.setBorderPainted(false);
		Minus7.setContentAreaFilled(false);
		Minus7.setFocusPainted(false);
		Minus7.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(MenuNum7 !=1) {MenuPrice-=MenuPrice7;MenuxPrice7-=MenuPrice7;MenuNum7--;}
			}
		});
		
		Plus7.setBounds(595, 567, 20, 20);
		Plus7.setBorderPainted(false);
		Plus7.setContentAreaFilled(false);
		Plus7.setFocusPainted(false);
		Plus7.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				MenuNum7++;MenuxPrice7+=MenuPrice7;
				MenuPrice+=MenuPrice7;
			}
		});
		
		delete7.setBounds(25,567,50,20);
		delete7.setBorderPainted(false);
		delete7.setContentAreaFilled(false);
		delete7.setFocusPainted(false);
		delete7.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(Menu7.equals("�����")) Food1 = false;
				else if(Menu7.equals("��¥��")) Food2 = false;
				else if(Menu7.equals("������")) Food3 = false;
				else if(Menu7.equals("�ø�"))  Food4 = false;
				else if(Menu7.equals("���ĵκ�")) Food5 = false;
				else if(Menu7.equals("������")) Food6 = false;
				else if(Menu7.equals("���쵤��")) Food7 = false;
				else if(Menu7.equals("�쵿")) Food8 = false;
				else if(Menu7.equals("��������")) Food9 = false;
				else if(Menu7.equals("�����")) Food10 = false;
				else if(Menu7.equals("«��")) Food11 = false;
				else if(Menu7.equals("������")) Food12 = false;
				
				MenuxPrice7 = 0; Menu7=null;
				MenuPrice-=MenuPrice7*MenuNum7;MenuNum7=0;MenuPrice7=0;MenuNumber--;
				delete7.setVisible(false);Plus7.setVisible(false);Minus7.setVisible(false);
			}
		});
		Minus8.setBounds(505, 639 , 20, 20);
		Minus8.setBorderPainted(false);
		Minus8.setContentAreaFilled(false);
		Minus8.setFocusPainted(false);
		Minus8.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(MenuNum8 !=1) {MenuPrice-=MenuPrice8;MenuxPrice8-=MenuPrice8;MenuNum8--;}
			}
		});
		
		Plus8.setBounds(595, 639, 20, 20);
		Plus8.setBorderPainted(false);
		Plus8.setContentAreaFilled(false);
		Plus8.setFocusPainted(false);
		Plus8.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				MenuNum8++;MenuxPrice8+=MenuPrice8;
				MenuPrice+=MenuPrice8;
			}
		});
		
		delete8.setBounds(25,639,50,20);
		delete8.setBorderPainted(false);
		delete8.setContentAreaFilled(false);
		delete8.setFocusPainted(false);
		delete8.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(Menu8.equals("�����")) Food1 = false;
				else if(Menu8.equals("��¥��")) Food2 = false;
				else if(Menu8.equals("������")) Food3 = false;
				else if(Menu8.equals("�ø�"))  Food4 = false;
				else if(Menu8.equals("���ĵκ�")) Food5 = false;
				else if(Menu8.equals("������")) Food6 = false;
				else if(Menu8.equals("���쵤��")) Food7 = false;
				else if(Menu8.equals("�쵿")) Food8 = false;
				else if(Menu8.equals("��������")) Food9 = false;
				else if(Menu8.equals("�����")) Food10 = false;
				else if(Menu8.equals("«��")) Food11 = false;
				else if(Menu8.equals("������")) Food12 = false;
				
				MenuxPrice8 = 0; Menu8=null;
				MenuPrice-=MenuPrice8*MenuNum8;MenuNum8=0;MenuPrice8=0;MenuNumber--;
				delete8.setVisible(false);Plus8.setVisible(false);Minus8.setVisible(false);
			}
		});
		Minus9.setBounds(505, 711 , 20, 20);
		Minus9.setBorderPainted(false);
		Minus9.setContentAreaFilled(false);
		Minus9.setFocusPainted(false);
		Minus9.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(MenuNum9 !=1) {MenuPrice-=MenuPrice9;MenuxPrice9-=MenuPrice9;MenuNum9--;}
			}
		});
		
		Plus9.setBounds(595, 711, 20, 20);
		Plus9.setBorderPainted(false);
		Plus9.setContentAreaFilled(false);
		Plus9.setFocusPainted(false);
		Plus9.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				MenuNum9++;MenuxPrice9+=MenuPrice9;
				MenuPrice+=MenuPrice9;
			}
		});
		
		delete9.setBounds(25,711,50,20);
		delete9.setBorderPainted(false);
		delete9.setContentAreaFilled(false);
		delete9.setFocusPainted(false);
		delete9.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(Menu9.equals("�����")) Food1 = false;
				else if(Menu9.equals("��¥��")) Food2 = false;
				else if(Menu9.equals("������")) Food3 = false;
				else if(Menu9.equals("�ø�"))  Food4 = false;
				else if(Menu9.equals("���ĵκ�")) Food5 = false;
				else if(Menu9.equals("������")) Food6 = false;
				else if(Menu9.equals("���쵤��")) Food7 = false;
				else if(Menu9.equals("�쵿")) Food8 = false;
				else if(Menu9.equals("��������")) Food9 = false;
				else if(Menu9.equals("�����")) Food10 = false;
				else if(Menu9.equals("«��")) Food11 = false;
				else if(Menu9.equals("������")) Food12 = false;
				
				MenuxPrice9 = 0; Menu9=null;
				MenuPrice-=MenuPrice9*MenuNum9; MenuNum9=0;MenuPrice9=0;MenuNumber--;
				delete9.setVisible(false);Plus9.setVisible(false);Minus9.setVisible(false);
			}
		});
		
		LastOrderButton.setBounds(220, 700, 204, 58);
		LastOrderButton.setBorderPainted(false);
		LastOrderButton.setContentAreaFilled(false);
		LastOrderButton.setFocusPainted(false);
		LastOrderButton.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				OrderEnding=false; ol.LastOrderScreen = true; 
				LastOrderButton.setVisible(false);
				MyMenu = null; MenuPrice = 0; // �޴����� 
				Menu1=null;Menu2=null;Menu3=null;Menu4=null;Menu5=null;Menu6=null;Menu7=null;Menu8=null;Menu9=null;
				MenuPrice1=0;MenuPrice2=0;MenuPrice3=0;MenuPrice4=0;MenuPrice5=0;MenuPrice6=0;MenuPrice7=0;MenuPrice8=0;MenuPrice9=0;
				MenuxPrice1=0;MenuxPrice2=0;MenuxPrice3=0;MenuxPrice4=0;MenuxPrice5=0;MenuxPrice6=0;MenuxPrice7=0;MenuxPrice8=0;MenuxPrice9=0;
				MenuNum1=0;MenuNum2=0;MenuNum3=0;MenuNum4=0;MenuNum5=0;MenuNum6=0;MenuNum7=0;MenuNum8=0;MenuNum9=0;
				MenuNumber = 0;Food1=false;Food2=false;Food3=false;Food4=false;Food5=false;Food6=false;
				Food7=false;Food8=false;Food9=false;Food10=false;Food11=false;Food12=false;	
				
				ol.Link(MyID);	// ���� �ֹ� ��� 
			}
		});
		
		YesButton.setBounds(190, 490, 100, 50);
		YesButton.setBorderPainted(false);
		YesButton.setContentAreaFilled(false);
		YesButton.setFocusPainted(false);
		YesButton.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				YesButton.setVisible(false);NoButton.setVisible(false);
				
				long time = System.currentTimeMillis(); 
				SimpleDateFormat dayTime = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
				String times = dayTime.format(new Date(time));
				
				if(Menu1!=null) MyMenu = Menu1+  MenuNum1+"��  /"; 
				if(Menu2!=null) MyMenu += Menu2+ MenuNum2+"�� /";
				if(Menu3!=null) MyMenu += Menu3+ MenuNum3+"�� /"; 
				if(Menu4!=null) MyMenu += Menu4+ MenuNum4+"�� /";
				if(Menu5!=null) MyMenu += Menu5+ MenuNum5+"�� /"; 
				if(Menu6!=null) MyMenu += Menu6+ MenuNum6+"�� /";
				if(Menu7!=null) MyMenu += Menu7+ MenuNum7+"�� /"; 
				if(Menu8!=null) MyMenu += Menu8+ MenuNum8+"�� /";
				if(Menu9!=null) MyMenu += Menu9+ MenuNum9+"�� /"; 
				
				if(MyMenu!=null) 
				{
					new BasketShopping(times,MyMenu,MenuPrice,MyID);OrderEnding = true; ShoppingBasket = false;
				}
				ConfirmOrder = false;
				System.out.println(times+" "+MenuPrice+" "+ MyID+" "+MyMenu);
			}
		});	
		NoButton.setBounds(330, 490, 100, 50);
		NoButton.setBorderPainted(false);
		NoButton.setContentAreaFilled(false);
		NoButton.setFocusPainted(false);
		NoButton.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				ConfirmOrder = false; YesButton.setVisible(false);NoButton.setVisible(false);
			}
		});
		
		Ordering.setBounds(350, 810, 219, 45);
		Ordering.setBorderPainted(false);
		Ordering.setContentAreaFilled(false);
		Ordering.setFocusPainted(false);
		Ordering.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e) 
			{
				if(Menu1!=null||Menu2!=null||Menu3!=null||Menu4!=null||
				Menu5!=null||Menu5!=null||Menu7!=null||Menu8!=null||Menu9!=null) 
					{ConfirmOrder = true;YesButton.setVisible(true);NoButton.setVisible(true);}
			}
		});		
	}
	
	public void paint(Graphics g)
	{
		screenImage = createImage(630,860);
		screenGraphic = screenImage.getGraphics();
		screenDraw((Graphics2D)screenGraphic);
		g.drawImage(screenImage,0,0,null);
	}
	
	public void screenDraw(Graphics2D g)
	{
		screenGraphic =screenImage.getGraphics();
		g.drawImage(screenImage,0,0,null);
		
		if(loginScreen==true) // �α��� ȭ��
		{
			
			IDInput.setVisible(true);
			PWInput.setVisible(true);
			
			add(loginButton);
			add(MemberButton);
			loginButton.setVisible(true);
			MemberButton.setVisible(true);
			Confirmbutton1.setVisible(false);
			Confirmbutton2.setVisible(false);
			g.drawImage(background, 0, 0, null);
			
			if(NotRegistAlert==true)	// ��ϵ��� ���� ����
			{
				IDInput.setVisible(false);
				PWInput.setVisible(false);
				Confirmbutton1.setVisible(true);
				g.drawImage(NotRegist,170,400,null);
			}
			
			else if(DifferentPWAlert==true)	// ��й�ȣ �߸� �Է�
			{
				IDInput.setVisible(false);
				PWInput.setVisible(false);
				Confirmbutton2.setVisible(true);
				g.drawImage(Differentpw,170,400,null);
			}
			
		}
		
		if(MemberScreen==true) // ȸ������ ȭ��
		{
			g.drawImage(Memberbackground,0,0,null);
			
			Regist_ID.setVisible(true);
			Regist_PW.setVisible(true);
			Regist_RePW.setVisible(true);
			Regist_name.setVisible(true);
			Regist_phone.setVisible(true);
			Regist_address.setVisible(true);
			
			Confirmbuttonx.setVisible(false);
			Confirmbutton.setVisible(false);
			CancelButton.setVisible(true);
			RegistMemberButton.setVisible(true);
			ConfirmIDButton.setVisible(true);
			
			if(PleaseInput==true)			// �������� �Է� ���ҽ�
			{
				Regist_ID.setVisible(false);
				Regist_PW.setVisible(false);
				Regist_RePW.setVisible(false);
				Regist_name.setVisible(false);
				Regist_phone.setVisible(false);
				Regist_address.setVisible(false);
				g.drawImage(PleaseInputScreen,150,400,null);
				Confirmbutton.setVisible(true);
			}
			
			if(WrongPwScreen==true)			// ��й�ȣ Ȯ�� �߸� �Է½�
			{
				Regist_ID.setVisible(false);
				Regist_PW.setVisible(false);
				Regist_RePW.setVisible(false);
				Regist_name.setVisible(false);
				Regist_phone.setVisible(false);
				Regist_address.setVisible(false);
				g.drawImage(Confirmpw,150,400,null);
				Confirmbutton.setVisible(true);
			}
			
			if(pleaseConfirm==true)  // ���̵� �˻� ���Ҷ�
			{
				Regist_ID.setVisible(false);
				Regist_PW.setVisible(false);
				Regist_RePW.setVisible(false);
				Regist_name.setVisible(false);
				Regist_phone.setVisible(false);
				Regist_address.setVisible(false);
				g.drawImage(WrongID,150,400,null);
				Confirmbutton.setVisible(true);
			}
			
			if(pleaseID==true)	// ���̵� �ߺ��� ������
			{
				Regist_ID.setVisible(false);
				Regist_PW.setVisible(false);
				Regist_RePW.setVisible(false);
				Regist_name.setVisible(false);
				Regist_phone.setVisible(false);
				Regist_address.setVisible(false);
				g.drawImage(OverlapID,150,400,null);
				Confirmbutton.setVisible(true);
			}
			
			if(correctID==true)	// �ߺ��� ���̵� ������
			{
				Regist_ID.setVisible(false);
				Regist_PW.setVisible(false);
				Regist_RePW.setVisible(false);
				Regist_name.setVisible(false);
				Regist_phone.setVisible(false);
				Regist_address.setVisible(false);
				g.drawImage(OverlapIDX,150,400,null);
				Confirmbuttonx.setVisible(true);
			}
		}
		
		if(orderScreen==true) // �ֹ�ȭ��
		{
			LogoutButton.setVisible(true);
			
			add(LogoutButton);
			add(OrderlistButton);
			OrderlistButton.setVisible(true);
			add(RightButton1);add(LeftButton1);
			DoOrder.setVisible(true);
			
			if(order.page1==true)
			{
				Order1.setVisible(true);Order2.setVisible(true);Order3.setVisible(true);Order4.setVisible(true);
				Order5.setVisible(false);Order6.setVisible(false);Order7.setVisible(false);Order8.setVisible(false);
				Order9.setVisible(false);Order10.setVisible(false);Order11.setVisible(false);Order12.setVisible(false);
			}
			if(order.page2==true)
			{
				Order1.setVisible(false);Order2.setVisible(false);Order3.setVisible(false);Order4.setVisible(false);
				Order5.setVisible(true);Order6.setVisible(true);Order7.setVisible(true);Order8.setVisible(true);
				Order9.setVisible(false);Order10.setVisible(false);Order11.setVisible(false);Order12.setVisible(false);
			}
			if(order.page3==true)
			{
				Order1.setVisible(false);Order2.setVisible(false);Order3.setVisible(false);Order4.setVisible(false);
				Order5.setVisible(false);Order6.setVisible(false);Order7.setVisible(false);Order8.setVisible(false);
				Order9.setVisible(true);Order10.setVisible(true);Order11.setVisible(true);Order12.setVisible(true);
			}
			
			order.screenDraw(g);
			
			if(OrAlert==true)
			{
				g.drawImage(OrderAlert,170,400,null);
				OrderConfirm.setVisible(true);
				
			}
			if(Over==true)
			{
				g.drawImage(OverOrder,170,400,null);
				OverOrderConfirm.setVisible(true);
			}
			if(OverLap==true)
			{
				g.drawImage(Overlap,170,400,null);
				OverLapConfirm.setVisible(true);
			}
		}
		
		if(ol.LastOrderScreen == true) // ���� �ֹ� ȭ��
		{
			ol.screenDraw(g);
			add(OrderButton);
			LogoutButton.setVisible(true);
			OrderButton.setVisible(true);
		}
		
		if(ShoppingBasket == true)	// ��ٱ��� ȭ��
		{
			g.drawImage(OrderScreen, 0, 0, null);
			g.setColor(Color.black);
			g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
			g.setFont(new Font("�ü�ü",Font.BOLD,20));
			MenuADD.setVisible(true);Ordering.setVisible(true);
			
			if(Menu1!=null)
			{
				
				g.drawImage(OrderMenu,0,90,null);
				g.drawString(Menu1,30,120);
				g.drawString("��",600,120);
				if(MenuxPrice1!=0 && MenuxPrice1<10000) g.drawString(""+MenuxPrice1,550,120);
				else if(MenuxPrice1<100000 && MenuxPrice1>=10000) g.drawString(""+MenuxPrice1,540,120);
				else if(MenuxPrice1>=100000 && MenuxPrice1<1000000) g.drawString(""+MenuxPrice1,530,120);
				else g.drawString(""+MenuxPrice1,525,120);	
				
				g.drawImage(Blank,500,130,null);
				g.setColor(Color.red);
				if(MenuNum1<10) g.drawString(""+MenuNum1,554,152);
				else if(MenuNum1>=10) g.drawString(""+MenuNum1,550,152);
				add(Plus1);add(Minus1);Plus1.setVisible(true);Minus1.setVisible(true);
				add(delete1);delete1.setVisible(true);
			}
			if(Menu2!=null)
			{
				g.setColor(Color.black);
				g.drawImage(OrderMenu,0,162,null);
				g.drawString(Menu2,30,192);
				g.drawString("��",600,192);
				if(MenuxPrice2!=0 && MenuxPrice2<10000) g.drawString(""+MenuxPrice2,550,192);
				else if(MenuxPrice2<100000 && MenuxPrice2>=10000) g.drawString(""+MenuxPrice2,540,192);
				else if(MenuxPrice2>=100000 && MenuxPrice2<1000000)g.drawString(""+MenuxPrice2,530,192);
				else g.drawString(""+MenuxPrice2,525,192);
				
				g.drawImage(Blank,500,202,null);
				g.setColor(Color.red);
				if(MenuNum2<10) g.drawString(""+MenuNum2,554,224);
				else if(MenuNum2>=10) g.drawString(""+MenuNum2,550,224);
				add(Plus2);add(Minus2);Plus2.setVisible(true);Minus2.setVisible(true);
				add(delete2);delete2.setVisible(true);
			}
			if(Menu3!=null)
			{
				g.setColor(Color.black);
				g.drawImage(OrderMenu,0,234,null);
				g.drawString(Menu3,30,264);
				g.drawString("��",600,264);
				if(MenuxPrice3!=0 && MenuxPrice3<10000) g.drawString(""+MenuxPrice3,550,264);
				else if(MenuxPrice3<100000 && MenuxPrice3>=10000) g.drawString(""+MenuxPrice3,540,264);
				else if(MenuxPrice3>=100000 && MenuxPrice3<1000000) g.drawString(""+MenuxPrice3,530,264);
				else g.drawString(""+MenuxPrice3,525,264);
				
				g.drawImage(Blank,500,274,null);
				g.setColor(Color.red);
				if(MenuNum3<10)g.drawString(""+MenuNum3,554,296);
				else if(MenuNum3>=10) g.drawString(""+MenuNum3,550,296);
				add(Plus3);add(Minus3);Plus3.setVisible(true);Minus3.setVisible(true);
				add(delete3);delete3.setVisible(true);
			}
			if(Menu4!=null)
			{
				g.setColor(Color.black);
				g.drawImage(OrderMenu,0,306,null);
				g.drawString(Menu4,30,336);
				g.drawString("��",600,336);
				if(MenuxPrice4!=0 && MenuxPrice4<10000) g.drawString(""+MenuxPrice4,550,336);
				else if(MenuxPrice4<100000 && MenuxPrice4>=10000) g.drawString(""+MenuxPrice4,540,336);
				else if(MenuxPrice4>=100000 && MenuxPrice4<1000000) g.drawString(""+MenuxPrice4,530,336);
				else  g.drawString(""+MenuxPrice4,525,336);
				
				g.drawImage(Blank,500,346,null);
				g.setColor(Color.red);
				if(MenuNum4<10)g.drawString(""+MenuNum4,554,368);
				else if(MenuNum4>=10) g.drawString(""+MenuNum4,550,368);
				add(Plus4);add(Minus4);Plus4.setVisible(true);Minus4.setVisible(true);
				add(delete4);delete4.setVisible(true);
			}
			if(Menu5!=null)
			{
				g.setColor(Color.black);
				g.drawImage(OrderMenu,0,378,null);
				g.drawString(Menu5,30,408);
				g.drawString("��",600,408);
				if(MenuxPrice5!=0 && MenuxPrice5<10000) g.drawString(""+MenuxPrice5,550,408);
				else if(MenuxPrice5<100000 && MenuxPrice5>=10000) g.drawString(""+MenuxPrice5,540,408);
				else if(MenuxPrice5>=100000 && MenuxPrice5<1000000) g.drawString(""+MenuxPrice5,530,408);
				else  g.drawString(""+MenuxPrice5,525,408);
				
				g.drawImage(Blank,500,418,null);
				g.setColor(Color.red);
				if(MenuNum5<10)g.drawString(""+MenuNum5,554,440);
				else if(MenuNum5>=10) g.drawString(""+MenuNum5,550,440);
				add(Plus5);add(Minus5);Plus5.setVisible(true);Minus5.setVisible(true);
				add(delete5);delete5.setVisible(true);
			}
			if(Menu6!=null)
			{
				g.setColor(Color.black);
				g.drawImage(OrderMenu,0,450,null);
				g.drawString(Menu6,30,480);
				g.drawString("��",600,480);
				if(MenuxPrice6!=0 && MenuxPrice6<10000) g.drawString(""+MenuxPrice6,550,480);
				else if(MenuxPrice6<100000 && MenuxPrice6>=10000) g.drawString(""+MenuxPrice6,540,480);
				else if(MenuxPrice6>=100000 && MenuxPrice6<1000000) g.drawString(""+MenuxPrice6,530,480);
				else  g.drawString(""+MenuxPrice6,525,480);
				
				g.drawImage(Blank,500,490,null);
				g.setColor(Color.red);
				if(MenuNum6<10)g.drawString(""+MenuNum6,554,512);
				else if(MenuNum6>=10) g.drawString(""+MenuNum6,550,512);
				add(Plus6);add(Minus6);Plus6.setVisible(true);Minus6.setVisible(true);
				add(delete6);delete6.setVisible(true);
			}
			if(Menu7!=null)
			{
				g.setColor(Color.black);
				g.drawImage(OrderMenu,0,522,null);
				g.drawString(Menu7,30,554);
				g.drawString("��",600,554);
				if(MenuxPrice7!=0 && MenuxPrice7<10000) g.drawString(""+MenuxPrice7,550,554);
				else if(MenuxPrice7<100000 && MenuxPrice7>=10000) g.drawString(""+MenuxPrice7,540,554);
				else if(MenuxPrice7>=100000 && MenuxPrice7<1000000) g.drawString(""+MenuxPrice7,530,554);
				else  g.drawString(""+MenuxPrice7,525,554);
				
				g.drawImage(Blank,500,562,null);
				g.setColor(Color.red);
				if(MenuNum7<10)g.drawString(""+MenuNum7,554,585);
				else if(MenuNum7>=10) g.drawString(""+MenuNum7,550,585);
				add(Plus7);add(Minus7);Plus7.setVisible(true);Minus7.setVisible(true);
				add(delete7);delete7.setVisible(true);
			}
			if(Menu8!=null)
			{
				g.setColor(Color.black);
				g.drawImage(OrderMenu,0,594,null);
				g.drawString(Menu8,30,626);
				g.drawString("��",600,626);
				if(MenuPrice8!=0 && MenuxPrice8<10000) g.drawString(""+MenuxPrice8,550,626);
				else if(MenuxPrice8<100000 && MenuxPrice8>=10000) g.drawString(""+MenuxPrice8,540,626);
				else if(MenuxPrice8>=100000 && MenuxPrice8<1000000) g.drawString(""+MenuxPrice8,530,626);
				else  g.drawString(""+MenuxPrice8,525,626);
				
				g.drawImage(Blank,500,634,null);
				g.setColor(Color.red);
				if(MenuNum8<10)g.drawString(""+MenuNum8,554,657);
				else if(MenuNum8>=10) g.drawString(""+MenuNum8,550,657);
				add(Plus8);add(Minus8);Plus8.setVisible(true);Minus8.setVisible(true);
				add(delete8);delete8.setVisible(true);
			}
			if(Menu9!=null)
			{
				g.setColor(Color.black);
				g.drawImage(OrderMenu,0,666,null);
				g.drawString(Menu9,30,698);
				g.drawString("��",600,698);
				if(MenuxPrice9!=0 && MenuxPrice9<10000) g.drawString(""+MenuxPrice9,550,698);
				else if(MenuxPrice9<100000 && MenuxPrice9>=10000) g.drawString(""+MenuxPrice9,540,698);
				else if(MenuxPrice9>=100000 && MenuxPrice9<1000000)g.drawString(""+MenuxPrice9,530,698);
				else g.drawString(""+MenuxPrice9,525,698);
				
				g.drawImage(Blank,500,706,null);
				g.setColor(Color.red);
				if(MenuNum8<10)g.drawString(""+MenuNum9,554,729);
				else if(MenuNum8>=10) g.drawString(""+MenuNum9,550,729);
				add(Plus9);add(Minus9);Plus9.setVisible(true);Minus9.setVisible(true);
				add(delete9);delete9.setVisible(true);
			}
			
			g.setColor(Color.red);
			g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
			g.setFont(new Font("�ü�ü",Font.BOLD,20));
			g.drawString("�հ�",30,780);
			g.setFont(new Font("�ü�ü",Font.BOLD,30));
			if(MenuPrice==0) g.drawString(""+MenuPrice,565,780);
			else if (MenuPrice!=0 && MenuPrice<10000) g.drawString(""+MenuPrice,520,780);
			else if (MenuPrice>=10000 && MenuPrice< 100000) g.drawString(""+MenuPrice,500,780);
			else if (MenuPrice>=100000 && MenuPrice< 1000000) g.drawString(""+MenuPrice,480,780);
			else g.drawString(""+MenuPrice,460,780);
			
			g.drawString("��",590,780);
			
			if(ConfirmOrder==true)
			{
				add(YesButton);add(NoButton);
				g.drawImage(ConfirmOr,150,400,null);
			}
		}
		
		if(OrderEnding == true) // �ֹ��Ϸ� ȭ��
		{
			g.drawImage(OrderEnd,0,0,null);
			MenuADD.setVisible(false); Ordering.setVisible(false);
			Minus1.setVisible(false);Plus1.setVisible(false);Minus2.setVisible(false);Plus2.setVisible(false);
			Minus3.setVisible(false);Plus3.setVisible(false);Minus4.setVisible(false);Plus4.setVisible(false);
			Minus5.setVisible(false);Plus5.setVisible(false);Minus6.setVisible(false);Plus6.setVisible(false);
			Minus7.setVisible(false);Plus7.setVisible(false);Minus8.setVisible(false);Plus8.setVisible(false);
			Minus9.setVisible(false);Plus9.setVisible(false);
			delete1.setVisible(false);delete2.setVisible(false);delete3.setVisible(false);delete4.setVisible(false);
			delete5.setVisible(false);delete6.setVisible(false);delete7.setVisible(false);delete8.setVisible(false);delete9.setVisible(false);
			add(LastOrderButton);
			LastOrderButton.setVisible(true);
			g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
			g.setFont(new Font("Gothic",Font.BOLD,20));
			g.setColor(Color.black);
			
			//���ڿ� ũ��� ������ 
			if(MyMenu.length()>35)
			{
				String Me1nu,Me2nu;
				Me1nu = MyMenu.substring(0,35);
				Me2nu = MyMenu.substring(35,MyMenu.length());
				g.drawString(Me1nu,50,540);
				g.drawString(Me2nu,50,570);
			}
			else if(MyMenu.length()<=35) g.drawString(MyMenu,50,540);
			
			g.setFont(new Font("�ü�ü",Font.BOLD,20));
			if(MyAddress.length()>30)
			{
				String Address1,Address2;
				Address1 = MyAddress.substring(0, 30);
				Address2 = MyAddress.substring(30,MyAddress.length());
				g.drawString(Address1,50,440);
				g.drawString(Address2, 50,470);
			}
			else if(MyAddress.length()<=30) g.drawString(MyAddress,50,440);
			
			g.drawString(""+MenuPrice,500,640);
			
		}
		
		repaint();
		paintComponents(g);

	}
}
