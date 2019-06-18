package ui;

import level.Level;

public class Editor {

	public static String[] elements = {"empty","baba","keke","rock","wall","water","lava","flag","grass"};
	public static String[] keyWords = {"is","has","you","us","win","defeat","push","block","sink","death","move"};
	public static String[] colorElements = {"#000000","#FFFFFF","#FFB3B3","#774A00","#8A8A8A","#00DEFF","#FF4D00","#FFE400","#009835"};
	public static String[] colorTextElements = {"#A700FF","#A700FF","#A700FF","#A700FF","#A700FF","#A700FF","#A700FF","#A700FF","#A700FF",};
	public static String[] colorKeyWords = {"#FF00C8","#FF00C8","#0C00FF","#0C00FF","#D4FF00","#930021","#43AC52","#6C5833","#000BAD","#660037","#05B87E"};
	
	
	private Level level;
	private EditorFrame editorFrame;
	
	public Editor() {
		level=new Level();
		editorFrame= new EditorFrame(this,level);
	};
	

}
