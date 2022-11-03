package fr.lilierd.anim;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panneau extends JPanel {
	private int posX = -50;
	  private int posY = -50;
	  private String forme = "ROND";
	  private int drawSize = 50;
	  private boolean morph = false, reduce = false;
	  private int increment = 0;

	  public void paintComponent(Graphics g){
	    //On choisit une couleur de fond pour le rectangle
	    g.setColor(Color.white);
	    //On le dessine de sorte qu'il occupe toute la surface
	    g.fillRect(0, 0, this.getWidth(), this.getHeight());
	    //On redéfinit une couleur pour le rond
	    g.setColor(Color.red);
	    //On délègue la méthode de dessin à la méthode draw()
	    if(this.morph)
	    	drawMorph(g);  
	    else
	    	draw(g);
	  }
	 
	  private void draw(Graphics g){      
	    if(this.forme.equals("ROND")){
	      g.fillOval(posX, posY, 50, 50); 
	    }
	    if(this.forme.equals("CARRE")){
	      g.fillRect(posX, posY, 50, 50);
	    }
	    if(this.forme.equals("TRIANGLE")){
	      //Calcul des sommets            
	      //Le sommet 1 se situe à la moitié du côté supérieur du carré
	      int s1X = posX + 25;
	      int s1Y = posY;
	      //Le sommet 2 se situe en bas à droite
	      int s2X = posX + 50;
	      int s2Y = posY + 50;
	      //Le sommet 3 se situe en bas à gauche
	      int s3X = posX;
	      int s3Y = posY + 50;      
	      //Nous créons deux tableaux de coordonnées
	      int[] ptsX = {s1X, s2X, s3X};
	      int[] ptsY = {s1Y, s2Y, s3Y};      
	      //Nous utilisons la méthode fillPolygon()
	      g.fillPolygon(ptsX, ptsY, 3);
	    }
	    if(this.forme.equals("ETOILE")){      
	      //Pour l'étoile, on se contente de tracer des lignes dans le carré
	      //correspondant à peu près à une étoile...
	      //Mais ce code peut être amélioré !
	      int s1X = posX + 25;
	      int s1Y = posY;
	      int s2X = posX + 50;
	      int s2Y = posY + 50;        
	      g.drawLine(s1X, s1Y, s2X, s2Y);      
	      int s3X = posX;
	      int s3Y = posY + 17;
	      g.drawLine(s2X, s2Y, s3X, s3Y);      
	      int s4X = posX + 50;
	      int s4Y = posY + 17;
	      g.drawLine(s3X, s3Y, s4X, s4Y);            
	      int s5X = posX;
	      int s5Y = posY + 50;
	      g.drawLine(s4X, s4Y, s5X, s5Y);       
	      g.drawLine(s5X, s5Y, s1X, s1Y);  
	    }
	  }
	  
	//Méthode qui peint le morphing
	  private void drawMorph(Graphics g){
	    //On incrémente
	    increment++;
	    //On regarde si on doit réduire ou non
	    if(drawSize >= 50) reduce = true;
	    if(drawSize <= 10) reduce = false;    
	    if(reduce)
	      drawSize -= getUsedSize();
	    else
	      drawSize += getUsedSize();
	    
	    if(this.forme.equals("ROND")){
	      g.fillOval(posX, posY, drawSize, drawSize); 
	    }
	    if(this.forme.equals("CARRE")){
	      g.fillRect(posX, posY, drawSize, drawSize);
	    }
	    if(this.forme.equals("TRIANGLE")){        
	      int s1X = posX + drawSize/2;
	      int s1Y = posY;
	      int s2X = posX + drawSize;
	      int s2Y = posY + drawSize;
	      int s3X = posX;
	      int s3Y = posY + drawSize;      
	      int[] ptsX = {s1X, s2X, s3X};
	      int[] ptsY = {s1Y, s2Y, s3Y};      
	      g.fillPolygon(ptsX, ptsY, 3);
	    }
	    if(this.forme.equals("ETOILE")){      
	      int s1X = posX + drawSize/2;
	      int s1Y = posY;
	      int s2X = posX + drawSize;
	      int s2Y = posY + drawSize;      
	      g.drawLine(s1X, s1Y, s2X, s2Y);      
	      int s3X = posX;
	      int s3Y = posY + drawSize/3;
	      g.drawLine(s2X, s2Y, s3X, s3Y);      
	      int s4X = posX + drawSize;
	      int s4Y = posY + drawSize/3;
	      g.drawLine(s3X, s3Y, s4X, s4Y);                   
	      int s5X = posX;
	      int s5Y = posY + drawSize;
	      g.drawLine(s4X, s4Y, s5X, s5Y);       
	      g.drawLine(s5X, s5Y, s1X, s1Y);  
	    }    
	  }
	  
	  //Retourne le nombre à retrancher ou à ajouter pour le morphing
	  private int getUsedSize(){
	    int res = 0;
	    //Si le nombre de tours est de dix, on réinitialise l'incrément et on retourne 1
	    if(increment / 20 == 1){
	      increment = 0;
	      res = 1;
	    }    
	    return res;
	  }
	  
	  public int getDrawSize(){
	    return drawSize;
	  }
	  
	  public boolean isMorph(){
	    return morph;
	  }
	  
	  public void setMorph(boolean bool){
	    this.morph = bool;
	    //On réinitialise la taille
	    drawSize = 50;
	  }
	  
	  public void setForme(String form){
	    this.forme = form;
	  }
	  
	  public int getPosX() {
	    return posX;
	  }
	 
	  public void setPosX(int posX) {
	    this.posX = posX;
	  }
	 
	  public int getPosY() {
	    return posY;
	  }
	 
	  public void setPosY(int posY) {
	    this.posY = posY;
	  }
}
