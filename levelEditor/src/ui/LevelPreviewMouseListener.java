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
		System.out.println("Mais où est l'erreur ? Cherche bien jeune padawan");
		ArrayList selectedDrawables = levelPreview.findDrawables(e.getPoint());
		if (selectedDrawables.size() == 0) return;
		IDrawable drawable = (IDrawable) selectedDrawables.get(0);
		levelPreview.changeImage(drawable);
		levelPreview.changeLevel(e.getX()/(45+2), e.getY()/(45+2));
		
	}
	
	protected void leftClickAction(MouseEvent e) {
		
		ArrayList selectedDrawables = levelPreview.findDrawables(e.getPoint());
		if (selectedDrawables.size() == 0) return;
		IDrawable drawable = (IDrawable) selectedDrawables.get(0);
		levelPreview.changeImage(drawable);
		levelPreview.changeLevel( (int) ((e.getY()-10)/(45.0+2)), (int) ((e.getX()-10)/(45.0+2)));
	}
	
}
