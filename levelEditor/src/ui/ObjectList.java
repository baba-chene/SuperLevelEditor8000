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
		setPreferredSize(new Dimension(100, 700));
		
		
		//Initialisation des choix
		ArrayList<JRadioButton> radioButtons = new ArrayList<JRadioButton>();
		
		radioButtons.add(new ObjectButton("---ELEMENTS---", editorFrame, false));
		
		for(int i=0; i< Editor.elements.length ;i++) {
			String element=Editor.elements[i];
			radioButtons.add(new ObjectButton(element, editorFrame, i==0));
		}
		
		radioButtons.add(new ObjectButton("---KEY WORDS---", editorFrame, false));
		
		for(int i=0; i< Editor.keyWords.length ;i++) {
			String kw=Editor.keyWords[i];
			radioButtons.add(new KeyWordButton(kw, editorFrame, false));
		}
		
		
		ObjectButtonGroup radioButtonGroup = new ObjectButtonGroup(radioButtons);
		this.objectButtonGroup = radioButtonGroup;
	
		//add(new JLabel("	Elements"));
		
		for (JRadioButton e : radioButtons){
			add(e);
		}
	}
}
