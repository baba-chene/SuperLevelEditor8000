package ui;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ModeSelectionList extends JPanel{
	
	private final EditorFrame editorFrame;
	private final ModeSelectionButtonGroup objectButtonGroup;
	
	public ModeSelectionList (EditorFrame editorFrame) {
		
		super();
		this.editorFrame= editorFrame;
		setLayout(new GridLayout(3, 1));
		setPreferredSize(new Dimension(100, 80));
		

		ArrayList<ModeSelectionButton> radioButtons = new ArrayList<ModeSelectionButton>();
		
		radioButtons.add(new ModeSelectionButton("object", editorFrame, true));
		radioButtons.add(new ModeSelectionButton("text", editorFrame, false));
		
		ModeSelectionButtonGroup radioButtonGroup = new ModeSelectionButtonGroup(radioButtons);
		this.objectButtonGroup = radioButtonGroup;
		JLabel lbl = new JLabel("Mode (only for elements)");
		
		add(lbl);
		
		for (ModeSelectionButton e : radioButtons){
			add(e);
		}
	}
}
