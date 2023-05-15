package restaurant;

import java.io.*;
import javax.swing.*;

public class MemberRegist
{
	private JTextField ID;
	private JTextField pw;
	private JTextField name;
	private JTextField repw;
	private JTextField phoneno;
	private JTextField address;
	
	public String R_ID;
	public String R_PW;
	public String R_NAME;
	public String R_PHONE;
	public String R_ADDRESS;
	
	public MemberRegist(JTextField ID, JTextField pw,JTextField repw,JTextField name,JTextField phoneno,JTextField address)
	{
		this.ID = ID;
		this.pw = pw;
		this.repw = repw;
		this.name = name;
		this.phoneno = phoneno;
		this.address = address;
		
		R_ID = ID.getText(); //ID
		R_PW = pw.getText(); //PW
		R_NAME = name.getText(); //NAME
		R_PHONE = phoneno.getText(); //PHONE
		R_ADDRESS = address.getText(); //ADDRESS
	}
	
	public int VerifyPW()
	{
		String password = pw.getText();
		String Repassword = repw.getText();
		
		if(password.equals(Repassword))
		{
			return 1;
		}
		else return 0;
	}
	
	
}
