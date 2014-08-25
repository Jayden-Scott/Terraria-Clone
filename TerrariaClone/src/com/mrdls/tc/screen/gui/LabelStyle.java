package com.mrdls.tc.screen.gui;

import java.awt.Color;

public class LabelStyle {

	private Color color = Color.black;
	private Color bgcolor = Color.white;
	private boolean hasBackground = false;
	private boolean hasBorder = false;
	private Color borderColor = Color.black;
	private int borderWidth = 1;
	
	public Color getColor() {
		return color;
	}
	
	public LabelStyle setColor(Color color) {
		this.color = color;
		return this;
	}
	
	public Color getBgcolor() {
		return bgcolor;
	}
	
	public LabelStyle setBgcolor(Color bgcolor) {
		this.bgcolor = bgcolor;
		setHasBackground(true);
		return this;
	}
	
	public boolean isHasBackground() {
		return hasBackground;
	}
	
	public LabelStyle setHasBackground(boolean hasBackground) {
		this.hasBackground = hasBackground;
		return this;
	}
	
	public boolean isHasBorder() {
		return hasBorder;
	}
	
	public LabelStyle setHasBorder(boolean hasBorder) {
		this.hasBorder = hasBorder;
		return this;
	}
	
	public Color getBorderColor() {
		return borderColor;
	}
	
	public LabelStyle setBorderColor(Color borderColor) {
		this.borderColor = borderColor;
		setHasBorder(true);
		return this;
	}
	
	public int getBorderWidth() {
		return borderWidth;
	}
	
	public LabelStyle setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
		setHasBorder(true);
		return this;
	}
	
	
}
