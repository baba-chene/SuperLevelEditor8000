package ui;

import java.awt.*;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JPanel;

import level.Level;

public class LevelPreview extends JPanel {
	
	
	private EditorFrame editorFrame;
	private LinkedList drawables = new LinkedList();
	private Level level;
	
	public LevelPreview(EditorFrame editorFrame, Level level) {
		super();
		System.out.println("Hello");
		this.editorFrame = editorFrame;
		this.level = level;
		
	}
	
	
	public void paint(Graphics g) {
		
		super.paint(g);
		for (Iterator iter =  ((java.util.List) drawables).iterator(); iter.hasNext();) {
			IDrawable d = (IDrawable) iter.next();
			d.draw(g);	
		}
	}

	public void addDrawable(IDrawable d) {
		drawables.add(d);
		repaint();
	}

	public void removeDrawable(IDrawable d) {
		drawables.remove(d);
		repaint();
	}

	public void clear() {
		
		drawables.clear();
		repaint();
	}
	
	
	public void changeColor(IDrawable d) {
		
		
		
		
		d.changeColor(Color.BLUE);
		repaint();

	}
	
	
	public void changeImage(IDrawable d) {
		Image image = null;
		String selectedObject = "/images/"+editorFrame.getSelectedObject()+".png";

		try {
			image = ImageIO.read(getClass().getResource(selectedObject));
			image = image.getScaledInstance(45, 45, 1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		d.changeImage(image);
		
		
		repaint();
	}
	
	
	public void changeImage(String object,int i, int j) {
		Image image = null;
		String selectedObject = "/images/"+object+".png";
		System.out.println(selectedObject);

		Point p = new Point(i*47+11,j*47+11);
		System.out.println(i*47);
		ArrayList selectedDrawables = findDrawables(p);
		System.out.println(selectedDrawables.size());
		if (selectedDrawables.size() == 0) return;
		System.out.println("Bernard");
		IDrawable drawable = (IDrawable) selectedDrawables.get(0);
		try {
			image = ImageIO.read(getClass().getResource(selectedObject));
			image = image.getScaledInstance(45, 45, 1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (drawable == null) {
			System.out.print("Bernard s'en va à ");
		};
		drawable.changeImage(image);
		
		repaint();
	}
	
	
	
	public void changeLevel(int x,int y) {
		
		level.mapUpdate(editorFrame.getSelectedObject(), x, y);
		
	}
	
	public ArrayList findDrawables(Point p) {
		ArrayList l = new ArrayList();
		for (Iterator iter = drawables.iterator(); iter.hasNext();) {
			IDrawable element = (IDrawable) iter.next();
			if(element.getRectangle().contains(p)){
				l.add(element);
			}
		}
		return l;
	}

}
