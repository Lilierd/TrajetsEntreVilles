package fr.lilierd.anim;

import java.awt.Color;

public class Point {
	private int posX = -10, posY = -10;
	private Color couleur = Color.red;
	private int size = 10;
	private String forme = "ROND";
	
	public Point() {}
	
	public Point(int x, int y, int size, Color couleur, String forme) {
		this.posX = x;
		this.posY = y;
		this.couleur = couleur;
		this.forme = forme;
		this.size = size;
		
	}
	
	public void setX(int x) {
		this.posX = x;
	}
	public void setY(int y) {
		this.posY = y;
	}
	public int getX() {
		return this.posX;
	}
	public int getY() {
		return this.posY;
	}
	
	public void setSize(int t) {
		this.size = t;
	}
	public int getSize() {
		return this.size;
	}
	
	public void setColor(Color c) {
		this.couleur = c;
	}
	public Color getColor() {
		return this.couleur;
	}
	
	public void setShape(String shape) {
		this.forme = shape;
	}
	public String getShape() {
		return this.forme;
	}
	
}
