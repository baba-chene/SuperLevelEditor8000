package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import level.Level;

public class LevelPreview extends JPanel {


	private Level level;
	private LevelPanel levelPanel;
	private Editor editor;
	
	public LevelPreview(EditorFrame editorFrame, Level level,Editor editor) {
			
			super();
			
			
			this.level = level;
			this.editor = editor;
			levelPanel = new LevelPanel(level, this.editor);
			
		}


	public void notifyForUpdate() {
		levelPanel.notifyForUpdate();
		
	}
	
	
	
	
}
