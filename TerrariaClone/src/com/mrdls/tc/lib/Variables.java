package com.mrdls.tc.lib;

import javax.swing.JFrame;

import com.mrdls.tc.TerrariaClone;
import com.mrdls.tc.screen.Screen;

public class Variables {

	public static JFrame frame;
	public static Screen screen;
	public static TerrariaClone tc;
	public static Thread thread
	;
	
	public static void init(){
		frame = new JFrame(Finals.PROJECT_NAME);
		screen = new Screen();
		tc = new TerrariaClone();
		thread = new Thread(Variables.tc);
	}
}