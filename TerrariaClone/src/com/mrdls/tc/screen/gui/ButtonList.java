package com.mrdls.tc.screen.gui;

import java.awt.Graphics2D;
import java.util.HashMap;
import java.util.Map;

public class ButtonList extends GuiElement{

	private static final long serialVersionUID = -3680355213806734154L;

	private Map<String, Button> buttonList;
	
	public ButtonList(){
		buttonList = new HashMap<String, Button>();
	}
	
	public void addButton(String name, Button button){
		buttonList.put(name, button);
		
	}
	
	public void calcSize(){
		
	}
	
	public void render(Graphics2D g){
		
	}
}
