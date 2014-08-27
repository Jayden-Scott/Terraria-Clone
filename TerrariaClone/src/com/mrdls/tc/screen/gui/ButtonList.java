package com.mrdls.tc.screen.gui;

import java.awt.Graphics2D;
import java.util.LinkedHashMap;
import java.util.Map;

import com.mrdls.tc.lib.Variables;

public class ButtonList extends GuiElement{

	private static final long serialVersionUID = -3680355213806734154L;

	private Map<String, Button> buttonList;
	
	private int buttonAmount = 0;
	private int buttonMargin = 10;
	
	public ButtonList(){
		buttonList = new LinkedHashMap<String, Button>();
	}
	
	public ButtonList addButton(String name){
		int y = this.y + height;
		if(height != 0){
			y += buttonMargin;
		}
		buttonList.put(name, new Button(name).setPosition(x, y));
		buttonAmount++;
		calcSize();
		return this;
	}
	
	public void calcSize(){
		int height = 0;
		int width = 0;
		
		for(Map.Entry<String, Button> entry : buttonList.entrySet()){
			if(height != 0){
				height += buttonMargin;
			}
			height += entry.getValue().height;
			
			if(entry.getValue().width > width){
				width = entry.getValue().width;
			}
		}
		
		for(Map.Entry<String, Button> entry : buttonList.entrySet()){
			entry.getValue().x = this.x + width / 2 - entry.getValue().width / 2;
		}
		
		this.height = height;
		this.width = width;
	}
	
	public void tick(){
		for(Map.Entry<String, Button> entry : buttonList.entrySet()){
			entry.getValue().tick();
		}
	}
	
	public void render(Graphics2D g){
		if(Variables.debug){
			g.drawRect(x, y, width, height);
		}
		
		int buttonCounter = 0;
		for(Map.Entry<String, Button> entry : buttonList.entrySet()){
			int x = this.x + width / 2 - entry.getValue().width / 2;
			int y = this.y + buttonCounter * (entry.getValue().height + buttonMargin);
			entry.getValue().render(g, x, y);
			buttonCounter++;
		}
	}
	
	public int getButtonAmount(){
		return buttonAmount;
	}
}
