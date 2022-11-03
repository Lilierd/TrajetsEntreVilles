package fen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre2 extends JFrame {
	private PanneauRectAnim pan = new PanneauRectAnim();
	private JPanel container = new JPanel();
	
	private boolean animated = true;
	private int compteur = 0;
	
	public Fenetre2() {
		this.setTitle("yolo");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setUndecorated(false);
	    container.setBackground(Color.white);
	    container.setLayout(new BorderLayout());
	    container.add(pan, BorderLayout.CENTER);
		this.setContentPane(container);
		this.setVisible(true);
		go();
		
	}
	
	private void go() {
		int x = pan.getPosX(), y = pan.getPosY();
		boolean BackX = false;
		boolean BackY = false;
			
		while(this.animated) {	//Boucle infinie
			
			pan.setPosY(--y);
			
			
			pan.repaint();
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
