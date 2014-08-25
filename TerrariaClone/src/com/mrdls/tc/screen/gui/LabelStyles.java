package com.mrdls.tc.screen.gui;

import java.awt.Color;

public class LabelStyles {

	public static LabelStyle label = new LabelStyle().setColor(Color.black).setHasBackground(false).setHasBorder(false);
	public static LabelStyle success = new LabelStyle().setColor(new Color(30,143,33)).setBgcolor(new Color(185,253,187));
	
	public static LabelStyle button = new LabelStyle().setColor(Color.black).setBgcolor(Color.lightGray).setBorderWidth(2).setBorderColor(Color.darkGray);
}
