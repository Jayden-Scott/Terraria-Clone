package com.mrdls.tc.screen.states;

import com.mrdls.tc.screen.gui.Label;

public class StateMainMenu extends ScreenState{

	Label testLabel;
	
	public StateMainMenu() {
		super("Main Menu");
		
		addElement("testlabel", new Label("Sable Code", 10, 20));
	}
}
