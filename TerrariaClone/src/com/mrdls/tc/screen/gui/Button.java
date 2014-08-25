package com.mrdls.tc.screen.gui;

import java.awt.Point;

public class Button extends Label{

	public Button(String text, Point location) {
		super(text, location);
	}
	
	public Button(String text){
		super(text);
	}

	public Button(String text, int x, int y){
		super(text, x, y);
	}
}
