package com.mrdls.tc.screen.gui;

import java.awt.Color;

public class ElementStyles {

	public static ElementStyle label = new ElementStyle().setColor(Color.black).setHasBackground(false).setHasBorder(false);
	public static ElementStyle success = new ElementStyle().setColor(new Color(30,143,33)).setBgcolor(new Color(185,253,187));
	
	public static ElementStyle button = new ElementStyle().setColor(Color.black).setBgcolor(Color.lightGray).setBorderWidth(2).setBorderColor(Color.darkGray).setMobgColor(Color.cyan);
}
