package ui;

import javax.swing.*;

public class FileMenu extends JMenu{
	
	private final QuitMenuItem quitMenuItem;
	private final OpenMenuItem openMenuItem;
	private final SaveAsMenuItem saveAsMenuItem;
	
	
	public FileMenu(EditorFrame editorFrame) {
		
		super("File");
		
		add(quitMenuItem = new QuitMenuItem(editorFrame));
		add(openMenuItem = new OpenMenuItem(editorFrame));
		add(saveAsMenuItem = new SaveAsMenuItem(editorFrame));
		}

}
