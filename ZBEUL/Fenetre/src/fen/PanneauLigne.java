package fen;

import java.awt.Graphics;

import javax.swing.JPanel;

public class PanneauLigne extends JPanel{
	public void paintComponent(Graphics g){
	    //Vous verrez cette phrase chaque fois que la m�thode sera invoqu�e
		System.out.println("Code executed."); 
		//xd�but, yd�but, xfin, yfin
	    g.drawLine(0, 0, this.getWidth(), this.getHeight());
	    g.drawLine(0, this.getHeight(), this.getWidth(), 0);
	}  
}
