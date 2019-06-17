package ui;

import java.awt.*;
import java.awt.geom.*;

import level.Level;


@SuppressWarnings("serial")
public final class Box extends Rectangle2D.Float 
{
	private int abscissOrigin;
	private int ordinateOrigin;
	private int width;
	private int height;
	
	
	public Box(int x, int y, int w, int h)
	{
		super(x,y,w,h);
		this.abscissOrigin = x;
		this.ordinateOrigin = y;
		this.width = w;
		this.height = h;
		
	}
	
	public final void paintRockBox(Graphics g)
	// Change to WallBox
	{	
		g.setColor(Color.GREEN);
		g.drawRect(abscissOrigin, ordinateOrigin, width, height);
		g.fillRect(abscissOrigin, ordinateOrigin, width, height);
	}
	
	public final void paintEmptyBox(Graphics g)
	//Change to EmptyBox
	{
		g.setColor(Color.BLACK);
		g.drawRect(abscissOrigin, ordinateOrigin, width, height);
		g.fillRect(abscissOrigin, ordinateOrigin, width, height);
	}
	
	public final void paintBabaBox(Graphics g)
	//Change to  DepartureBox
	{
		g.setColor(Color.WHITE);
		g.drawRect(abscissOrigin, ordinateOrigin, width, height);
		g.fillRect(abscissOrigin, ordinateOrigin, width, height);	
	}
	
	public final void paintWaterBox(Graphics g)
	//Change to  ArrivalBox
	{
		g.setColor(Color.BLUE);
		g.drawRect(abscissOrigin, ordinateOrigin, width, height);
		g.fillRect(abscissOrigin, ordinateOrigin, width, height);	
	}
	
	
	public final void paintLavaBox(Graphics g)
	//Change to  ArrivalBox
	{
		g.setColor(Color.RED);
		g.drawRect(abscissOrigin, ordinateOrigin, width, height);
		g.fillRect(abscissOrigin, ordinateOrigin, width, height);	
	}
	
	
	public final void paintFlagBox(Graphics g)
	//Change to  ArrivalBox
	{
		g.setColor(Color.YELLOW);
		g.drawRect(abscissOrigin, ordinateOrigin, width, height);
		g.fillRect(abscissOrigin, ordinateOrigin, width, height);	
	}

	public int getAbscissOrigin()
	{
		return abscissOrigin;
	}

	public int getOrdinateOrigin()
	{
		return ordinateOrigin;
	}
}

