package com.mrdls.tc.screen.gui;

import java.awt.Graphics2D;
import java.util.HashMap;
import java.util.Map;

import com.mrdls.tc.lib.Variables;

public class ButtonList extends GuiElement{

	private static final long serialVersionUID = -3680355213806734154L;

	private Map<String, Button> buttonList;
	
	private int buttonAmount = 0;
	
	public ButtonList(){
		buttonList = new HashMap<String, Button>();
	}
	
	public ButtonList addButton(String name){
		buttonList.put(name, new Button(name).setPosition(10, 10 + buttonAmount * 30));
		buttonAmount++;
		return this;
		
	}
	
	public void calcSize(){
		
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
		
		for(Map.Entry<String, Button> entry : buttonList.entrySet()){
			entry.getValue().render(g);
		}
	}
	
	public int getButtonAmount(){
		return buttonAmount;
	}
}
