package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.*;

import level.Level;


public class EditorFrame extends JFrame {
	
	private final Editor editor;
	private final FileMenuBar fileMenuBar;
	private final LevelPanel levelPanel;
	private final LevelPreview levelPreview;

	private final SelectionPanel selectionPanel;

	private String currentObject;
	private String currentMode;
	private Level level;
	private boolean isKeyWord;
	
	
	private int hauteurLevel = 20;  // Nombre de case vertical  
	private int largeurLevel = 30; // Nombre de case horizontal
	
	private int screenHeight = 900; // Hauteur de la fenetre
	private int screenWidth = 1820; // Largeur de la fenètre
	
	
	public EditorFrame (Editor editor, Level level) {
		
		super();
		this.editor=editor;
		this.level=level;
		isKeyWord=false;
		setVisible(true);
		setLayout(new BorderLayout());
		
		//menuBar
		fileMenuBar = new FileMenuBar(this);
		setJMenuBar(fileMenuBar);
		
		//level preview
		levelPanel = new LevelPanel(level,this);
		
		levelPreview  =new LevelPreview();
		levelPreview.setPreferredSize(new Dimension(screenWidth,screenHeight));
		
		int caseWidth =  screenWidth/largeurLevel;
		int caseHeight = screenHeight/hauteurLevel;
		
		for (int i = 0; i < hauteurLevel; i++ ) {
			
			for (int j = 0; j < largeurLevel ; j++) {
				
				IDrawable rect = new RectangleDrawable(Color.RED, new Point(10+j*(caseWidth),10+i*(caseHeight)),new Dimension(caseHeight,caseWidth));
				levelPreview.addDrawable(rect);
				
			}
		}
		
		//buttonList
		selectionPanel = new SelectionPanel(this);
		
		Container c = getContentPane();

		c.add(levelPreview, BorderLayout.CENTER);
		c.add(selectionPanel, BorderLayout.EAST);
		new LevelPreviewMouseListener(levelPreview);
		
		pack();
		
		this.notifyForUpdate();
		
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


	public void notifyForUpdate() {
		
		levelPanel.notifyForUpdate();
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
