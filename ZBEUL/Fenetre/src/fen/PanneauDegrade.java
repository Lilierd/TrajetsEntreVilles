package fen;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PanneauDegrade extends JPanel{
	public void paintComponent(Graphics g){
		
		//drawImage(Image img, int x, int y, Observer obs);
		//drawImage(Image img, int x, int y, int width, int height, Observer obs); --> Pour adapter la taille de l'image
		
	    //Vous verrez cette phrase chaque fois que la méthode sera invoquée
		System.out.println("Code executed."); 
		int x1 = this.getWidth()/4;
		int y1 = this.getHeight()/4;
		Graphics2D g2d = (Graphics2D)g;         
	    GradientPaint gp = new GradientPaint(0, 0, Color.RED, 30, 0, Color.cyan, true);                
	    g2d.setPaint(gp);
	    g2d.fillOval(0, 0, this.getWidth(), this.getHeight());
	}  
}
