package ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.*;

import level.Level;


public class EditorFrame extends JFrame {
	
	private final Editor editor;
	private final FileMenuBar fileMenuBar;
	private final LevelPreview levelPreview;
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
		levelPreview = new LevelPreview(this,level);
		
		//buttonList
		objectList = new ObjectList(this);
		
		Container c = getContentPane();
		c.add(levelPreview, BorderLayout.CENTER);
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
	
	
	
	
}
