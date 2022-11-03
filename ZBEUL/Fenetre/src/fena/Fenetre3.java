package fena;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre3 extends JFrame{
	private JButton button = new JButton("Mein Button");
	
	public Fenetre3() {
		this.setTitle("Tableau");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setUndecorated(false);
	    //On définit le layout à utiliser sur le content pane
	    //Trois lignes sur deux colonnes
	    this.setLayout(new GridLayout(3, 2));
	    //On ajoute le bouton au content pane de la JFrame
	    this.getContentPane().add(new JButton("1"));
	    this.getContentPane().add(new JButton("2"));
	    this.getContentPane().add(new JButton("3"));
	    this.getContentPane().add(new JButton("4"));
	    this.getContentPane().add(new JButton("5"));
		this.setVisible(true);
	}
}
