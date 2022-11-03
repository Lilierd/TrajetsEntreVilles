package fena;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame{
	private JButton button = new JButton("Mein Button");
	
	public Fenetre() {
		this.setTitle("Bouton");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setUndecorated(false);
		this.getContentPane().add(button);
		this.setVisible(true);
	}
}
