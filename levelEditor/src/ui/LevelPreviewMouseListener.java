package ui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.SwingUtilities;

public class LevelPreviewMouseListener extends MouseAdapter {

	protected LevelPreview levelPreview;
	
	public LevelPreviewMouseListener(LevelPreview levelPreview) {
		
		
		super();
		this.levelPreview = levelPreview;
		levelPreview.addMouseListener(this);
		levelPreview.addMouseMotionListener(this);
		
	}
	
	
	public LevelPreview getLevelPreview() {
		
		return levelPreview;
	}
	
	
	public void mouseClicked(MouseEvent e) {
		
		
		if (SwingUtilities.isLeftMouseButton(e)) {
			
			leftClickAction(e);
			
		} else {
			
			rightClickAction(e);
			
		}
	}
	
	public void mouseDragged(MouseEvent e) {
		System.out.println("Je suis bien dragged");
		this.leftClickAction(e);
	}
	
	protected void rightClickAction(MouseEvent e) {
	
		ArrayList selectedDrawables = levelPreview.findDrawables(e.getPoint());
		if (selectedDrawables.size() == 0) return;
		IDrawable drawable = (IDrawable) selectedDrawables.get(0);
		levelPreview.changeImage(drawable);
		levelPreview.changeLevel(e.getX(), e.getY());
		
	}
	
	protected void leftClickAction(MouseEvent e) {
		
		ArrayList selectedDrawables = levelPreview.findDrawables(e.getPoint());
		if (selectedDrawables.size() == 0) return;
		IDrawable drawable = (IDrawable) selectedDrawables.get(0);
		levelPreview.changeImage(drawable);
	}
	
}
