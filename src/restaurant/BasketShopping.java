package restaurant;

import java.io.*;
import java.net.*;

public class BasketShopping {
	
	public BasketShopping(String time,String menulist,int price,String id)
	{
		String JQuery;
		
		try{
			Socket socket = new Socket("127.0.0.1",5000);
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			JQuery="insert into orderinfo (time, menulist, price, id) values ('"+time+"', "+"'"+menulist+"', "+"'"+price+"', "+"'"+id+"')"+";";

			writer.println(JQuery);
			writer.flush();
			
			socket.close();
			
		}
		catch(UnknownHostException x){x.printStackTrace();}
		catch(FileNotFoundException x){x.printStackTrace();}
		catch(IOException x){x.printStackTrace();} 
	}
	
}
