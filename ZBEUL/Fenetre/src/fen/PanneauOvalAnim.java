package fen;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PanneauOvalAnim extends JPanel{
	    //Vous verrez cette phrase chaque fois que la m�thode sera invoqu�e
		private int posX = -50;
		private int posY = -50;

		public void paintComponent(Graphics g){
			g.setColor(Color.white);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			g.setColor(Color.red);
		    g.fillOval(posX, posY, 50, 50);
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
