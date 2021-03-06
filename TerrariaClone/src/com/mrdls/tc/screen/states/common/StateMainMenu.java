package com.mrdls.tc.screen.states.common;

import com.mrdls.tc.lib.Finals;
import com.mrdls.tc.lib.Variables;
import com.mrdls.tc.screen.gui.ButtonList;
import com.mrdls.tc.screen.gui.Label;
import com.mrdls.tc.screen.states.ScreenState;
import com.mrdls.tc.screen.states.StateManager;

public class StateMainMenu extends ScreenState{

	public StateMainMenu() {
		super("Main Menu");
		
		addElement("Menu", new ButtonList().addButton("New Game").addButton("Load Game").addButton("Settings").addButton("Credits").addButton("Exit"));
		addElement("Version", new Label("Version: " + Finals.PROJECT_VERSION));
		
		sizeChanged();
	}
	
	public void tick(){
		super.tick();
		
		ButtonList menu = (ButtonList)getElement("Menu");
		
		if(menu.getButton("Credits").isClicked()){
			StateManager.setState("Credits");
		}
		
		if(menu.getButton("Exit").isClicked()){
			System.exit(0);
		}
	}
	
	public void sizeChanged(){
		getElement("Menu").x = Variables.screenSize.width / 2 - getElement("Menu").width /2;
		getElement("Menu").y = Variables.screenSize.height / 2 - getElement("Menu").height /2;
		
		getElement("Version").x = Variables.screenSize.width - getElement("Version").width - 5;
		getElement("Version").y = Variables.screenSize.height - getElement("Version").height - 5;
	}
}
