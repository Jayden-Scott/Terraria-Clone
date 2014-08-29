package com.mrdls.tc.screen.states.common;

import com.mrdls.tc.lib.Variables;
import com.mrdls.tc.screen.gui.ButtonList;
import com.mrdls.tc.screen.states.ScreenState;

public class StateMainMenu extends ScreenState{

	public StateMainMenu() {
		super("Main Menu");
		
		addElement("Menu", new ButtonList().addButton("New Game").addButton("Load Game").addButton("Settings").addButton("Credits").addButton("Exit"));
		
		sizeChanged();
	}
	
	public void tick(){
		super.tick();
		
		ButtonList menu = (ButtonList)getElement("Menu");
		
		if(menu.getButton("Exit").isClicked()){
			System.exit(0);
		}
	}
	
	public void sizeChanged(){
		getElement("Menu").x = Variables.screenSize.width / 2 - getElement("Menu").width /2;
		getElement("Menu").y = Variables.screenSize.height / 2 - getElement("Menu").height /2;
	}
}
