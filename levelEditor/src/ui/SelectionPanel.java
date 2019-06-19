package ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class SelectionPanel extends Container {
	
	private final ModeSelectionList msList;
	private final ObjectList oList;
	
	public SelectionPanel(EditorFrame ef) {
		
		msList= new ModeSelectionList(ef);
		oList= new ObjectList(ef);
		
		setVisible(true);
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(200, 1000));
		//Container c = getRootPane();
		
		this.add(oList, BorderLayout.SOUTH);
		this.add(msList, BorderLayout.NORTH);
	}
}
