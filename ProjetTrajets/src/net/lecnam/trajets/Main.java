package net.lecnam.trajets;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Carte c = new Carte();
		try {
			c.construireCarte("carte.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		TrajetHandler th = new TrajetHandler(c);
		th.dijkstra("Paris");
		//boolean bellman = th.bellman_ford("Paris");
		//System.out.println("\nReussi : "+bellman);
		ArrayList<Ville> fin = th.recupererChemin("Paris", "Marseille");
		th.afficherChemin("Paris", "Marseille", fin);
	}
}


