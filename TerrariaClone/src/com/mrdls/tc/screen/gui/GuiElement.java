package com.mrdls.tc.screen.gui;

import java.awt.Graphics2D;
import java.awt.Rectangle;

import com.mrdls.tc.lib.Variables;

public class GuiElement extends Rectangle{

	private static final long serialVersionUID = -1279649973681948056L;
	
	protected boolean mouseOver = false;
	protected boolean clicked = false;
	
	public void render(Graphics2D g){}
	public void tick(){
		if(this.contains(Variables.cursorLocation)){
			mouseOver = true;
			if(Variables.debug){
				System.out.println("TOUCH ME!");
			}
			
			if(Variables.mouseButtons[0]){
				clicked = true;
			}
			
		}else{
			mouseOver = false;
			clicked = false;
		}
	}
}
