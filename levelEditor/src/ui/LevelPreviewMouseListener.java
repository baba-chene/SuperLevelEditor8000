package ui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.SwingUtilities;

public class LevelPreviewMouseListener extends MouseAdapter {

	protected LevelPreview levelPreview;
	
	public LevelPreviewMouseListener(LevelPreview levelPreview) {
		
		
		super();
		this.levelPreview = levelPreview;
		levelPreview.addMouseListener(this);
		
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
	
	protected void rightClickAction(MouseEvent e) {
	
		ArrayList selectedDrawables = levelPreview.findDrawables(e.getPoint());
		if (selectedDrawables.size() == 0) return;
		IDrawable drawable = (IDrawable) selectedDrawables.get(0);
		levelPreview.changeColor(drawable);
	}
	
	protected void leftClickAction(MouseEvent e) {
		
		
	}
	
}
