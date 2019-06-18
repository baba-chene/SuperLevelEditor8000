package ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;


public class OpenMenuItem extends JMenuItem {
	
	//private final MazeFrame mazeFrame;
	
	public OpenMenuItem(EditorFrame editorFrame) {
		super("Open");
		
		this.addActionListener(e -> { 
			
			JFileChooser fc = new JFileChooser();
			fc.showOpenDialog(editorFrame);
			
			File file= fc.getSelectedFile();
			
			if (file==null) {
				System.out.println("Pas de fichier selectionn�");
			}
			
			else if (!((file.getName()).endsWith(".txt"))) {
				System.out.println("Il faut choisir un fichier Texte");
			}
			else {
				try {
					editorFrame.open(file.getAbsolutePath());
					
				} catch (FileNotFoundException e1) {
					//Si aucun fichier n'as été choisi
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
	}
}