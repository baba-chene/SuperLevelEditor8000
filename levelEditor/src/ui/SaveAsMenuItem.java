package ui;

import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.*;

public class SaveAsMenuItem extends JMenuItem {
	
	//private final MazeFrame mazeFrame;
	
	public SaveAsMenuItem(EditorFrame editorFrame) {
		super("SaveAs");
		//this.mazeFrame = mazeFrame;
		
		this.addActionListener(e -> {
			JFileChooser fc = new JFileChooser();
			fc.showSaveDialog(editorFrame);
			File file= fc.getSelectedFile();
			fc.setDialogTitle("Specify a file to save"); 
			try {
				editorFrame.save(file.getAbsolutePath());
				System.out.println(file.getName());
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
		});
	}
}