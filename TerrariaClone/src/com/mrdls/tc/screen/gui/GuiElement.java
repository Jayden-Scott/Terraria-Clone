package com.mrdls.tc.screen.gui;

import java.awt.Graphics2D;
import java.awt.Rectangle;

import com.mrdls.tc.lib.Variables;

public class GuiElement extends Rectangle{

	private static final long serialVersionUID = -1279649973681948056L;
	
	protected boolean mouseOver = false;
	protected boolean clicked = false;
	
	protected ElementStyle style = ElementStyles.label;
	
	public void calcSize() {}
	public void render(Graphics2D g){}
	
	public void render(Graphics2D g, int x, int y) {
		this.x = x;
		this.y = y;
		render(g);
	}
	
	public void tick(){
		if(this.contains(Variables.cursorLocation)){
			mouseOver = true;
			if(Variables.debug){
				System.out.println("TOUCH ME!");
			}
			
			if(Variables.mouseButtons[0]){
				clicked = true;
			}else{
				clicked = false;
			}
			
		}else{
			mouseOver = false;
			clicked = false;
		}
	}
	
	public boolean isMouseOver(){
		return mouseOver;
	}
	
	public boolean isClicked(){
		return clicked;
	}
	
	public GuiElement setPosition(int x, int y){
		this.x = x;
		this.y = y;
		return this;
	}
}
