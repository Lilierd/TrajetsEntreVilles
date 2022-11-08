package net.lecnam.trajets;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Carte {
	private ArrayList<Trajet> trajets;
	
	public Carte() {
		this.trajets = new ArrayList<Trajet>();
	}
	
	public void construireCarte(String fichier) throws FileNotFoundException {
		File myFile = new File(fichier);
		Scanner s = new Scanner(myFile);
		s.useDelimiter(" ");
		while(s.hasNext()) {
			
		}
	}
	
	public ArrayList<Trajet> getTrajets(){
		return this.trajets;
	}
	
	public void setTrajets(ArrayList<Trajet> trajets) {
		this.trajets = trajets;
	}
	
	public void addTrajet(Trajet t) {
		this.trajets.add(t);
	}
}
