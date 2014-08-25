package com.mrdls.tc;

import java.applet.Applet;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.JFrame;

import com.mrdls.tc.lib.Finals;

public class TerrariaClone extends Applet implements Runnable{

	private static final long serialVersionUID = 5145659858916661907L;

	public static void main(String[] args){
		TerrariaClone tc = new TerrariaClone();
		
		Component applet = tc;

	    JFrame frame = new JFrame(Finals.PROJECT_NAME);
	    frame.getContentPane().add(applet);

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.pack();
	    frame.setSize(Finals.SIZE_DEFAULT);
	    frame.setVisible(true);
	    
	    Thread threat = new Thread(tc);
	    threat.start();
	}
	
	public void paint(Graphics g){
		g.drawString("Hello, World!", 10, 20);
	}

	public void run() {
		float desiredTPS = 30;
		float desiredFPS = 120;
		
		float lastTPS = 0;
		float lastFPS = 0;
		
		float lastTick = System.nanoTime();
		float lastFrame = System.nanoTime();
		
		float time = System.nanoTime();
		
		while(true){
			time = System.nanoTime();
			
			if(time - lastTick >= 1000000000 / desiredTPS){
				lastTick = System.nanoTime();
				System.out.println("Tick");
			}else if(time - lastFrame >= 1000000000 / desiredFPS){
				lastFrame = System.nanoTime();
				System.out.println("Frame");
			}
		}
	}

}
