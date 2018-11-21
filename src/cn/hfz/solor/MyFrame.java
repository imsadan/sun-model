package cn.hfz.solor;

import java.awt.Frame;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MyFrame extends Frame{
	
	
	
public void lanchFrame(){
		
		setSize(constant.GAME_WIDTH,constant.GAME_HEIGHT);
		setLocation(50, 50);
		setVisible(true);
	
	
		
		
		
	addWindowListener(new WindowAdapter(){

		@Override
		public void windowClosing(WindowEvent e) {  //���ڹر�
		System.exit(0);
		}
		
	});
	
	
	new PaintThread().start();
}

  /*
   * �߳��࣬����Ԫ��
   */

class PaintThread extends Thread{
	   
	   public void run(){
		   while(true){
			   repaint();
			   try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
	   }
   }
}
	
	