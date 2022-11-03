package fr.lilierd.anim;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Panneau extends JPanel {
	private int posX = -10;
	private int posY = -10;
	private int taille = 15;
	private String forme = "ROND";
	private Color couleurForme = Color.red;
	private boolean effacement = true;
	private ArrayList<Point> listePoint = new ArrayList<Point>();
	
	public Panneau(){

	    this.addMouseListener(new MouseAdapter(){
	      public void mousePressed(MouseEvent e){
	        listePoint.add(new Point(e.getX() - (taille / 2), e.getY() - (taille / 2), taille, couleurForme, forme));
	        repaint();
	      }
	    });

	    this.addMouseMotionListener(new MouseMotionListener(){
	      public void mouseDragged(MouseEvent e) {
	        //On récupère les coordonnées de la souris et on enlève la moitié de la taille du pointeur pour centrer le tracé
	    	  listePoint.add(new Point(e.getX() - (taille / 2), e.getY() - (taille / 2), taille, couleurForme, forme));
	        repaint();
	      }

	      public void mouseMoved(MouseEvent e) {}
	    });
	  }
	
	public void paintComponent(Graphics g){
	    g.setColor(Color.white);
	    g.fillRect(0, 0, this.getWidth(), this.getHeight());
	    
	    if(this.effacement) {
	    	this.effacement = false;
	    }
	    else {
	    	for(Point p : this.listePoint) {
	    		g.setColor(p.getColor());
	    		if(p.getShape().equals("CARRE") || p.getShape().equals("CARRÉ"))
	    			g.fillRect(p.getX(), p.getY(), p.getSize(), p.getSize());
	    		else
	    			g.fillOval(p.getX(), p.getY(), p.getSize(), p.getSize());
	    	}
	    }
	}
	
	public void erase() {
		this.effacement = true;
		this.listePoint = new ArrayList<Point>();
		repaint();
	}
	
	public void setForme(String form){
	    this.forme = form.toUpperCase();
	}
	  
	public void setCouleurForme(Color color) {
		this.couleurForme = color;
	}
	
	public void cancel() {
		if(listePoint.size() > 0) {
			listePoint.remove(listePoint.size()-1);
			repaint();			
		}
		else if(listePoint.size() > 1) {
			listePoint.remove(listePoint.size()-1);
			listePoint.remove(listePoint.size()-2);
			repaint();		
		}
		else {
			JOptionPane jop = new JOptionPane();
			jop.showMessageDialog(null, "Il n'y a plus rien à annuler", "Erreur", JOptionPane.ERROR_MESSAGE);
		}

	}
}
