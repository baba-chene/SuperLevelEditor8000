package ui;

import java.awt.Component;

import level.Level;

public class Editor {

	private Level level;
	private EditorFrame editorFrame;
	
	public Editor() {
		level=new Level();
		editorFrame= new EditorFrame(this,level);
	};
	
	public void save(String absolutePath) {
		// TODO Auto-generated method stub
		
	}

	public void notifyForUpdate() {
		editorFrame.notifyForUpdate();
	}

	public EditorFrame getEditorFrame() {
		
		return editorFrame;
	}
	
	
	
	
	
}
