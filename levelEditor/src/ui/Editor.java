package ui;

import level.Level;

public class Editor {

	public static String[] elements = {"empty","baba","keke","rock","wall","water","lava","flag","grass"};
	public static String[] keyWords = {"is","has","you","us","win","defeat","push","block","sink","death"};
	
	
	private Level level;
	private EditorFrame editorFrame;
	
	public Editor() {
		level=new Level();
		editorFrame= new EditorFrame(this,level);
	};
	
	public void save(String absolutePath) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
