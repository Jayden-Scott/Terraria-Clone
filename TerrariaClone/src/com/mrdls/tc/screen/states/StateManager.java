package com.mrdls.tc.screen.states;

import java.awt.Graphics2D;
import java.util.HashMap;
import java.util.Map;

import com.mrdls.tc.screen.states.common.StateCredits;
import com.mrdls.tc.screen.states.common.StateMainMenu;

public class StateManager {

	private static Map<String, ScreenState> map;
	private static String currentState;
	
	public static void init(){
		map = new HashMap<String, ScreenState>();
		
		new StateMainMenu();
		new StateCredits();
		
		currentState = "Main Menu";
	}
	
	public static void registerState(ScreenState state, String name){
		map.put(name, state);
		System.out.println("Registered screenstate " + name);
	}
	
	public static void setState(String name){
		currentState = name;
	}
	
	public static void render(Graphics2D g){
		map.get(currentState).render(g);
	}
	
	public static void tick(){
		map.get(currentState).tick();
	}
}
