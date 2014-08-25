package com.mrdls.tc.lib;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Point;

import javax.swing.JFrame;

import com.mrdls.tc.TerrariaClone;
import com.mrdls.tc.interaction.MouseListener;
import com.mrdls.tc.screen.Screen;

public class Variables {

	public static boolean debug = false;
	
	public static JFrame frame;
	public static Screen screen;
	public static TerrariaClone tc;
	public static Thread thread;
	public static Dimension screenSize;
	
	public static Font fontDefault;
	public static FontMetrics fmDefault;
	
	public static Point cursorLocation;
	public static MouseListener mouseListener;
	
	public static void init(){
		cursorLocation = new Point(0, 0);
		mouseListener = new MouseListener();
		
		frame = new JFrame(Finals.PROJECT_NAME);
		screen = new Screen();
		tc = new TerrariaClone();
		thread = new Thread(Variables.tc);
		screenSize = Finals.SIZE_DEFAULT;
		
		Canvas c = new Canvas();
		fontDefault = new Font("Helvetica", Font.PLAIN, 12);
		fmDefault = c.getFontMetrics(fontDefault);
	}
}
