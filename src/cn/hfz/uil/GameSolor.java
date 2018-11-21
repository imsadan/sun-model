package cn.hfz.uil;

import java.awt.Graphics;
import java.awt.Image;

import cn.hfz.solor.Gameutil;
import cn.hfz.solor.MyFrame;

public class GameSolor extends MyFrame {
	
	Image backg=Gameutil.getImage("img/sky.gif");
	Star sun=new Star("img/sun.gif", 350, 300);
	Planes earth=new Planes(sun, "img/earth.gif", 150, 100,0.06);
	Planes moon=new Planes(earth, "img/moon.gif", 30, 20,0.05,true);
	Planes Mars=new Planes(sun, "img/Mars.gif", 200, 130,0.05);
	Planes shuixin=new Planes(sun, "img/水星.gif",60 ,50 , 0.08);
	Planes jinxin=new Planes(sun, "img/金星.gif", 100, 60,0.07);
	Planes Muxin=new Planes(sun, "img/木星.gif",220 , 155, 0.04);
	Planes Tuxin=new Planes(sun, "img/土星.gif", 250, 170, 0.035);
	Planes Tianwx=new Planes(sun, "img/天王星.gif", 280, 190, 0.03);
	Planes Haiwx=new Planes(sun, "img/海王星.gif", 310, 210, 0.025);
	
	public void paint(Graphics g){
		
		g.drawImage(backg,0, 0, null);
		sun.draw(g);
		earth.draw(g);
		Mars.draw(g);
		moon.draw(g);
		shuixin.draw(g);
		jinxin.draw(g);
		Muxin.draw(g);
		Tuxin.draw(g);
		Tianwx.draw(g);
		Haiwx.draw(g);
		
		
		
	}
	
	public static void main(String[] args){
		   new GameSolor().lanchFrame();
		}


}

