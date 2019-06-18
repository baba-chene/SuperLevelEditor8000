package ui;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ObjectList extends JPanel {

	private final EditorFrame editorFrame;
	private final ObjectButtonGroup objectButtonGroup;
	
	public ObjectList (EditorFrame editorFrame) {
		
		super();
		this.editorFrame= editorFrame;
		setLayout(new GridLayout(30, 1));
		setPreferredSize(new Dimension(200, 800));
		
		
		//Initialisation des choix
		ArrayList<JRadioButton> radioButtons = new ArrayList<JRadioButton>();
		
		radioButtons.add(new ObjectButton("empty", editorFrame, true));
		radioButtons.add(new ObjectButton("baba", editorFrame, false));
		radioButtons.add(new ObjectButton("wall", editorFrame, false));
		radioButtons.add(new ObjectButton("water", editorFrame, false));
		radioButtons.add(new ObjectButton("rock", editorFrame, false));
		radioButtons.add(new ObjectButton("lava", editorFrame, false));
		radioButtons.add(new ObjectButton("flag", editorFrame, false));
		
		radioButtons.add(new ObjectButton("", editorFrame, false));
		
		radioButtons.add(new KeyWordButton("IS", editorFrame, false));
		radioButtons.add(new KeyWordButton("HAS", editorFrame, false));
		radioButtons.add(new KeyWordButton("AND", editorFrame, false));
		radioButtons.add(new KeyWordButton("YOU", editorFrame, false));
		radioButtons.add(new KeyWordButton("US", editorFrame, false));
		radioButtons.add(new KeyWordButton("BLOCK", editorFrame, false));
		radioButtons.add(new KeyWordButton("PUSH", editorFrame, false));
		radioButtons.add(new KeyWordButton("SINK", editorFrame, false));
		radioButtons.add(new KeyWordButton("WIN", editorFrame, false));
		radioButtons.add(new KeyWordButton("DEFEAT", editorFrame, false));
		
		
		ObjectButtonGroup radioButtonGroup = new ObjectButtonGroup(radioButtons);
		this.objectButtonGroup = radioButtonGroup;
	
		add(new JLabel("	Elements"));
		
		for (JRadioButton e : radioButtons){
			add(e);
		}
	}
}
