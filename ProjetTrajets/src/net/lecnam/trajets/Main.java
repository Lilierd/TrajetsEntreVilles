package net.lecnam.trajets;

import java.io.FileNotFoundException;

public class Main {
	public static void main(String[] args) {
<<<<<<< Updated upstream
		Carte c = new Carte();
		try {
			c.construireCarte("carte.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TrajetHandler th = new TrajetHandler(c);
		th.getTrajetFinal(c.getTrajets().get(1).getVille1(), c.getTrajets().get(5).getVille1());
=======
		
>>>>>>> Stashed changes
	}
}
