package ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class KeyWordButton extends JRadioButton implements ActionListener {
	
	private final String name;
	private String word;
	private final EditorFrame editorFrame;

	public KeyWordButton(String name, EditorFrame editorFrame, boolean state) {
		super(name, state);
		
		this.name = name;
		this.editorFrame = editorFrame;
		
		addActionListener(this);
		
		if (state) {
			editorFrame.setCurrentObject(word);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		editorFrame.setCurrentObject(name);
		editorFrame.setIsKeyWord(true);
	}

}