package com.mrdls.tc.screen.gui;

import java.awt.Point;

public class Button extends Label{

	private static final long serialVersionUID = -304233725144918747L;
	
	public void init(){
		this.setStyle(LabelStyles.button);
	}

	public Button(String text, Point location) {
		super(text, location);
		init();
	}
	
	public Button(String text){
		super(text);
		init();
	}

	public Button(String text, int x, int y){
		super(text, x, y);
		init();
	}
}
