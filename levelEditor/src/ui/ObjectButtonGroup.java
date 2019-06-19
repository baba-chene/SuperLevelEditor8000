package ui;

import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class ObjectButtonGroup extends ButtonGroup {

	public ObjectButtonGroup(ArrayList<JRadioButton> radioButtons) {
		super();
		for (JRadioButton r : radioButtons){
			add(r);
		}
	}
}