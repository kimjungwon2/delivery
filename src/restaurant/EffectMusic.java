package restaurant;

import java.applet.AudioClip;

import javax.swing.JApplet;

public class EffectMusic {
	   AudioClip inputSound; // ���ϸ� �׳� ���ϸ� ������ // �����˾Ƽ� ã����
	   
	   public EffectMusic(String SoundFileURL)
	   {
	      try 
	      {
	    	  inputSound = JApplet.newAudioClip(Server.class.getResource(SoundFileURL));
	      }catch (Exception e) {System.out.println("������ ���о����ϴ�");}
	   }
	   
	   public void startPlay(){
	      try {
	    	  inputSound.play();
	    	 // System.out.println("�������");
	      }catch (Exception e) {System.out.println("���� ����� ���߽��ϴ�");}
	   }
	   
	   public void stopPlayer(){
	      inputSound.stop();
	   }
}
