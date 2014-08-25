package com.mrdls.tc.screen.gui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

import com.mrdls.tc.lib.Variables;

public class Label extends GuiElement{
	
	private static final long serialVersionUID = -1495365504025703688L;
	
	private String text;
	private LabelStyle style;
	
	private void init(String text, Point location){
		this.text = text;
		this.x = location.x;
		this.y = location.y;
		this.setStyle(LabelStyles.label);
		calcSize();
	}
	
	public void render(Graphics2D g){
		g.setColor(getStyle().getColor());
		
		if(getStyle().isHasBackground() || (hovering && style.isHasMObgColor())){
			if(hovering && style.isHasMObgColor()){
				g.setColor(style.getMobgColor());
			}else{
				g.setColor(getStyle().getBgcolor());
			}
			g.fillRect(x, y, width, height);
		}
		
		if(getStyle().isHasBorder()){
			g.setColor(getStyle().getBorderColor());
			for(int i = 0; i < getStyle().getBorderWidth(); i++){
				g.drawRect(x + i, y + i, width - 2 * i, height - 2 * i);
			}
		}
		
		if(Variables.debug){
			g.drawRect(x, y, width, height);
		}
		
		if(hovering && style.isHasMOColor()){
			g.setColor(style.getMoColor());
		}else{
			g.setColor(style.getColor());
		}
		
		g.drawString(text, x + getStyle().getBorderWidth() + 2, y + (height / 2 + Variables.fmDefault.getHeight() / 2) - Variables.fmDefault.getHeight() / 5);
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
	
	public void calcSize(){
		this.width = Variables.fmDefault.stringWidth(text) + 2 * getStyle().getBorderWidth() + 4;
		this.height = Variables.fmDefault.getHeight() + 2 * getStyle().getBorderWidth();
	}
	
	public String getText() {
		return text;
	}

	public Label setText(String text) {
		this.text = text;
		calcSize();
		return this;
	}

	public Color getColor() {
		return getStyle().getColor();
	}

	public Label setColor(Color color) {
		getStyle().setColor(color);
		calcSize();
		return this;
	}

	public Color getBgcolor() {
		return getStyle().getBgcolor();
	}

	public Label setBgcolor(Color bgcolor) {
		getStyle().setBgcolor(bgcolor);
		setHasBackground(true);
		calcSize();
		return this;
	}

	public boolean isHasBackground() {
		return getStyle().isHasBackground();
	}

	public Label setHasBackground(boolean hasBackground) {
		getStyle().setHasBackground(hasBackground);
		calcSize();
		return this;
	}

	public boolean isHasBorder() {
		return getStyle().isHasBorder();
	}

	public Label setHasBorder(boolean hasBorder) {
		getStyle().setHasBorder(hasBorder);
		calcSize();
		return this;
	}

	public Color getBorderColor() {
		return getStyle().getBorderColor();
	}

	public Label setBorderColor(Color borderColor) {
		getStyle().setBorderColor(borderColor);
		setHasBorder(true);
		calcSize();
		return this;
	}

	public int getBorderWidth() {
		return getStyle().getBorderWidth();
	}

	public Label setBorderWidth(int borderWidth) {
		getStyle().setBorderWidth(borderWidth);
		setHasBorder(true);
		calcSize();
		return this;
	}

	public LabelStyle getStyle() {
		return style;
	}

	public Label setStyle(LabelStyle style) {
		this.style = style;
		calcSize();
		return this;
	}
}
