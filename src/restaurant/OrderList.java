package restaurant;

import java.awt.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class OrderList 
{
	
	boolean LastOrderScreen = false;
	
	private Image Listbackground= new ImageIcon(Client.class.getResource("../Images/LastorderBackground.png")).getImage();

	private String[] number = new String[7];
	private String[] time = new String[7];
	private String[] address = new String[7];
	private String[] menulist = new String[7];
	private String[] price = new String[7];
	int listNum = 0;
	
	public void Link(String MyID)
	{
		String JQuery = null;
		
		try{
			Socket socket = new Socket("127.0.0.1",5000);
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			BufferedReader reader =new BufferedReader(new InputStreamReader(socket.getInputStream()));
			JQuery = "SELECT oi.number,oi.time,ci.address,oi.menulist,oi.price"
					   +" FROM orderinfo AS oi"
					   +" JOIN customerinfo AS ci"
					   +" ON oi.id = ci.id"
					   +" WHERE oi.id='"+ MyID +"'"
					   +" order by oi.number desc;";
			
			writer.println(JQuery);
			writer.flush();
			
			do{
				number[listNum] = reader.readLine();
				time[listNum] = reader.readLine();
				address[listNum] = reader.readLine();
				menulist[listNum] = reader.readLine();
				price[listNum] = reader.readLine();
				listNum++;
			}while(listNum!=7);
			
		}
		catch(UnknownHostException x){x.printStackTrace();}
		catch(FileNotFoundException x){x.printStackTrace();}
		catch(IOException x){x.printStackTrace();} 
	}
		
	public void screenDraw(Graphics2D g)
	{
		g.drawImage(Listbackground, 0, 0, null);
		
		for(int x=0;x<7;x++)
		{
			if(number[x]!=null)
			{
				g.setColor(Color.black);
				g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
				g.setFont(new Font("Gothic",Font.BOLD,20));
				
				String time1 = time[x].substring(0,10);
				String time2 = time[x].substring(11,time[x].length());
			
				g.drawString(number[x], 10, 215+100*x);
				g.drawString(time1, 50, 205+100*x);
				g.drawString(time2, 60, 230+100*x);
			
				//주소
				g.setFont(new Font("Gothic",Font.BOLD,15));
				if(address[x].length()<=10) g.drawString(address[x],180,180+100*x);
				else if(address[x].length()>10 && address[x].length()<=20)
				{
					String Address1,Address2;
					Address1 = address[x].substring(0, 10);
					Address2 = address[x].substring(10,address[x].length());
					g.drawString(Address1,180,180+100*x);
					g.drawString(Address2, 180,205+100*x);
				}
				else if(address[x].length()>20 && address[x].length()<=30)
				{
					String Address1,Address2,Address3;
					Address1 = address[x].substring(0, 10);
					Address2 = address[x].substring(10,20);
					Address3 = address[x].substring(20,address[x].length());
					g.drawString(Address1,180,180+100*x);
					g.drawString(Address2, 180,205+100*x);
					g.drawString(Address3, 180,230+100*x);
				}
				else if(address[x].length()>30)
				{
					String Address1,Address2,Address3,Address4;
					Address1 = address[x].substring(0, 10);
					Address2 = address[x].substring(10,20);
					Address3 = address[x].substring(20,30);
					Address4 = address[x].substring(30,address[x].length());
					g.drawString(Address1,180,180+100*x);
					g.drawString(Address2, 180,205+100*x);
					g.drawString(Address3, 180,230+100*x);
					g.drawString(Address4, 180,255+100*x);
				}
				//메뉴
				if(menulist[x].length()<=15) g.drawString(menulist[x],340,180+100*x);
				else if(menulist[x].length()>15 && menulist[x].length()<=30)
				{
					String Menu1,Menu2;
					Menu1 = menulist[x].substring(0, 15);
					Menu2 = menulist[x].substring(15,menulist[x].length());
					g.drawString(Menu1,340,180+100*x);
					g.drawString(Menu2, 340,205+100*x);
				}
				else if(menulist[x].length()>30 && menulist[x].length()<=45)
				{
					String Menu1,Menu2,Menu3;
					Menu1 = menulist[x].substring(0, 15);
					Menu2 = menulist[x].substring(15,30);
					Menu3 = menulist[x].substring(30,menulist[x].length());
					g.drawString(Menu1, 340,180+100*x);
					g.drawString(Menu2, 340,205+100*x);
					g.drawString(Menu3, 340,230+100*x);
				}
				else if(menulist[x].length()>45)
				{
					String Menu1,Menu2,Menu3,Menu4;
					Menu1 = menulist[x].substring(0, 15);
					Menu2 = menulist[x].substring(15,30);
					Menu3 = menulist[x].substring(30,45);
					Menu4 = menulist[x].substring(45,menulist[x].length());
					g.drawString(Menu1, 340,180+100*x);
					g.drawString(Menu2, 340,205+100*x);
					g.drawString(Menu3, 340,230+100*x);
					g.drawString(Menu4, 340,255+100*x);
				}
				
				g.setFont(new Font("Gothic",Font.BOLD,20));
				if(price[x].length()<=4) g.drawString(price[x]+"원", 560, 215+100*x);
				else if(price[x].length()<=5)g.drawString(price[x]+"원", 550, 215+100*x);
				else if(price[x].length()<=6)g.drawString(price[x]+"원", 540, 215+100*x);
				else g.drawString(price[x]+"원", 530, 215+100*x);
			}
		}
	}
	
}
