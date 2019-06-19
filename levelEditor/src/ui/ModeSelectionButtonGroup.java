package ui;

import java.util.ArrayList;

import javax.swing.ButtonGroup;

public class ModeSelectionButtonGroup extends ButtonGroup {

	public ModeSelectionButtonGroup(ArrayList<ModeSelectionButton> radioButtons) {
		super();
		for (ModeSelectionButton r : radioButtons){
			add(r);
		}
	}
}