package net.lecnam.trajets;

import java.util.ArrayList;

public class TrajetHandler {
	Carte carte;
	ArrayList<Trajet> trajetFinal;
	
	public TrajetHandler(Carte map) {
		this.carte = map;
	}
	
	private Trajet getShorterRoute(Ville villeDepart) {
		ArrayList<Trajet> trajets = new ArrayList<Trajet>();
		for(Trajet t : this.carte.getTrajets()) {
			if(t.getVille1().getNom() == villeDepart.getNom()
					|| t.getVille2().getNom() == villeDepart.getNom())
				trajets.add(t);
		}
		Trajet shorterTrajet = this.carte.getTrajets().get(0);
		int dist = shorterTrajet.getLongueur();
		for(Trajet t : trajets) {
			if(dist > t.getLongueur()) {
				dist = t.getLongueur();
				shorterTrajet = t;
			}
		}
		return shorterTrajet;
	}
	
	public Carte getCarte() {
		return carte;
	}
	
	public void setCarte(Carte carte) {
		this.carte = carte;
	}

	public ArrayList<Trajet> getTrajetFinal(Ville villeDepart, Ville villeArrivee) {
		Ville currentCity = villeDepart;
		
		while(currentCity.getNom() != villeArrivee.getNom()) {
			Trajet t = this.getShorterRoute(currentCity);
			trajetFinal.add(t);
			if(currentCity.getNom() == t.getVille1().getNom())
				currentCity = t.getVille2();
			else
				currentCity = t.getVille1();
		}
		
		return trajetFinal;
	}
}
