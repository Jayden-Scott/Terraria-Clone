package com.mrdls.tc.interaction;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import com.mrdls.tc.lib.Variables;

public class MouseListener implements java.awt.event.MouseListener, MouseMotionListener{
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
