package cn.hfz.solor;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
/*
 * ÓÎÏ·Àà°ü
 */

public class Gameutil {
	
	
	private Gameutil() {} 
	
	
	public static Image getImage(String path){
		return Toolkit.getDefaultToolkit().getImage(Gameutil.class.getClassLoader().getResource(path));
		
	}
	
	

}
