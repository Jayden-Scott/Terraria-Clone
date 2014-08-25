package com.mrdls.tc.screen.states;

import java.awt.Graphics2D;

import com.mrdls.tc.screen.gui.Label;

public class StateMainMenu extends ScreenState{

	Label testLabel;
	
	public StateMainMenu() {
		super("Main Menu");
		
		testLabel = new Label("Sable Code", 10, 20);
	}

	public void render(Graphics2D g){
		testLabel.render(g);
	}
}
