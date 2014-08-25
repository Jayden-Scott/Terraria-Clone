package com.mrdls.tc.screen.states;

import java.awt.Graphics2D;

public class StateMainMenu extends ScreenState{

	public StateMainMenu() {
		super("Main Menu");
	}

	public void render(Graphics2D g){
		g.drawRect(10, 20, 122, 20);
		g.drawString("Dirk is awsome (not).", 13, 35);
	}
}
