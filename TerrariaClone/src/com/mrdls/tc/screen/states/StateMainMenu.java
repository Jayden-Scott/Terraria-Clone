package com.mrdls.tc.screen.states;

import com.mrdls.tc.screen.gui.Button;
import com.mrdls.tc.screen.gui.Label;
import com.mrdls.tc.screen.gui.LabelStyles;

public class StateMainMenu extends ScreenState{

	Label testLabel;
	
	public StateMainMenu() {
		super("Main Menu");
		
		addElement("label", new Label("I'm Blue.", 10, 20).setStyle(LabelStyles.label));
		addElement("success", new Button("Click Me", 10, 70).setStyle(LabelStyles.success));
	}
}
