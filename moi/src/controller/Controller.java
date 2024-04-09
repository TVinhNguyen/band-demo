package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import view.View;

public class Controller implements MouseListener, MouseMotionListener {
	private View v;
	
	public Controller(View v) {
		this.v = v;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		this.v.click();
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
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		this.v.enter();
		int x = e.getX(); int y = e.getY();
		this.v.update(x, y);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		this.v.exit();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX(); int y = e.getY();
		this.v.update(x, y);
	}

}
