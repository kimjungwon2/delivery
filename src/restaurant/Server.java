package restaurant;

import java.io.*;
import java.net.*;
import java.util.*;


import java.sql.*;

public class Server 
{
	ArrayList<PerClient> clientList = new ArrayList<PerClient>();

	public static void main(String[] args) 
	{
		ServerGUI SG=new ServerGUI();
		Server server = new Server();
	}
	
	public Server() 
	{
		try {
			ServerSocket serverSocket1 = new ServerSocket(5000);
			
			while (true) 
			{ 
				Socket socket = serverSocket1.accept();
				PerClient client = new PerClient(this, socket);
				addClient(client);
				Thread thread = new Thread(client);
				thread.start();
			}
		}
		catch (UnknownHostException e) { e.printStackTrace(); }
		catch (IOException e) { e.printStackTrace(); }
	}
	
	synchronized void addClient(PerClient client) {
		clientList.add(client);
	}
	
	synchronized void removeClient(PerClient client) {
		clientList.remove(client);
	}
}

class PerClient implements Runnable 
{
	
	Server server;
	Socket socket;
	BufferedReader reader;
	PrintWriter writer;
	EffectMusic Effect = new EffectMusic("띵동~.wav");
	
	public PerClient(Server server, Socket socket) 
	{
		this.server = server;
		this.socket = socket;
		
		try {
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			writer = new PrintWriter(socket.getOutputStream());
		} catch (IOException e) { e.printStackTrace(); }
		
	}
	
	public void run() 
	{
		String name = null;
		Connection conn = null;
		ResultSet rs = null;
		String subst = null;
		String music = null;
		String list = null;
		
		String send_id=null;
		String send_pw=null;
		String send_name=null;
		String send_address=null;
		String send_phoneno=null;
		String number=null;String time=null;String address=null;String menulist=null;int price;
		int ListNum = 0;
		try {
			name = reader.readLine();
			System.out.println(name);
			
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/malldb?useSSL=false","root","raincar");
			
			Statement st = null;
			
			st=conn.createStatement();
			
			subst=name.substring(0,6);
			music=name.substring(0, 21);
			list=name.substring(0, 9);

			if(subst.equals("insert")) // insert
			{
				if(music.equals("insert into orderinfo")) Effect.startPlay(); // 주문 접수시 효과음 발생
				st.executeUpdate(name); 
			}
			
			else if(subst.equals("SELECT"))// id pw 로그인정보 얻음
			{
				if(list.equals("SELECT oi"))
				{
					rs = st.executeQuery(name);
					
					while(rs.next()&&(ListNum!=7))
					{
						number = rs.getString("number");
						time= rs.getString("time");
						address = rs.getString("address");
						menulist = rs.getString("menulist");
						price = rs.getInt("price");
						
						writer.println(number);
						writer.flush();
						writer.println(time);
						writer.flush();
						writer.println(address);
						writer.flush();
						writer.println(menulist);
						writer.flush();
						writer.println(price);
						writer.flush();
						ListNum++;
					}
				}
				
				else
				{
				rs = st.executeQuery(name); 
				
					if(rs.next())
					{
						send_id = rs.getString("id");
						send_pw = rs.getString("pw");
						send_name = rs.getString("name");
						send_address = rs.getString("address");
						send_phoneno = rs.getString("phoneno");
						
						writer.println(send_id);
						writer.flush();
						writer.println(send_pw);
						writer.flush();
						writer.println(send_name);
						writer.flush();
						writer.println(send_address);
						writer.flush();
						writer.println(send_phoneno);
						writer.flush();
					}
				}
			}
		}
		catch (IOException e) { System.out.println(name+"\'s connection closed...");} 
		catch (ClassNotFoundException e) {e.printStackTrace();} 
		catch (SQLException e) {e.printStackTrace();}
		finally {
			server.removeClient(this);			
			try {socket.close();} 
			catch (IOException e) { e.printStackTrace(); }
		}
	}
	
	public void send(String str) {
		writer.println(str);
		writer.flush();
	}
}
