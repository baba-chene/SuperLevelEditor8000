package ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ObjectButton extends JRadioButton implements ActionListener {
	
	private final String name;
	private String object;
	private final EditorFrame editorFrame;

	public ObjectButton(String name, EditorFrame editorFrame, boolean state) {
		super(name, state);
		
		this.name = name;
		this.editorFrame = editorFrame;
		
		addActionListener(this);
		
		if (state) {
			editorFrame.setCurrentObject(object);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		editorFrame.setCurrentObject(object);
	}

}