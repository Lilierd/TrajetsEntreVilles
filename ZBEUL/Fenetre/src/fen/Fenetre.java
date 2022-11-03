package fen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
	private PanneauOvalAnimBouton pan = new PanneauOvalAnimBouton();
	private Bouton bouton = new Bouton("Go");
	private Bouton bouton2 = new Bouton ("Stop");
	private JPanel container = new JPanel();
	private JPanel inter = new JPanel();
	private JLabel label = new JLabel("Le JLabel");
	
	private boolean animated = true;
	private int compteur = 0;
	
	int x1, y1, x2, y2;
	boolean BackX1,	BackY1,	BackX2,	BackY2;
	
	private Thread t;
	
	public Fenetre() {
		this.setTitle("yolo");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setUndecorated(false);
		bouton.addActionListener(new BoutonListener());
		bouton.setEnabled(false);
		bouton2.addActionListener(new Bouton2Listener());
		bouton2.addActionListener(new Bouton3Listener());
		//Définition d'une police d'écriture
		Font police = new Font("Tahoma", Font.BOLD, 16);
		  //On l'applique au JLabel
		label.setFont(police);
		  //Changement de la couleur du texte
		label.setForeground(Color.blue);
		  //On modifie l'alignement du texte grâce aux attributs statiques
		  //de la classe JLabel
		label.setHorizontalAlignment(JLabel.CENTER);
		inter.setBackground(Color.white);
		inter.add(bouton);
		inter.add(bouton2);
	    container.setBackground(Color.white);
	    container.setLayout(new BorderLayout());
	    container.add(pan, BorderLayout.CENTER);
	    container.add(inter, BorderLayout.SOUTH);
	    container.add(label, BorderLayout.NORTH);
		this.setContentPane(container);
		this.setVisible(true);
		while(animated) {
			go();
		}
	}
	
	private void go() {
		x1 = pan.getPosX1(); y1 = pan.getPosY1();
		x2 = pan.getPosX2(); y2 = pan.getPosY2();
		BackX1 = false;
		BackY1 = false;
		BackX2 = false;
		BackY2 = false;
			
		while(this.animated) {	//Boucle infinie
			if(x1<1)
				BackX1 = false;
			if(x1 > pan.getWidth()-50)
				BackX1 = true;
			
			if(y1<1)
				BackY1 = false;
			if(y1 > pan.getHeight()-50)
				BackY1 = true;
			
			if(!BackX1)
				pan.setPosX1(++x1);
			else
				pan.setPosX1(--x1);
			
			if(!BackY1)
				pan.setPosY1(++y1);
			else
				pan.setPosY1(--y1);
			

			if(x2<1)
				BackX2 = false;
			if(x2 > pan.getWidth()-50)
				BackX2 = true;
			
			if(y2<1)
				BackY2 = false;
			if(y2 > pan.getHeight()-50)
				BackY2 = true;
			
			if(!BackX2)
				pan.setPosX2(++x2);
			else
				pan.setPosX2(--x2);
			
			if(!BackY2)
				pan.setPosY2(++y2);
			else
				pan.setPosY2(--y2);
			
			
			pan.repaint();
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	//Méthode qui sera appelée lors d'un clic sur le bouton
	  //Classe écoutant notre premier bouton
	  class BoutonListener implements ActionListener{
	    //Redéfinition de la méthode actionPerformed()
	    public void actionPerformed(ActionEvent arg0) {
	      label.setText("Vous avez cliqué sur le bouton Go");
	      animated = true;
	      t = new Thread(new PlayAnimation());
	      t.start();
	      bouton.setEnabled(false);
	      bouton2.setEnabled(true);
	    }
	  }
	      
	  //Classe écoutant notre second bouton
	  class Bouton2Listener implements ActionListener{
	    //Redéfinition de la méthode actionPerformed()
	    public void actionPerformed(ActionEvent e) {
	      label.setText("Vous avez cliqué sur le bouton 2");
	      animated = false;
	      bouton.setEnabled(true);
	      bouton2.setEnabled(false);
	    }
	  }      
	  
	  class Bouton3Listener implements ActionListener {
		  public void actionPerformed(ActionEvent f) {
			  System.out.println("Yolo");
		  }
	  }
	  
	  class PlayAnimation implements Runnable{
		  public void run() {
			  go();
		  }
	  }
}
