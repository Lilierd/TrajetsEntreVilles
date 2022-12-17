package net.lecnam.trajets;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class ImagePanel extends JFrame{

    JPanel panel = new JPanel();
<<<<<<< Updated upstream
=======
    
    //Bouton de lancement du calcul du chemin
    JButton bouton = new JButton("Calculer");
    
    //Gestion du trajet
    TrajetHandler th = new TrajetHandler("carte.txt");
    
    //Liste des lignes rouges indiquant le trajet � suivre (� afficher selon ce m�me trajet)
    ArrayList<Ligne> trajetsLigne = new ArrayList<Ligne>();
    
    //Texte d'affichage du r�sultat du calcul
    JTextArea texte = new JTextArea("");
    //Tableau des checkbox correspondants aux villes
>>>>>>> Stashed changes
    CheckBoite[] b = new CheckBoite[18];
    {
    b[1] = new CheckBoite("Rouen"); //Rouen
    b[2] = new CheckBoite("Lille"); //Lille
    b[3] = new CheckBoite("Paris"); //Paris
    b[4] = new CheckBoite("Strasbourg"); //Strasbourg
    b[5] = new CheckBoite("Brest"); //Brest
    b[6] = new CheckBoite("Rennes"); //Rennes
    b[7] = new CheckBoite("Nantes"); //Nantes
    b[8] = new CheckBoite("Dijon"); //Dijon
    b[9] = new CheckBoite("Lyon"); //Lyon
    b[10] = new CheckBoite("Limoges"); //Limoges
    b[11] = new CheckBoite("Clermont"); //Clermont
    b[12] = new CheckBoite("Grenoble"); //Grenoble
    b[13] = new CheckBoite("Bordeaux"); //Bordeaux
    b[14] = new CheckBoite("Toulouse"); //Toulouse
    b[15] = new CheckBoite("Montpellier"); //Montpellier
    b[16] = new CheckBoite("Marseille"); //Marseille
    b[17] = new CheckBoite("Nice"); //Nice
    }
    public ImagePanel()
    {
    	this.setTitle("Carte");
        try
        {
        	this.getContentPane().setBackground(Color.WHITE);
            panel.setBounds(50, 50, 550, 550);
<<<<<<< Updated upstream

            BufferedImage img = ImageIO.read(new File("carteprojet.png"));
            JLabel pic = new JLabel(new ImageIcon(img));
            panel.add(pic);

=======
            texte.setBounds(100, 525, 400, 100);
            texte.
            //texte.setText("yolodsgysgdfyuqshrfugyfusdhufhyqusdjfihqushdguhqiusdhjfuyuqhdfbhygsdfughuqsndjbgfuyqhgurhfgjkqsbdfuyigqeuzgbujkqhsueighusdbnfujhus");
            BufferedImage img = ImageIO.read(new File("carteprojet.png"));
            JLabel pic = new JLabel(new ImageIcon(img));
            panel.add(pic);
            add(texte);
>>>>>>> Stashed changes
            b[1].setBounds(224,181,15,15);
            add(b[1]);

            b[2].setBounds(297,139,15,15);
            add(b[2]);

            b[3].setBounds(281,216,15,15);
            add(b[3]);

            b[4].setBounds(433,245,15,15);
            add(b[4]);

            b[5].setBounds(116,245,15,15);
            add(b[5]);

            b[6].setBounds(185,254,15,15);
            add(b[6]);

            b[7].setBounds(186,302,15,15);
            add(b[7]);

            b[8].setBounds(363,295,15,15);
            add(b[8]);

            b[9].setBounds(362,361,15,15);
            add(b[9]);

            b[10].setBounds(239,359,15,15);
            add(b[10]);

            b[11].setBounds(292,359,15,15);
            add(b[11]);

            b[12].setBounds(385,394,15,15);
            add(b[12]);

            b[13].setBounds(193,392,15,15);
            add(b[13]);

            b[14].setBounds(251,431,15,15);
            add(b[14]);

            b[15].setBounds(301,437,15,15);
            add(b[15]);

            b[16].setBounds(362,447,15,15);
            add(b[16]);

            b[17].setBounds(420,439,15,15);
            add(b[17]);
            
            for(int i = 1; i < 18; i++) 
            {
            	
            }
            add(panel);
            setSize(665, 680);
            setResizable(false);
            setLayout(null);
            setVisible(true);
        }
        catch (IOException e) {}
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        
        g.setColor(Color.WHITE);
        g.fillRect(57, 80, 551, 60);
        
        g.setColor(Color.RED);
        ((Graphics2D) g).setStroke(new BasicStroke(2));
        
        ArrayList<Ligne> tableau = new ArrayList<Ligne>();

        tableau.add (new Ligne(430, 480, 385, 484, "Marseille", "Nice")); //Nice Marseille
        tableau.add (new Ligne(250,211,307,179, "Rouen", "Lille")); //Rouen Lille
        tableau.add (new Ligne(318,187,298,244, "Lille", "Paris")); //Lille Paris
        tableau.add (new Ligne(250,229,287,249, "Rouen", "Paris")); //Rouen Paris
        tableau.add (new Ligne(213,283,287,257, "Rennes", "Paris")); //Rennes Paris
        tableau.add (new Ligne(202,300,202,330, "Rennes", "Nantes")); //Rennes Nantes
        tableau.add (new Ligne(204,280,236,229, "Rennes", "Rouen")); //Rennes Rouen
        tableau.add (new Ligne(192,292,140,282, "Rennes", "Brest")); //Rennes Brest
        tableau.add (new Ligne(244,387,208,350, "Limoges", "Nantes")); //Limoges Nantes
        tableau.add (new Ligne(210,418,202,350, "Bordeaux", "Nantes")); //Bordeaux Nantes
        tableau.add (new Ligne(220,418,244,402, "Bordeaux", "Limoges")); //Bordeaux Limoges
        tableau.add (new Ligne(220,437,257,465, "Bordeaux", "Toulouse")); //Bordeaux Toulouse
        tableau.add (new Ligne(306,385,298,264, "Clermont", "Paris")); //Clermont Paris
        tableau.add (new Ligne(318,395,367,398, "Clermont", "Lyon")); //Clermont Lyon
        tableau.add (new Ligne(298,397,267,396, "Clermont", "Limoges")); //Clermont Limoges
        tableau.add (new Ligne(373,320,301,261, "Dijon", "Paris")); //Dijon Paris
        tableau.add (new Ligne(390,322,443,293, "Dijon", "Strasbourg")); //Dijon Strasbourg
        tableau.add (new Ligne(379,345,378,387, "Dijon", "Lyon")); //Dijon Lyon
        tableau.add (new Ligne(393,422,382,409, "Grenoble", "Lyon")); //Grenoble Lyon
        tableau.add (new Ligne(378, 472,376,409, "Marseille", "Lyon")); //Marseille Lyon
        tableau.add (new Ligne(324, 464,370,409, "Montpellier", "Lyon")); //Montpellier Lyon
        tableau.add (new Ligne(315, 463,307,406, "Montpellier", "Clermont")); //Montpellier Clermont
        tableau.add (new Ligne(307, 474,277,470, "Montpellier", "Toulouse")); //Montpellier Toulouse

        
        for(Ligne lin : tableau) {
        	for(int i = 1; i < 18; i++) {
        		if(/*Si les villes de lin correspondent aux villes du trajet*/true )
        			g2.draw(lin);
        	}
        }
        	
    }
    
    public static void main(String args[])
    {
        new ImagePanel();
    }
}





