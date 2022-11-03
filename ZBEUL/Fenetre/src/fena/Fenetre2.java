package fena;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre2 extends JFrame{
	private JButton button = new JButton("Mein Button");
	
	public Fenetre2() {
		this.setTitle("Cardinal");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setUndecorated(false);
	    //On définit le layout à utiliser sur le content pane
	    this.setLayout(new BorderLayout());
	    //On ajoute le bouton au content pane de la JFrame
	    //Au centre
	    this.getContentPane().add(new JButton("CENTER"), BorderLayout.CENTER);
	    //Au nord
	    this.getContentPane().add(new JButton("NORTH"), BorderLayout.NORTH);
	    //Au sud
	    this.getContentPane().add(new JButton("SOUTH"), BorderLayout.SOUTH);
	    //À l'ouest
	    this.getContentPane().add(new JButton("WEST"), BorderLayout.WEST);
	    //À l'est
	    this.getContentPane().add(new JButton("EAST"), BorderLayout.EAST);
		this.setVisible(true);
	}
}
