package com.mrdls.tc;

import java.applet.Applet;
import java.awt.Component;

import javax.swing.JFrame;

import com.mrdls.tc.lib.Finals;
import com.mrdls.tc.lib.Variables;
import com.mrdls.tc.screen.states.StateManager;

public class TerrariaClone extends Applet implements Runnable{

	private static final long serialVersionUID = 5145659858916661907L;
	
	public static void main(String[] args){
		Variables.init();
		StateManager.init();
		
		Component applet = Variables.screen;

	    Variables.frame.getContentPane().add(applet);

	    Variables.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Variables.frame.pack();
	    Variables.frame.setSize(Finals.SIZE_DEFAULT);
	    Variables.frame.setVisible(true);
	    
	    Variables.thread.start();
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
				Variables.screen.frame();
			}
		}
	}
	
	public void tick(){
		StateManager.tick();
	}
}
