package com.mrdls.tc.screen.states;

import java.awt.Graphics2D;

public class ScreenState {

	public String name;
	
	public ScreenState(String name){
		this.name = name;
		StateManager.registerState(this, name);
	}
	
	public void render(Graphics2D g){ g.drawString(name, 10, 20); }
	public void tick(){}
}
