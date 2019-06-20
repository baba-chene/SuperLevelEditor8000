package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;

public class ModeSelectionButton extends JRadioButton implements ActionListener {
	
	private final String name;
	private String mode;
	private final EditorFrame editorFrame;

	public ModeSelectionButton(String name, EditorFrame editorFrame, boolean state) {
		super(name, state);
		
		this.name = name;
		this.editorFrame = editorFrame;
		
		addActionListener(this);
		
		if (state) {
			editorFrame.setCurrentObject(name);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		editorFrame.setCurrentMode(name);
	}
}
