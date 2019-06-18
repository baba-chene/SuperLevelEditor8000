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
	private Level level;
	int width;
	int height;
	int margin;
	Graphics  g;

	Editor editor;
	
	
	public LevelPanel( Level level, Editor editor)
	{
		super();
		this.level = level;
		this.editor = editor;
		editor.getEditorFrame().addMouseListener(this);
		editor.getEditorFrame().addMouseMotionListener(this);
		addMouseListener(this);
		addMouseMotionListener(this);
		
		width = level.getWidth();
		height = level.getHeight();		
		margin = level.getMargin();
		
	}
	
	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		level.paintBoxes(g);
	}
	
	public void notifyForUpdate()
	{
		repaint();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		//TODO Auto-generated method stub
		//this.mouseClicked(e);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int ordinateClick = e.getX();
		int abscissClick = e.getY();
		int abscissMaze = (abscissClick-margin)/(1+height);
		int ordinateMaze = (ordinateClick-margin)/(1+width);
		
		System.out.println(abscissMaze);
		System.out.println(ordinateMaze);
		
		String text = editor.getEditorFrame().getSelectedObject();

		//paintBox(this.g,text,abscissMaze,ordinateMaze);
		level.mapUpdate(text, abscissMaze,ordinateMaze );
		
		editor.notifyForUpdate();

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
