package ui;

import java.util.ArrayList;

import javax.swing.ButtonGroup;

public class ObjectButtonGroup extends ButtonGroup {

	public ObjectButtonGroup(ArrayList<ObjectButton> radioButtons) {
		super();
		for (ObjectButton r : radioButtons){
			add(r);
		}
	}
}