package cn.hfz.uil;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import cn.hfz.solor.Gameutil;

public class Planes extends Star{
	
	double longAxis;        //³¤Öá
   	double shortAxis;      //¶ÌÖá
	double speed;
	double degree;
	Star center;
	
	boolean satlittle;
	
	
	public void draw(Graphics g){
		super.draw(g);
		drawTrace(g);
		move();
		if(!satlittle){
			drawTrace(g);
		}
	}	
	
	public	void move(){
		x=center.x+center.width/2+longAxis*Math.cos(degree);
		y=center.y+center.heigth/2+shortAxis*Math.sin(degree);
		
		degree+=speed;
	
}
	
	public void drawTrace(Graphics g){
		
		int _x,_y,_width,_height;
		_width=(int) (longAxis*2);
		_height=(int) (shortAxis*2);
		_x=(int) ((center.x+center.width/2)-longAxis);
		_y=(int) ((center.y+center.heigth/2)-shortAxis);
		Color c=g.getColor();
		g.setColor(Color.blue);
		g.drawOval((int)_x, (int)_y, (int)_width, (int)_height);
		
		g.setColor(c);
	}
	
	
	
	
	
	public Planes(Star center,String imgpath,  double longAxis,
			double shortAxis, double speed) {
		
		this.center=center;
		this.x=center.x+longAxis;
		this.y=center.y;
		this.img=Gameutil.getImage(imgpath);
		
		this.width=img.getWidth(null);
		this.heigth=img.getHeight(null);
		
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.speed = speed;
		
	}
	
	public Planes(Star center,String imgpath,  double longAxis,
			double shortAxis, double speed,boolean satlittle) {
		
          this(center, imgpath, longAxis, shortAxis, speed);
          this.satlittle=satlittle;
	}


    public Planes(Image img,double x,double y){
    	super(img,x,y);
    }   

	public Planes(String imgpath,double x,double y){
		super(imgpath, x, y);
		
	}

}
