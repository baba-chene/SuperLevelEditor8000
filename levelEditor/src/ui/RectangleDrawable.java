package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

public class RectangleDrawable extends FormDrawable{

	Point pos;
	EditorFrame editorFrame;
	public RectangleDrawable(Color color, Image image,Point pos, Dimension dim,EditorFrame editorFrame) {
		super(color,image,pos, dim);
		this.pos = pos;
		this.editorFrame = editorFrame;
	}

	public void draw(Graphics g) {
		Color c = g.getColor();
		g.setColor(color);
		g.drawImage(this.image,(int) pos.getX(),(int)pos.getY(),editorFrame);
		//g.fillRect(rect.x,rect.y,rect.height,rect.width);
		g.setColor(c);
	}

}