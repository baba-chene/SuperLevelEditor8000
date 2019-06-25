package ui;

import java.awt.Component;
import java.util.Observable;
import java.util.Observer;

import level.Level;

public class Editor implements Observer {

	public static String[] elements = {"empty","baba","keke","rock","wall","water","lava","flag","grass","lego","bush","skull","box","love","tree","palm"};
	public static String[] keyWords = {"is","has","and","you","p1","p2","us","win","kill","push","block","sink","move","weak","shut","open","hug","make"};
	
	
	private Level level;
	private EditorFrame editorFrame;
	
	public Editor() {
		level=new Level();
		editorFrame= new EditorFrame(this,level);
	};
	
	public void save(String absolutePath) {
		// TODO Auto-generated method stub
		
	}

	public void notifyForUpdate() {
		editorFrame.notifyForUpdate();
	}

	public EditorFrame getEditorFrame() {
		
		return editorFrame;
	}

	@Override
	public void update(Observable o, Object arg) {
		notifyForUpdate();
		
	}
	
}
