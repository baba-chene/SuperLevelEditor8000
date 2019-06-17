package ui;

import javax.swing.*;

public class FileMenuBar extends JMenuBar{
	
	private FileMenu fileMenu;
	
	public FileMenuBar(EditorFrame editorFrame) {
		
		super();
		
		add(fileMenu = new FileMenu(editorFrame));
	}

}
