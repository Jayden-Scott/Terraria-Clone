package com.mrdls.tc.screen.states.common;

import com.mrdls.tc.screen.gui.Button;
import com.mrdls.tc.screen.gui.Label;
import com.mrdls.tc.screen.gui.LabelStyles;
import com.mrdls.tc.screen.states.ScreenState;

public class StateMainMenu extends ScreenState{

	Label testLabel;
	
	public StateMainMenu() {
		super("Main Menu");
		
		addElement("label", new Label("Label", 10, 20));
		addElement("success", new Label("Success", 10, 40).setStyle(LabelStyles.success));
		addElement("button", new Button("Button", 10, 60));
	}
	
	public void tick(){
		super.tick();
		
		if(getElement("button").isClicked()){
			System.out.println("CLICKED");
		}
	}
}
