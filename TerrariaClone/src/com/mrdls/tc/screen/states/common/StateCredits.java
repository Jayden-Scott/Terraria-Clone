package com.mrdls.tc.screen.states.common;

import com.mrdls.tc.screen.gui.Button;
import com.mrdls.tc.screen.gui.Label;
import com.mrdls.tc.screen.states.ScreenState;
import com.mrdls.tc.screen.states.StateManager;

public class StateCredits extends ScreenState{
	
	public StateCredits() {
		super("Credits");
		
		addElement("back", new Button("Back to Main Menu", 10, 20));
		addElement("label", new Label("You have reached the credits section. 1 internet cookie for you.", 10, 50));
	}

	public void tick(){
		super.tick();
		
		if(getElement("back").isClicked()){
			StateManager.setState("Main Menu");
		}
	}
}
