package fen;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PanneauTexte extends JPanel{
	public void paintComponent(Graphics g){
	    //Vous verrez cette phrase chaque fois que la méthode sera invoquée
		System.out.println("Code executed."); 
		int x1 = this.getWidth()/4;
		int y1 = this.getHeight()/4;
		Font font = new Font("Courier", Font.BOLD, 40);
	    g.setFont(font);
	    g.setColor(Color.red);    
		g.drawString("Tiens ! Le Site du Zéro !", x1, y1);
	}  
}
