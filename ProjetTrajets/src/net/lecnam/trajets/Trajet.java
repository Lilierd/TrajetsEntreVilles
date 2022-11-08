package net.lecnam.trajets;

public class Trajet {
	private Ville ville1;
	private Ville ville2;
	private int longueur;
	
	public Trajet(Ville city1, Ville city2, int length) {
		this.ville1 = city1;
		this.ville2 = city2;
		this.longueur = length;
	}

	public Ville getVille1() {
		return this.ville1;
	}

	public void setVille1(Ville ville1) {
		this.ville1 = ville1;
	}

	public Ville getVille2() {
		return this.ville2;
	}

	public void setVille2(Ville ville2) {
		this.ville2 = ville2;
	}

	public int getLongueur() {
		return this.longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}
	
	
}
