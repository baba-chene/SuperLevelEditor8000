package level;


import java.awt.Graphics;
import java.util.Observable;

import ui.Box;
import ui.LevelPreview;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Level extends Observable {




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
	
	private Box[][] listBox;
	int width;
	int height;
	int margin;
	
	
	
	public Level () {
		
		map=new String[hauteur][largeur];
		for(int i=0;i<hauteur;i++) {
			for(int j=0;j<largeur;j++) {

				this.mapUpdate("empty",i,j);

			}
		}
		
		width = 1820/largeur;
		height = 900/hauteur;		
		margin = 10;
		
		listBox = new Box[this.hauteur][this.largeur];

		
		
		createBoxes();
		
		
	}

	public String[][] getMap() {
		
		return map;
	}
	
	
	public void mapUpdate(String newMapString,int i,int j) {
		
		map[i][j] = newMapString;

		setChanged();
		notifyObservers();

		
	}
	
	private void createBoxes() {
	
			
			for (int i = 0; i < hauteur; i++) {
				
				for (int j = 0; j < largeur; j++) {
					
					listBox[i][j] = new Box(margin+i*(height+1),margin+j*(width+1),width,height);
		
				}
			}
		}
	
	public void paintBoxes(Graphics g) {
		
		for (int i = 0; i < hauteur; i++) {
			
			for (int j = 0; j < largeur; j++) {
				if (i == 0 && j == 0) {
					System.out.print(map[0][0]);
				paintBox(g,map[i][j],i,j);
				}
				
			}
		}
		
	}
	
	
	private void paintBox(Graphics g, String mapString, int i, int j) {
		
		
		
		switch(mapString) {
		
		case "rock" : 
			listBox[i][j].paintRockBox(g);
		case "lava" : 
			listBox[i][j].paintLavaBox(g);
		case "flag" : 
			listBox[i][j].paintFlagBox(g);
		case "baba" :
			listBox[i][j].paintBabaBox(g);
		case "water":
			listBox[i][j].paintWaterBox(g);
		
		}	
	}

	public int getWidth() {
		// TODO Auto-generated method stub
		return width;
	}

	public int getHeight() {
		// TODO Auto-generated method stub
		return height;
	}


	public int getMargin() {
		// TODO Auto-generated method stub
		return margin;
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

	
	
	public void open(String fileName,LevelPreview levelPreview) throws IOException {
		
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
				levelPreview.changeImage(object, j,i);
				ligne=ligne.substring(spacePos+1);
				
			}
			
			
		}
		br.close();
		
		for (int i = 0; i < hauteur; i++){
			String line = "";				
			for (int j = 0; j < largeur; j++){
				line = line + map[i][j]+ "  ";
			}
			System.out.println(line);
		}
	}
}
