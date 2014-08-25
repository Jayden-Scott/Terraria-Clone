package com.mrdls.tc.screen.gui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

import com.mrdls.tc.lib.Variables;

public class Label extends GuiElement{
	
	private String text;
	private Point location;
	private Color color = Color.black;
	private Color bgcolor = Color.white;
	private boolean hasBackground = false;
	private boolean hasBorder = false;
	private Color borderColor = Color.black;
	private int borderWidth = 1;
	
	private void init(String text, Point location){
		this.text = text;
		this.location = location;
	}
	
	public void render(Graphics2D g){
		g.setColor(color);
		
		if(hasBackground){
			g.setColor(bgcolor);
			g.fillRect((int)location.getX(), (int)location.getY(), getWidth(), getHeight());
			g.setColor(color);
		}
		
		if(hasBorder){
			g.setColor(borderColor);
			for(int i = 0; i < borderWidth; i++){
				g.drawRect((int)location.getX() + i, (int)location.getY() + i, getWidth() - 2 * i, getHeight() - 2 * i);
			}
		}
		
		if(Variables.debug){
			g.drawRect((int)location.getX(), (int)location.getY(), Variables.fmDefault.stringWidth(text), Variables.fmDefault.getHeight());
		}
		
		g.drawString(text, (int)location.getX() + borderWidth + 2, (int)location.getY() + (Variables.fmDefault.getHeight() / 4 * 3) + borderWidth);
	}
	
	public Label(String text, Point location){
		init(text, location);
	}
	
	public Label(String text){
		Point location = new Point();
		location.setLocation(10, 20);
		init(text, location);
	}
	
	public Label(String text, double x, double y){
		Point location = new Point();
		location.setLocation(x, y);
		init(text, location);
	}
	
	public int getWidth(){
		return Variables.fmDefault.stringWidth(text) + 2 * borderWidth + 4;
	}
	
	public int getHeight(){
		return Variables.fmDefault.getHeight() + 2 * borderWidth;
	}
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point location) {
		this.location = location;
	}
	
	public double getX(){
		return location.getX();
	}
	
	public Label setX(double x){
		this.location.setLocation(x, location.getY());
		return this;
	}
	
	public double getY(){
		return location.getY();
	}
	
	public Label setY(double y){
		this.location.setLocation(location.getX(), y);
		return this;
	}

	public Color getColor() {
		return color;
	}

	public Label setColor(Color color) {
		this.color = color;
		return this;
	}

	public Color getBgcolor() {
		return bgcolor;
	}

	public Label setBgcolor(Color bgcolor) {
		this.bgcolor = bgcolor;
		setHasBackground(true);
		return this;
	}

	public boolean isHasBackground() {
		return hasBackground;
	}

	public Label setHasBackground(boolean hasBackground) {
		this.hasBackground = hasBackground;
		return this;
	}

	public boolean isHasBorder() {
		return hasBorder;
	}

	public Label setHasBorder(boolean hasBorder) {
		this.hasBorder = hasBorder;
		return this;
	}

	public Color getBorderColor() {
		return borderColor;
	}

	public Label setBorderColor(Color borderColor) {
		this.borderColor = borderColor;
		setHasBorder(true);
		return this;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public Label setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
		setHasBorder(true);
		return this;
	}
}
