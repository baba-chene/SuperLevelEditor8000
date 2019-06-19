package ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public interface IDrawable {
	
	public  void draw(Graphics g);

	public Rectangle getRectangle();
	
	public void changeImage(Image image);
	
	
	public void changeColor(Color color);
}