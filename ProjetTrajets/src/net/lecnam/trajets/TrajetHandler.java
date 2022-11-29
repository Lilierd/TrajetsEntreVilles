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
	
	private ArrayList<Trajet> getPossibleTrajets(Ville villeOrigine){
		ArrayList<Trajet> trajetsPossibles = new ArrayList<Trajet>();
		
		for(Trajet t : this.carte.getTrajets()) {
			if(t.getVille1().getNom() == villeOrigine.getNom() || t.getVille2().getNom() == villeOrigine.getNom())
				trajetsPossibles.add(t);
		}
		
		return trajetsPossibles;
	}

	public ArrayList<Trajet> getTrajetFinal(Ville villeDepart, Ville villeArrivee) {
		villeDepart.setDistance(0);
		Ville currentCity = villeDepart;
		ArrayList<Trajet> trajetsPossibles;
		
		while(villeDepart.getNom() != villeArrivee.getNom()) {
			trajetsPossibles = new ArrayList<Trajet>();
			trajetsPossibles = getPossibleTrajets(currentCity);
			
			for(Trajet t : trajetsPossibles) {
				if(t.getVille1().getNom() == currentCity.getNom()) {
					if(t.getVille2().getDistance() + currentCity.getDistance()
						> t.getLongueur() + currentCity.getDistance())
						t.getVille2().setDistance(t.getLongueur() + currentCity.getDistance());
				}
				else if(t.getVille2().getNom() == currentCity.getNom()) {
					if(t.getVille1().getDistance() + currentCity.getDistance()
						> t.getLongueur() + currentCity.getDistance())
						t.getVille1().setDistance(t.getLongueur() + currentCity.getDistance());
				}
				System.out.println("currentCity distance : "+currentCity.getDistance() + " - ville1 distance : "
						+ t.getVille1().getDistance() + " - ville2 distance : " + t.getVille2().getDistance());
				
			}
		}
		return trajetFinal;
	}
}
