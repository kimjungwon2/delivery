package restaurant;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.*;

public class Login 
{
	private JTextField ID;
	private JTextField pw;
	
	String s_id;
	String s_pw;
	String JQuery;
	String r_id = null;
	String r_pw = null;
	String r_name = null;
	String r_address = null;
	String r_phoneno = null;
	
	boolean NotRegist = false;
	boolean DifferentPW = false;
	boolean PassLogin = false;
	
	Login(JTextField ID, JTextField pw)
	{
		this.ID = ID;
		this.pw = pw;
		
		s_id = ID.getText();
		s_pw = pw.getText();
		
		try{
			Socket socket = new Socket("127.0.0.1",5000);
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			BufferedReader reader =new BufferedReader(new InputStreamReader(socket.getInputStream()));
			JQuery = "SELECT* FROM customerinfo WHERE id='"+s_id+"';";
			
			writer.println(JQuery);
			writer.flush();
			
			r_id = reader.readLine();
			r_pw = reader.readLine();
			r_name = reader.readLine();
			r_address = reader.readLine();
			r_phoneno = reader.readLine();
							
			System.out.println(JQuery);
			System.out.println("id="+r_id);
			System.out.println("pw="+r_pw);
			System.out.println("name="+r_name);
			System.out.println("address="+r_address);
			System.out.println("phoneno="+r_phoneno);
			socket.close();
			
			if(r_id==null)	// 회원계정이 없을때
			{
				NotRegist = true;
			}
			
			else if(!s_pw.equals(r_pw))	// 입력 비밀번호가 다를경우 
			{
				DifferentPW = true;
			}
			else if(s_id.equals(r_id) && s_pw.equals(r_pw)) // 로그인이 성공
			{
				PassLogin = true;
			}
			
		}
		catch(UnknownHostException x){x.printStackTrace();}
		catch(FileNotFoundException x){x.printStackTrace();}
		catch(IOException x){x.printStackTrace();} 
	}
	

}
