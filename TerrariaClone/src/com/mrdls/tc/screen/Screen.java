package com.mrdls.tc.screen;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import com.mrdls.tc.lib.Variables;
import com.mrdls.tc.screen.states.StateManager;

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
		Variables.screenSize = Variables.frame.getSize();
		
		BufferedImage si = new BufferedImage(Variables.screenSize.width, Variables.screenSize.height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g = si.createGraphics();
		g.setColor(Color.white);
		g.fillRect(0, 0, si.getWidth(), si.getHeight());
		g.setColor(Color.black);
		
		StateManager.render(g);
		
		g.dispose();
		screenImage = si;
		repaint();
	}
}
