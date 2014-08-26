package com.mrdls.tc.screen.states.common;

import com.mrdls.tc.screen.gui.ButtonList;
import com.mrdls.tc.screen.states.ScreenState;

public class StateMainMenu extends ScreenState{

	public StateMainMenu() {
		super("Main Menu");
		
		addElement("Menu", new ButtonList().addButton("New Game").addButton("Load Game").addButton("Settings").addButton("Credits").addButton("Exit"));
	}
	
	public void tick(){
		super.tick();
	}
	
	public void sizeChanged(){
		System.out.println("Size Changed!");
	}
}
