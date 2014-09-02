package com.mrdls.tc.screen.gui;

import java.awt.Color;

public class ElementStyle {


	private boolean hasBackground = false;
	private boolean hasBorder = false;
	private boolean hasMOColor = false;
	private boolean hasMObgColor = false;
	private boolean autoSize = true;
	private boolean isMultiLine = false;
	
	private Color color = Color.black;
	private Color bgcolor = Color.white;
	private Color borderColor = Color.black;
	private Color moColor = Color.black;
	private Color mobgColor = Color.white;
	
	private int borderWidth = 1;
	
	public Color getColor() {
		return color;
	}
	
	public ElementStyle setColor(Color color) {
		this.color = color;
		return this;
	}
	
	public Color getBgcolor() {
		return bgcolor;
	}
	
	public ElementStyle setBgcolor(Color bgcolor) {
		this.bgcolor = bgcolor;
		setHasBackground(true);
		return this;
	}
	
	public boolean isHasBackground() {
		return hasBackground;
	}
	
	public ElementStyle setHasBackground(boolean hasBackground) {
		this.hasBackground = hasBackground;
		return this;
	}
	
	public boolean isHasBorder() {
		return hasBorder;
	}
	
	public ElementStyle setHasBorder(boolean hasBorder) {
		this.hasBorder = hasBorder;
		return this;
	}
	
	public Color getBorderColor() {
		return borderColor;
	}
	
	public ElementStyle setBorderColor(Color borderColor) {
		this.borderColor = borderColor;
		setHasBorder(true);
		return this;
	}
	
	public int getBorderWidth() {
		return borderWidth;
	}
	
	public ElementStyle setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
		setHasBorder(true);
		return this;
	}

	public boolean isHasMOColor() {
		return hasMOColor;
	}

	public ElementStyle setHasMOColor(boolean hasMOColor) {
		this.hasMOColor = hasMOColor;
		return this;
	}

	public Color getMoColor() {
		return moColor;
	}

	public ElementStyle setMoColor(Color moColor) {
		this.moColor = moColor;
		setHasMOColor(true);
		return this;
	}

	public boolean isHasMObgColor() {
		return hasMObgColor;
	}

	public ElementStyle setHasMObgColor(boolean hasMObgColor) {
		this.hasMObgColor = hasMObgColor;
		return this;
	}

	public Color getMobgColor() {
		return mobgColor;
	}

	public ElementStyle setMobgColor(Color mobgColor) {
		this.mobgColor = mobgColor;
		setHasMObgColor(true);
		return this;
	}

	public boolean isAutoSize() {
		return autoSize;
	}

	public ElementStyle setAutoSize(boolean autoSize) {
		this.autoSize = autoSize;
		return this;
	}

	public boolean isMultiLine() {
		return isMultiLine;
	}

	public ElementStyle setMultiLine(boolean isMultiLine) {
		this.isMultiLine = isMultiLine;
		if(isMultiLine){
			setAutoSize(true);
		}
		return this;
	}
}
