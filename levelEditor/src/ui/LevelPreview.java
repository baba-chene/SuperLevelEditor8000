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

public class LevelPreview extends JPanel {

	
	private LinkedList drawables = new LinkedList();
	
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
		try {
			image = ImageIO.read(getClass().getResource("/images/baba.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		d.changeImage(image);
		repaint();
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
