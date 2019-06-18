package level;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class Level {

	public static final int hauteur = 20;
	public static final int largeur = 30;
	/*
	public static final String empty = "empty";
	public static final String baba = "baba";
	public static final String wall = "wall";
	public static final String rock = "rock";
	public static final String water = "water";
	public static final String lava = "lava";
	
	public static final String textempty = "textempty";
	public static final String textbaba = "textbaba";
	public static final String textwall = "textwall";
	public static final String textrock = "textrock";
	public static final String textwater = "textwater";
	public static final String textlava = "textlava";
	public static final String textis = "textis";
	public static final String textwin = "textwin";
	public static final String textdefeat = "textdefeat";
	public static final String textblock = "textblock";
	*/
	private String[][] map;	
	
	public Level () {
		map=new String[hauteur][largeur];
		for(int i=0;i<hauteur;i++) {
			for(int j=0;j<largeur;j++) {
				map[i][j]="empty";
			}
		}
	}

	public String[][] getMap() {
		
		return map;
	}

	public void save(String fileName) throws FileNotFoundException {
		
		if (!(fileName.endsWith(".txt"))) {
			fileName = fileName+".txt";
		}
		
		PrintWriter pw = new PrintWriter(new FileOutputStream(fileName));
		
		for(int i=0; i<hauteur;i++) {
			for(int j=0; j<largeur; j++) {
				pw.print(map[i][j]+" ");
			}
			pw.println("");
		}
		pw.close();
	}

	
	
	public void open(String fileName) throws IOException {
		
		BufferedReader br = null;
		
		br = new BufferedReader(new FileReader(fileName));

		String ligne;
		
		this.map = new String[hauteur][largeur];
		
		for (int i = 0; i < hauteur; i++){
			
			ligne = br.readLine();
			
			for (int j = 0; j < largeur; j++){
				// On découpe la ligne en mots pour remplir 'map'
				int spacePos= ligne.indexOf(" ");
				String object= ligne.substring(0, spacePos);
				map[i][j]=object;
				
				ligne=ligne.substring(spacePos+1);
				
			}
			
			
		}
		br.close();
		
	}
		
	
}
