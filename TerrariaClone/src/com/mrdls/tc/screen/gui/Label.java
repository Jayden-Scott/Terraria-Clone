package com.mrdls.tc.screen.gui;

import java.awt.Graphics2D;
import java.awt.Point;

public class Label {
	
	private String text;
	private Point location;
	
	public Label(String text, Point location){
		this.text = text;
		this.location = location;
	}
	
	public void render(Graphics2D g){
		g.drawString(text, (int)location.getX(), (int)location.getY());
	}
	
	public Label(String text){
		Point location = new Point();
		location.setLocation(10, 20);
		new Label(text, location);
	}
	
	public Label(String text, double x, double y){
		Point location = new Point();
		location.setLocation(x, y);
		new Label(text, location);
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
	
	public void setX(double x){
		this.location.setLocation(x, location.getY());
	}
	
	public double getY(){
		return location.getY();
	}
	
	public void setY(double y){
		this.location.setLocation(location.getX(), y);
	}
}
