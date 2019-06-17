package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import level.Level;

public class LevelPreview extends JPanel {

	private final EditorFrame editorFrame;
	private Level level;
	private LevelPanel levelPanel;
	
	
	public LevelPreview(EditorFrame editorFrame, Level level) {
			
			super();
			
			this.editorFrame = editorFrame;
			this.level = level;
			levelPanel = new LevelPanel(this,level);
			setBackground(Color.BLACK);
			setPreferredSize(new Dimension(800, 1200));
		}
	
}
