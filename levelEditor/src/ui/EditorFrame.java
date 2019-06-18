package ui;

import java.awt.BorderLayout;

import java.awt.Container;
import java.awt.Dimension;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.*;

import level.Level;


public class EditorFrame extends JFrame {
	
	private final Editor editor;
	private final FileMenuBar fileMenuBar;
	private final LevelPreview levelPreview;
	private final SelectionPanel selectionPanel;
	private String currentObject;
	private String currentMode;
	private Level level;
	private boolean isKeyWord;
	
	public EditorFrame (Editor editor, Level level) {
		
		this.editor=editor;
		this.level=level;
		isKeyWord=false;
		setVisible(true);
		setLayout(new BorderLayout());
		
		//menuBar
		fileMenuBar = new FileMenuBar(this);
		setJMenuBar(fileMenuBar);
		
		//level preview
		levelPreview = new LevelPreview(this,level);
		
		//buttonList
		selectionPanel = new SelectionPanel(this);
		
		Container c = getContentPane();
		c.add(levelPreview, BorderLayout.CENTER);
		c.add(selectionPanel, BorderLayout.EAST);
		
		setPreferredSize(new Dimension(1820, 900));
		pack();
		
	}

	public void setCurrentObject(String object) {
		currentObject=object;		
	}
	
	
	public void setCurrentMode(String mode) {
		currentMode=mode;		
	}
	

	public void save(String absolutePath) throws FileNotFoundException {
		level.save(absolutePath);
		
	}
	
	// Pour savoir quel bloc il faut placer
	public String getSelectedObject() {
		if(currentMode=="text" && !isKeyWord) {
			return "text"+currentObject;	
		}
		return currentObject;		
	}

	public void setIsKeyWord(boolean b) {
		isKeyWord = b;
		
	}

	public void open(String absolutePath) throws IOException {
		level.open(absolutePath);
		
	}
	
	
	
}
