package ui;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ObjectList extends JPanel {

	private final EditorFrame editorFrame;
	private final ObjectButtonGroup objectButtonGroup;
	
	public ObjectList (EditorFrame editorFrame) {
		
		super();
		this.editorFrame= editorFrame;
		setLayout(new GridLayout(50, 2));
		setPreferredSize(new Dimension(200, 800));
		
		
		//Initialisation des choix
		ArrayList<ObjectButton> radioButtons = new ArrayList<ObjectButton>();
		
		radioButtons.add(new ObjectButton("empty", editorFrame, true));
		radioButtons.add(new ObjectButton("baba", editorFrame, false));
		radioButtons.add(new ObjectButton("wall", editorFrame, false));
		radioButtons.add(new ObjectButton("water", editorFrame, false));
		radioButtons.add(new ObjectButton("rock", editorFrame, false));
		radioButtons.add(new ObjectButton("lava", editorFrame, false));
		radioButtons.add(new ObjectButton("flag", editorFrame, false));
		
		ObjectButtonGroup radioButtonGroup = new ObjectButtonGroup(radioButtons);
		this.objectButtonGroup = radioButtonGroup;
	

		
		for (ObjectButton e : radioButtons){
			add(e);
		}
	}
}
