package fen;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PanneauOvalAnimBouton extends JPanel{
	    //Vous verrez cette phrase chaque fois que la méthode sera invoquée
		private int posX1 = -50;
		private int posY1 = -50;
		private int posX2 = 100;
		private int posY2 = 100;

		public void paintComponent(Graphics g){
			g.setColor(Color.white);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			g.setColor(Color.red);
		    g.fillOval(posX1, posY1, 50, 50);
		    
		    System.out.println("x : "+this.getPosX1()+" y : "+this.getPosY1());
		}
		
		public void paintComponent(Graphics g, Graphics g2){
			g.setColor(Color.white);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			g.setColor(Color.red);
		    g.fillOval(posX1, posY1, 50, 50);
		    g2.fillOval(posX2, posY2, 50, 50);
		    
		    System.out.println("x : "+this.getPosX1()+" y : "+this.getPosY1());
		}

		public int getPosX1() {
		    return posX1;
		}

		public void setPosX1(int posX) {
		    this.posX1 = posX;
		}

		public int getPosY1() {
		    return posY1;
		}

		public void setPosY1(int posY) {
		    this.posY1 = posY;
		} 
		
		public int getPosX2() {
		    return posX2;
		}

		public void setPosX2(int posX) {
		    this.posX2 = posX;
		}

		public int getPosY2() {
		    return posY2;
		}

		public void setPosY2(int posY) {
		    this.posY2 = posY;
		} 
}
