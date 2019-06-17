package ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.*;


public class OpenMenuItem extends JMenuItem {
	
	//private final MazeFrame mazeFrame;
	
	public OpenMenuItem(EditorFrame editorFrame) {
		super("Open");
		
		this.addActionListener(e -> { 
			// TODO Open existing map
		});
	}
}

	