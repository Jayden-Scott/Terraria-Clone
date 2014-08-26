package com.mrdls.tc.screen.states;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.util.HashMap;
import java.util.Map;

import com.mrdls.tc.lib.Variables;
import com.mrdls.tc.screen.gui.GuiElement;

public class ScreenState {

	public String name;
	
	private Dimension lastSize;
	
	private Map<String, GuiElement> map;
	
	public ScreenState(String name){
		this.name = name;
		StateManager.registerState(this, name);
		map = new HashMap<String, GuiElement>();
		lastSize = Variables.screenSize;
	}
	
	public void addElement(String name, GuiElement element){
		map.put(name, element);
	}
	
	public void render(Graphics2D g){
		if(lastSize.width != Variables.screenSize.width || lastSize.height != Variables.screenSize.height){
			lastSize = Variables.screenSize;
			sizeChanged();
		}
		for(Map.Entry<String, GuiElement> entry : map.entrySet()){
			entry.getValue().render(g);
		}
	}
	
	public void tick(){
		for(Map.Entry<String, GuiElement> entry : map.entrySet()){
			entry.getValue().tick();
		}
	}
	
	public GuiElement getElement(String name){
		return map.get(name);
	}
	
	protected void sizeChanged(){}
}
