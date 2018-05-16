package com.yc.img;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

public class DrawImg {
	private String valueCode;
	private int codeLength=4;
	private int width=codeLength*25;
	private int height=25;
	
	
	public Object[] getImageAndCode(){
		valueCode=randomString();
		//System.out.println(valueCode);
		return new Object[]{getImage(),valueCode};
	}
	
	private BufferedImage getImage() {
		// TODO Auto-generated method stub
		BufferedImage bi=null;
		bi=new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);
		Graphics g=bi.getGraphics();
		g.fillRect(0, 0, width, height);
		g.setFont(new Font("Times New Roman",Font.BOLD,22));
		int x,y;
		Random r=new Random();
		for(int i=0;i<300;i++){
			g.setColor(new Color(r.nextInt(100)+150,r.nextInt(100)+150, r.nextInt(100)+150));
			x=r.nextInt(width);
			y=r.nextInt(height);
			g.drawRect(x, y, 1, 1);
		}
		for(int i=0;i<valueCode.length();i++){
			g.setColor(new Color(r.nextInt(100),r.nextInt(100), r.nextInt(100)));
			g.drawString(valueCode.substring(i,i+1), i*20+6,16);
		}
		g.dispose();
		return bi;
	}
	private String randomString() {
		String t="";
		for(int i=0;i<codeLength;i++){
			t+=randomChar();
		}
		return t;
	}
	private char randomChar() {
		// TODO Auto-generated method stub
		char c='0';
		Random r=new Random();
		int t=r.nextInt(62);
		if(t<10){
			c=(char) (t+'0');
		}else if(t<36){
			c=(char) (t-10+'A');
		}else{
			c=(char) (t-36+'a');
		}
		return c;
	}
	
}
