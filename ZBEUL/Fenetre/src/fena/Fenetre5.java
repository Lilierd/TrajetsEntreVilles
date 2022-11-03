package fena;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre5 extends JFrame{
	private JButton button = new JButton("Mein Button");
	
	public Fenetre5() {
		this.setTitle("Tableau");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setUndecorated(false);
		
		//Pareil qu'au Fenetre4
		
		//On crée un conteneur avec gestion horizontale
	    Box b1 = Box.createHorizontalBox();
	    b1.add(new JButton("Bouton 1"));
	    //Idem
	    Box b2 = Box.createHorizontalBox();
	    b2.add(new JButton("Bouton 2"));
	    b2.add(new JButton("Bouton 3"));
	    //Idem
	    Box b3 = Box.createHorizontalBox();
	    b3.add(new JButton("Bouton 4"));
	    b3.add(new JButton("Bouton 5"));
	    b3.add(new JButton("Bouton 6"));
	    //On crée un conteneur avec gestion verticale
	    Box b4 = Box.createVerticalBox();
	    b4.add(b1);
	    b4.add(b2);
	    b4.add(b3);

	    this.getContentPane().add(b4);
		this.setVisible(true);
	}
}
