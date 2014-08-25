package com.mrdls.tc;

import java.applet.Applet;
import java.awt.Component;

import javax.swing.JFrame;

import com.mrdls.tc.lib.Finals;
import com.mrdls.tc.screen.Screen;

public class TerrariaClone extends Applet implements Runnable{

	private static final long serialVersionUID = 5145659858916661907L;

	public static Screen screen;
	
	public static void main(String[] args){
		TerrariaClone tc = new TerrariaClone();
		
		screen = new Screen();
		Component applet = screen;

	    JFrame frame = new JFrame(Finals.PROJECT_NAME);
	    frame.getContentPane().add(applet);

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.pack();
	    frame.setSize(Finals.SIZE_DEFAULT);
	    frame.setVisible(true);
	    
	    Thread threat = new Thread(tc);
	    threat.start();
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
				screen.frame();
			}
		}
	}
	
	public void tick(){
		
	}
}
