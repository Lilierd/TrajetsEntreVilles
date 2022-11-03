package fen;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PanneauImage extends JPanel{
	public void paintComponent(Graphics g){
		
		//drawImage(Image img, int x, int y, Observer obs);
		//drawImage(Image img, int x, int y, int width, int height, Observer obs); --> Pour adapter la taille de l'image
		
	    //Vous verrez cette phrase chaque fois que la méthode sera invoquée
		System.out.println("Code executed."); 
		int x1 = this.getWidth()/4;
		int y1 = this.getHeight()/4;
		try {
		      Image img = ImageIO.read(new File("image.jpg"));
		      g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		      //Pour une image de fond
		      //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		} catch (IOException e) {
		      e.printStackTrace();
		}		
	}  
}
