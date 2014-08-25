package com.mrdls.tc.screen.gui;

import java.awt.Color;

public class LabelStyle {


	private boolean hasBackground = false;
	private boolean hasBorder = false;
	private boolean hasMOColor = false;
	private boolean hasMObgColor = false;
	
	private Color color = Color.black;
	private Color bgcolor = Color.white;
	private Color borderColor = Color.black;
	private Color moColor = Color.black;
	private Color mobgColor = Color.white;
	
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

	public boolean isHasMOColor() {
		return hasMOColor;
	}

	public LabelStyle setHasMOColor(boolean hasMOColor) {
		this.hasMOColor = hasMOColor;
		return this;
	}

	public Color getMoColor() {
		return moColor;
	}

	public LabelStyle setMoColor(Color moColor) {
		this.moColor = moColor;
		setHasMOColor(true);
		return this;
	}

	public boolean isHasMObgColor() {
		return hasMObgColor;
	}

	public LabelStyle setHasMObgColor(boolean hasMObgColor) {
		this.hasMObgColor = hasMObgColor;
		return this;
	}

	public Color getMobgColor() {
		return mobgColor;
	}

	public LabelStyle setMobgColor(Color mobgColor) {
		this.mobgColor = mobgColor;
		setHasMObgColor(true);
		return this;
	}
}
