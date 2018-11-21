package cn.hfz.uil;

import java.awt.Graphics;
import java.awt.Image;

import cn.hfz.solor.Gameutil;

public class Star {
	
	Image img;
	double x,y;
	int width,heigth;
	
	public void draw(Graphics g){
		g.drawImage(img, (int)x, (int)y,null);
	}
	
	
	public Star(){}
	
	public Star(Image img,double x,double y){
		this.img=img;
		this.x=x;
		this.y=y;
		this.width=img.getWidth(null);
		this.heigth=img.getHeight(null);
	}
	//·â×°
	public Star(String imgpath,double x,double y){
	     this(Gameutil.getImage(imgpath),x,y);
	}

}
