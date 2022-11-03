package fen;

import java.awt.Graphics;

import javax.swing.JPanel;

public class PanneauPolyLine extends JPanel{
	public void paintComponent(Graphics g){
	    //Vous verrez cette phrase chaque fois que la méthode sera invoquée
		System.out.println("Code executed."); 
		int x[] = {20, 30, 50, 60, 60, 50, 30, 20};
	    int y[] = {30, 20, 20, 30, 50, 60, 60, 50};
	    g.drawPolyline(x, y, 7);
	}  
}
