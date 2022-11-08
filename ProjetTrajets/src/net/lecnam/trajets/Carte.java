package net.lecnam.trajets;

import java.util.ArrayList;

public class Carte {
	private ArrayList<Trajet> trajets;
	
	public Carte(ArrayList<Trajet> trajets) {
		this.trajets = trajets;
	}
	
	public void construireCarte() {
		
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
