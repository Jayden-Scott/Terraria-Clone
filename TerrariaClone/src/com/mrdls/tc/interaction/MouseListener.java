package com.mrdls.tc.interaction;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import com.mrdls.tc.lib.Variables;

public class MouseListener implements java.awt.event.MouseListener, MouseMotionListener{
	
	@Override
	public void mouseClicked(MouseEvent e) {
		/*if(e.getButton() == MouseEvent.BUTTON1){
			Variables.mouseButtons[0] = true;
		}else if(e.getButton() == MouseEvent.BUTTON2){
			Variables.mouseButtons[1] = true;
		}else if(e.getButton() == MouseEvent.BUTTON3){
			Variables.mouseButtons[2] = true;
		}*/
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON1){
			Variables.mouseButtons[0] = true;
		}else if(e.getButton() == MouseEvent.BUTTON2){
			Variables.mouseButtons[1] = true;
		}else if(e.getButton() == MouseEvent.BUTTON3){
			Variables.mouseButtons[2] = true;
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON1){
			Variables.mouseButtons[0] = false;
		}else if(e.getButton() == MouseEvent.BUTTON2){
			Variables.mouseButtons[1] = false;
		}else if(e.getButton() == MouseEvent.BUTTON3){
			Variables.mouseButtons[2] = false;
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		Variables.cursorLocation = e.getPoint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		Variables.cursorLocation = e.getPoint();
	}

}
