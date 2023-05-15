package restaurant;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class Order 
{
	private Image Orderbackground= new ImageIcon(Client.class.getResource("../Images/OrderBackground.png")).getImage();
	private Image Food1= new ImageIcon(Client.class.getResource("../Images/자장면.jpg")).getImage();
	private Image Food2= new ImageIcon(Client.class.getResource("../Images/간짜장.jpg")).getImage();
	private Image Food3= new ImageIcon(Client.class.getResource("../Images/군만두.jpg")).getImage();
	private Image Food4= new ImageIcon(Client.class.getResource("../Images/냉면.jpg")).getImage();
	private Image Food5= new ImageIcon(Client.class.getResource("../Images/마파두부.jpg")).getImage();
	private Image Food6= new ImageIcon(Client.class.getResource("../Images/볶음밥.jpg")).getImage();
	private Image Food7= new ImageIcon(Client.class.getResource("../Images/새우덮밥.jpg")).getImage();
	private Image Food8= new ImageIcon(Client.class.getResource("../Images/우동.jpg")).getImage();
	private Image Food9= new ImageIcon(Client.class.getResource("../Images/제육덮밥.jpg")).getImage();
	private Image Food10= new ImageIcon(Client.class.getResource("../Images/짜장밥.jpg")).getImage();
	private Image Food11= new ImageIcon(Client.class.getResource("../Images/짬뽕.jpg")).getImage();
	private Image Food12= new ImageIcon(Client.class.getResource("../Images/탕수육.jpg")).getImage();
	
	private Image Menu1= new ImageIcon(Client.class.getResource("../Images/Menu1.png")).getImage();
	private Image Menu2= new ImageIcon(Client.class.getResource("../Images/Menu2.png")).getImage();
	private Image Menu3= new ImageIcon(Client.class.getResource("../Images/Menu3.png")).getImage();
	private Image Menu4= new ImageIcon(Client.class.getResource("../Images/Menu4.png")).getImage();
	private Image Menu5= new ImageIcon(Client.class.getResource("../Images/Menu5.png")).getImage();
	private Image Menu6= new ImageIcon(Client.class.getResource("../Images/Menu6.png")).getImage();
	private Image Menu7= new ImageIcon(Client.class.getResource("../Images/Menu7.png")).getImage();
	private Image Menu8= new ImageIcon(Client.class.getResource("../Images/Menu8.png")).getImage();
	private Image Menu9= new ImageIcon(Client.class.getResource("../Images/Menu9.png")).getImage();
	private Image Menu10= new ImageIcon(Client.class.getResource("../Images/Menu10.png")).getImage();
	private Image Menu11= new ImageIcon(Client.class.getResource("../Images/Menu11.png")).getImage();
	private Image Menu12= new ImageIcon(Client.class.getResource("../Images/Menu12.png")).getImage();
	
	boolean page1 = true;
	boolean page2 = false;
	boolean page3 = false;
	
	public void screenDraw(Graphics2D d)
	{
		d.drawImage(Orderbackground, 0, 0, null);
		
		if(page1==true) // 1페이지 음식
		{
			d.drawImage(Food1, 10, 100,null);
			d.drawImage(Food2, 10, 280,null);
			d.drawImage(Food3, 10, 460,null);
			d.drawImage(Food4, 10, 640,null);
			d.drawImage(Menu1, 290, 100,null);
			d.drawImage(Menu2, 290, 280,null);
			d.drawImage(Menu3, 290, 460,null);
			d.drawImage(Menu4, 290, 640,null);
			
		}
		
		if(page2==true) // 2페이지 음식
		{
			d.drawImage(Food5, 10, 100,null);
			d.drawImage(Food6, 10, 280,null);
			d.drawImage(Food7, 10, 460,null);
			d.drawImage(Food8, 10, 640,null);
			d.drawImage(Menu5, 290, 100,null);
			d.drawImage(Menu6, 290, 280,null);
			d.drawImage(Menu7, 290, 460,null);
			d.drawImage(Menu8, 290, 640,null);

		}
		
		if(page3==true) // 3페이지 음식
		{
			d.drawImage(Food9, 10, 100,null);
			d.drawImage(Food10, 10, 280,null);
			d.drawImage(Food11, 10, 460,null);
			d.drawImage(Food12, 10, 640,null);
			d.drawImage(Menu9, 290, 100,null);
			d.drawImage(Menu10, 290, 280,null);
			d.drawImage(Menu11, 290, 460,null);
			d.drawImage(Menu12, 290, 640,null);
		}
		
	}
}
