package com.mrdls.tc.screen.states.common;

import com.mrdls.tc.screen.gui.Label;
import com.mrdls.tc.screen.states.ScreenState;

public class StateCredits extends ScreenState{
	
	public StateCredits() {
		super("Credits");
		
		addElement("label", new Label("You have reached the credits section. 1 internet cookie for you.", 10, 20));
	}

}
