package com.mrdls.tc.screen.states;

import java.awt.Color;

import com.mrdls.tc.screen.gui.Label;

public class StateMainMenu extends ScreenState{

	Label testLabel;
	
	public StateMainMenu() {
		super("Main Menu");
		
		addElement("testlabel", new Label("I'm Blue.", 10, 20).setColor(Color.blue).setBgcolor(Color.red));
	}
}
