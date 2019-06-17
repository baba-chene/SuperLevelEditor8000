package ui;

import javax.swing.*;

public class QuitMenuItem extends JMenuItem {
	
	public QuitMenuItem(EditorFrame editorFrame) {
		super("Quit");
		
		this.addActionListener(e -> System.exit(0));
	}
}