package com.mrdls.tc.screen.gui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

import com.mrdls.tc.lib.Variables;

public class Label extends GuiElement{
	
	private static final long serialVersionUID = -1495365504025703688L;
	
	private String text;
	private Point location;
	private LabelStyle style;
	
	private void init(String text, Point location){
		this.text = text;
		this.location = location;
		this.setStyle(new LabelStyle());
	}
	
	public void render(Graphics2D g){
		g.setColor(getStyle().getColor());
		
		if(getStyle().isHasBackground()){
			g.setColor(getStyle().getBgcolor());
			g.fillRect((int)location.getX(), (int)location.getY(), (int)getWidth(), (int)getHeight());
			g.setColor(getStyle().getColor());
		}
		
		if(getStyle().isHasBorder()){
			g.setColor(getStyle().getBorderColor());
			for(int i = 0; i < getStyle().getBorderWidth(); i++){
				g.drawRect((int)location.getX() + i, (int)location.getY() + i, (int)getWidth() - 2 * i, (int)getHeight() - 2 * i);
			}
		}
		
		if(Variables.debug){
			g.drawRect((int)location.getX(), (int)location.getY(), Variables.fmDefault.stringWidth(text), Variables.fmDefault.getHeight());
		}
		
		g.drawString(text, (int)location.getX() + getStyle().getBorderWidth() + 2, (int)location.getY() + (Variables.fmDefault.getHeight() / 4 * 3) + getStyle().getBorderWidth());
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
	
	public double getWidth(){
		return Variables.fmDefault.stringWidth(text) + 2 * getStyle().getBorderWidth() + 4;
	}
	
	public double getHeight(){
		return Variables.fmDefault.getHeight() + 2 * getStyle().getBorderWidth();
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
		return getStyle().getColor();
	}

	public Label setColor(Color color) {
		getStyle().setColor(color);
		return this;
	}

	public Color getBgcolor() {
		return getStyle().getBgcolor();
	}

	public Label setBgcolor(Color bgcolor) {
		getStyle().setBgcolor(bgcolor);
		setHasBackground(true);
		return this;
	}

	public boolean isHasBackground() {
		return getStyle().isHasBackground();
	}

	public Label setHasBackground(boolean hasBackground) {
		getStyle().setHasBackground(hasBackground);
		return this;
	}

	public boolean isHasBorder() {
		return getStyle().isHasBorder();
	}

	public Label setHasBorder(boolean hasBorder) {
		getStyle().setHasBorder(hasBorder);
		return this;
	}

	public Color getBorderColor() {
		return getStyle().getBorderColor();
	}

	public Label setBorderColor(Color borderColor) {
		getStyle().setBorderColor(borderColor);
		setHasBorder(true);
		return this;
	}

	public int getBorderWidth() {
		return getStyle().getBorderWidth();
	}

	public Label setBorderWidth(int borderWidth) {
		getStyle().setBorderWidth(borderWidth);
		setHasBorder(true);
		return this;
	}

	public LabelStyle getStyle() {
		return style;
	}

	public Label setStyle(LabelStyle style) {
		this.style = style;
		return this;
	}
}
