package ui;

import javax.swing.*;

import level.Level;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


import java.io.File;
import java.util.*;


import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

@SuppressWarnings("serial")
public final class LevelPanel extends JPanel implements MouseListener, MouseMotionListener
{
	private final LevelPreview levelPreview;
	private Level level;
	private Box[][] listBox;
	int width;
	int height;
	int margin;
	
	public LevelPanel(LevelPreview levelPreview, Level level)
	{
		super();
		this.levelPreview = levelPreview;
		setBackground(Color.WHITE);
		this.level = level;
		
		setPreferredSize(new Dimension(512,512));
		addMouseListener(this);
		addMouseMotionListener(this);
		createBoxes();
		width = 20;
		height = 20;		
		margin = 10;
						
				
	}
	
	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		for (int i=0;i<level.hauteur;i++) {
			for (int j = 0; j< level.largeur; j++) {
				
				paintBox(g,level.getMap(),i,j);
				
				
			}
			
		}
		
	}
	private void createBoxes() {

		
		for (int i = 0; i < level.hauteur; i++) {
			
			for (int j = 0; j < level.largeur; j++) {
				listBox[i][j] = new Box (margin+i*(height+1),margin+j*(width+1),width,height);
	
			}
		}
		
	}
	
	
	
	private void paintBox(Graphics g, String[][] map, int i, int j) {
			
		switch(map[i][j]) {
		
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
	
	
	public void notifyForUpdate()
	{
		repaint();
	}

	
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
