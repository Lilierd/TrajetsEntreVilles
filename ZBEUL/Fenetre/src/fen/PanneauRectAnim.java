package fen;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PanneauRectAnim extends JPanel {
	private int posX = 225;
	private int posY = 400;

	public void paintComponent(Graphics g){
		g.setColor(Color.white);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.red);
	    g.fillRect(posX, posY, 50, 50);
	    System.out.println("x : "+this.getPosX()+" y : "+this.getPosY());
	}

	public int getPosX() {
	    return posX;
	}

	public void setPosX(int posX) {
	    this.posX = posX;
	}

	public int getPosY() {
	    return posY;
	}

	public void setPosY(int posY) {
	    this.posY = posY;
	} 
}
