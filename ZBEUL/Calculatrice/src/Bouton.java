

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;

public class Bouton extends JButton implements MouseListener {
	private String name;
	private Image img;
	
	public Bouton(String str){
	    super(str);
	    this.name = str;
	    //Grâce à cette instruction, notre objet va s'écouter
	    //Dès qu'un événement de la souris sera intercepté, il en sera averti
	    this.addMouseListener(this);
	}
	  
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
	    g2d.setColor(Color.black);
	    
	    FontMetrics fm = g2d.getFontMetrics();
	    int height = fm.getHeight();
	    int width = fm.stringWidth(this.name);
	    g2d.drawString(this.name, this.getWidth() / 2 - (width /2), (this.getHeight() / 2) + (height /4));
	
	}
	
	 //Méthode appelée lors du clic de souris
	  public void mouseClicked(MouseEvent event) { }

	  //Méthode appelée lors du survol de la souris
	  public void mouseEntered(MouseEvent event) {
		  
	  }

	  //Méthode appelée lorsque la souris sort de la zone du bouton
	  public void mouseExited(MouseEvent event) {
		  
	  }

	  //Méthode appelée lorsque l'on presse le bouton gauche de la souris
	  public void mousePressed(MouseEvent event) {
		  
	  }

	  //Méthode appelée lorsque l'on relâche le clic de souris
	  public void mouseReleased(MouseEvent event) {
		  	  
	  }
}
