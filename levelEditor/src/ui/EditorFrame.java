package ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.*;

import level.Level;


public class EditorFrame extends JFrame {
	
	private final Editor editor;
	private final FileMenuBar fileMenuBar;
	private final LevelPanel levelPanel;
	private final ObjectList objectList;
	private String currentObject;
	private Level level;
	
	public EditorFrame (Editor editor, Level level) {
		
		this.editor=editor;
		this.level=level;
		setVisible(true);
		setLayout(new BorderLayout());
		
		//menuBar
		fileMenuBar = new FileMenuBar(this);
		setJMenuBar(fileMenuBar);
		
		//level preview
		levelPanel = new LevelPanel(level,editor);
		
		//buttonList
		objectList = new ObjectList(this);
		
		Container c = getContentPane();
		c.add(levelPanel, BorderLayout.CENTER);
		c.add(objectList, BorderLayout.EAST);
		
		setPreferredSize(new Dimension(1820, 900));
		pack();
		
	}

	public void setCurrentObject(String object) {
		currentObject=object;		
	}

	public void save(String absolutePath) {
		editor.save(absolutePath);
		
	}

	public String getSelectedObject() {
		return "rock";
	}

	public void notifyForUpdate() {
		
		levelPanel.notifyForUpdate();
	}
	
	
	
	
}
