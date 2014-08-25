package com.mrdls.tc.screen;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Random;

import com.mrdls.tc.lib.Finals;

public class Screen extends Applet{

	private static final long serialVersionUID = 9018844435759310190L;
	
	private BufferedImage screenImage;
	
	public void update(Graphics g){
		paint(g);
	}
	
	public void paint(Graphics g){
		if(screenImage != null){
			g.drawImage(screenImage, 0, 0, screenImage.getWidth(), screenImage.getHeight(), null);
		}	
	}
	
	public void frame(){
		BufferedImage si = new BufferedImage(Finals.SIZE_DEFAULT.width, Finals.SIZE_DEFAULT.height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g = si.createGraphics();
		g.setColor(Color.cyan);
		g.fillRect(0, 0, si.getWidth(), si.getHeight());
		g.setColor(Color.black);
		
		g.drawString("Hello, World! " + new Random().nextInt(), 10, 20);
		
		g.dispose();
		screenImage = si;
		repaint();
	}
}
