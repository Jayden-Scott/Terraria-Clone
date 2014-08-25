package com.mrdls.tc;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.JFrame;

import com.mrdls.tc.lib.Finals;

public class TerrariaClone extends Applet implements Runnable{

	private static final long serialVersionUID = 5145659858916661907L;

	private BufferedImage screenImage;
	
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
		if(screenImage != null){
			g.drawImage(screenImage, 0, 0, screenImage.getWidth(), screenImage.getHeight(), null);
		}
		
		g.drawString("Hello, World! " + new Random().nextInt(), 10, 20);
	}

	public void run() {
		float desiredTPS = Finals.DEFAULT_TPS;
		float desiredFPS = Finals.DEFAULT_FPS;
		
		float ticks = 0;
		float frames = 0;
		
		float lastTick = System.nanoTime();
		float lastFrame = System.nanoTime();
		float lastUpdate = System.nanoTime();
		
		float time = System.nanoTime();
		
		while(true){
			time = System.nanoTime();
			
			if(time - lastUpdate > 1000000000){
				System.out.println("Ticks: " + ticks + "(" + ticks / ((time - lastUpdate) / 1000000000) + "tps); Frames: " + frames + "(" + frames / ((time - lastUpdate) / 1000000000) + "fps)");
				ticks = 0;
				frames = 0;
				lastUpdate = System.nanoTime();
			}
			
			if(time - lastTick >= 1000000000 / desiredTPS){
				lastTick = System.nanoTime();
				ticks++;
				tick();
			}else if(time - lastFrame >= 1000000000 / desiredFPS){
				lastFrame = System.nanoTime();
				frames++;
				frame();
			}
		}
	}
	
	
	public void tick(){
		
	}
	
	public void frame(){
		BufferedImage si = new BufferedImage(Finals.SIZE_DEFAULT.width, Finals.SIZE_DEFAULT.height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g = si.createGraphics();
		g.setColor(Color.cyan);
		g.fillRect(0, 0, si.getWidth(), si.getHeight());
		g.dispose();
		screenImage = si;
		repaint();
	}
}
