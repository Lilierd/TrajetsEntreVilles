package fr.lilierd.anim;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

public class Fenetre extends JFrame {
	private Panneau pan = new Panneau();
	private JPanel container = new JPanel();
	
	private Color fondBouton = Color.white;
	private FormeListener fListener = new FormeListener();
	private CouleurFormeListener cListener = new CouleurFormeListener();
	
	private JMenuBar menuBar = new JMenuBar();
	private JMenu fichier = new JMenu("Fichier"),
		    edition = new JMenu("Edition"),
		    forme = new JMenu("Forme du pinceau"),
		    couleur = new JMenu("Couleur du pinceau");
	private JMenuItem rond = new JMenuItem("Rond"),
			carre = new JMenuItem("Carré");
	private JMenuItem annuler = new JMenuItem("Annuler");
	private JMenuItem rouge = new JMenuItem("Rouge"),
			vert = new JMenuItem("Vert"),
			bleu = new JMenuItem("Bleu"),
			gomme = new JMenuItem("Gomme");
	private JMenuItem effacer = new JMenuItem("Effacer"),
			quitter = new JMenuItem("Quitter");
	
	private ButtonGroup bg = new ButtonGroup();
	private JToolBar toolBar = new JToolBar();
	private JButton circle = new JButton(new ImageIcon("images/rond.png")),
			square = new JButton(new ImageIcon("images/carre.png"));
	private JButton	red = new JButton(new ImageIcon("images/red.png")),
			green = new JButton(new ImageIcon("images/green.png")),
			blue = new JButton(new ImageIcon("images/blue.png")),
			white = new JButton(new ImageIcon("images/gomme.png"));
	
	public Fenetre(){
	    this.setTitle("");
	    this.setSize(700, 500);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	 
	    container.setBackground(Color.white);
	    container.setLayout(new BorderLayout());
	    
	    //this.initPopup();
	    
	    container.add(pan, BorderLayout.CENTER);
	    
	    this.setContentPane(container);
	    this.initMenu();
	    this.initToolBar();
	    this.setVisible(true);          
	}
	
	public Fenetre(String str){
	    this.setTitle(str);
	    this.setSize(700, 500);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	 
	    container.setBackground(Color.white);
	    container.setLayout(new BorderLayout());
	    
	    //this.initPopup();
	    
	    container.add(pan, BorderLayout.CENTER);
	    
	    this.setContentPane(container);
	    this.initMenu();
	    this.initToolBar();
	    this.setVisible(true);          
	  }

	private void initToolBar() {
		this.square.setEnabled(true);
	    this.square.addActionListener(fListener);
	    this.square.setBackground(fondBouton);
	    this.circle.addActionListener(fListener);
	    this.circle.setBackground(fondBouton);
	    this.circle.setEnabled(false);

	    this.toolBar.add(circle);
	    this.toolBar.add(square);
	    this.toolBar.addSeparator();

	    //Ajout des Listeners
	    this.red.addActionListener(cListener);
	    this.red.setBackground(fondBouton);
	    this.toolBar.add(red);
	    this.red.setEnabled(false);

	    this.green.addActionListener(cListener);
	    this.green.setBackground(fondBouton);
	    this.toolBar.add(green);
	    this.green.setEnabled(true);

	    this.blue.setBackground(fondBouton);
	    this.blue.addActionListener(cListener);
	    this.toolBar.add(blue);
	    this.blue.setEnabled(true);
	    
	    this.toolBar.addSeparator();
	    
	    this.white.setBackground(fondBouton);
	    this.white.addActionListener(cListener);
	    this.toolBar.add(white);
	    this.white.setEnabled(true);

	    this.getContentPane().add(toolBar, BorderLayout.NORTH); 
		
	}

	private void initMenu() {
			//Menu fichier
		    effacer.addActionListener(new eraseListener());
		    effacer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
		    fichier.add(effacer);
		    fichier.addSeparator();
		    //Pour quitter l'application
		    quitter.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent event){
		        System.exit(0);
		      }
		    });
		    quitter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, KeyEvent.CTRL_DOWN_MASK));
		    fichier.add(quitter);
		    
		    //Menu Edition
		    //Groupe de boutons (formes et couleurs)
		    bg.add(carre);
		    bg.add(rond);
		    bg.add(rouge);
		    bg.add(vert);
		    bg.add(bleu);
		    bg.add(gomme);
		    
		    FormeListener fl = new FormeListener();  
		    carre.addActionListener(fl);
		    rond.addActionListener(fl);
		    
		    CouleurFormeListener cfl = new CouleurFormeListener();
		    rouge.addActionListener(cfl);
		    vert.addActionListener(cfl);
		    bleu.addActionListener(cfl);
		    gomme.addActionListener(cfl);

		    forme.add(rond);
		    forme.add(carre);
		    
		    couleur.add(rouge);
		    couleur.add(vert);
		    couleur.add(bleu);
		    couleur.addSeparator();
		    couleur.add(gomme);

		    rond.setSelected(true);
		    rouge.setSelected(true);
		    
		    annuler.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_DOWN_MASK));
		    annuler.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
		    		pan.cancel();
		    	}
		    });
		    
		    edition.add(annuler);
		    edition.addSeparator();
		    edition.add(forme);
		    edition.add(couleur);

		    //Ajout des menus dans la barre de menus
		    menuBar.add(fichier);
		    menuBar.add(edition);

		    //Ajout de la barre de menus sur la fenêtre
		    this.setJMenuBar(menuBar);
		
	}
	
	class FormeListener implements ActionListener{
		  public void actionPerformed(ActionEvent e) {
		      //Si l'action vient d'un bouton radio du menu 
		      if(e.getSource().getClass().getName().equals("javax.swing.JMenuItem")) {
		    	  pan.setForme(((JMenuItem)e.getSource()).getText());
		    	  if(((JMenuItem)e.getSource()).getText() == "Carré") {
		    		  circle.setEnabled(true);
			          square.setEnabled(false);
		    	  }
		    	  else {
		    		  circle.setEnabled(false);
			          square.setEnabled(true);
		    	  }
		      }
		      else{
		        if(e.getSource() == square){
		          carre.doClick();
		          circle.setEnabled(true);
		          square.setEnabled(false);
		        }
		        else if(e.getSource() == circle){
		          rond.doClick();
		          circle.setEnabled(false);
		          square.setEnabled(true);
		        }
		      }
		    }   
	  }
	
	class CouleurFormeListener implements ActionListener{
	    public void actionPerformed(ActionEvent e) {
	    	if(e.getSource().getClass().getName().equals("javax.swing.JMenuItem")) {
	    	  if(e.getSource() == vert) {
	    		  pan.setCouleurForme(Color.green);
	    		  red.setEnabled(true);
	    		  blue.setEnabled(true);
	    		  green.setEnabled(false);
	    		  white.setEnabled(true);
	    	  }
	  	      else if (e.getSource() == bleu) {
	  	    	  pan.setCouleurForme(Color.blue);
	  	    	  red.setEnabled(true);
	  	    	  blue.setEnabled(false);
	  	    	  green.setEnabled(true);
	  	    	  white.setEnabled(true);
	  	      }
	  	      else if(e.getSource() == rouge) {
	  	    	  pan.setCouleurForme(Color.red); 
	  	    	  red.setEnabled(false);
	  	    	  blue.setEnabled(true);
	  	    	  green.setEnabled(true);
	  	    	  white.setEnabled(true);
	  	      }
	  	      else if(e.getSource() == gomme) {
	  	    	  	pan.setCouleurForme(Color.white); 
	  	    	  	red.setEnabled(true);
  	    	  		blue.setEnabled(true);
  	    	  		green.setEnabled(true);
  	    	  		white.setEnabled(false);
	  	      }
	    	}
		        
	    	else{
	    		if(e.getSource() == green){
	    			vert.doClick();
	    			red.setEnabled(true);
	    			blue.setEnabled(true);
	    			green.setEnabled(false);
		        }
	    		else if(e.getSource() == blue){
	    			bleu.doClick();
	    			red.setEnabled(true);
	    			blue.setEnabled(false);
	    			green.setEnabled(true);
	    		}
	    		else if(e.getSource() == red){
	    			rouge.doClick();
	    			red.setEnabled(false);
	    			blue.setEnabled(true);
	    			green.setEnabled(true);
	    		}
	    		else if(e.getSource() == white){
	    			gomme.doClick();
	    			red.setEnabled(true);
	    			blue.setEnabled(true);
	    			green.setEnabled(true);
	    			white.setEnabled(false);
	    		}
	    	} 
	    }
	}
	
	class eraseListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			pan.erase();
		}
	}
	
	
}
