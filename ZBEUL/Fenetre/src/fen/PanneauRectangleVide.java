package fen;

import java.awt.Graphics;

import javax.swing.JPanel;

public class PanneauRectangleVide extends JPanel{
	public void paintComponent(Graphics g){
	    //Vous verrez cette phrase chaque fois que la m�thode sera invoqu�e
		System.out.println("Code executed."); 
		int x1 = this.getWidth()/4;
		int y1 = this.getHeight()/4;
		g.drawRect(x1, y1, this.getWidth()/2, this.getHeight()/2);
	}  
}
