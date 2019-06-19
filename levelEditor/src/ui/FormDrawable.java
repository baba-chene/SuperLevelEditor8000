package ui;

import java.awt.*;

public abstract class FormDrawable implements IDrawable {

	
	protected Rectangle rect ;
	protected Color color;
	protected Image image;
	
	public FormDrawable(Color color, Image image,Point pos, Dimension dim){
		this.color=color;
		this.image = image;
		this.rect = new Rectangle(pos,dim);
	}
	
	public abstract void draw(Graphics g) ;
	
	public Rectangle getRectangle(){
		return (Rectangle) rect.clone();
	}
	
	
	public void changeColor( Color color) {
		
		this.color = color;
	}
	
	public void changeImage(Image image) {
		
		this.image = image;
	}
	
	
}