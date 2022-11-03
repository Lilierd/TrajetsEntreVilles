package fen;

import java.awt.Graphics;

import javax.swing.JPanel;

public class PanneauLigne extends JPanel{
	public void paintComponent(Graphics g){
	    //Vous verrez cette phrase chaque fois que la méthode sera invoquée
		System.out.println("Code executed."); 
		//xdébut, ydébut, xfin, yfin
	    g.drawLine(0, 0, this.getWidth(), this.getHeight());
	    g.drawLine(0, this.getHeight(), this.getWidth(), 0);
	}  
}
