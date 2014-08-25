package com.mrdls.tc.screen.states;

import com.mrdls.tc.screen.gui.Button;
import com.mrdls.tc.screen.gui.Label;
import com.mrdls.tc.screen.gui.LabelStyles;

public class StateMainMenu extends ScreenState{

	Label testLabel;
	
	public StateMainMenu() {
		super("Main Menu");
		
		addElement("label", new Label("Label", 10, 20).setStyle(LabelStyles.label));
		addElement("success", new Button("Success", 10, 40).setStyle(LabelStyles.success));
	}
}
