package com.mrdls.tc;

import java.applet.Applet;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;

public class TerrariaClone extends Applet{

	private static final long serialVersionUID = 5145659858916661907L;

	public static void main(String[] args){
		Component applet = new TerrariaClone();

	    JFrame frame = new JFrame("Terraria Clone");
	    frame.getContentPane().add(applet);

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.pack();
	    frame.setSize(new Dimension(800, 600));
	    frame.setVisible(true);
	}
	
	public void paint(Graphics g){
		g.drawString("Hello, World!", 10, 20);
	}

}
