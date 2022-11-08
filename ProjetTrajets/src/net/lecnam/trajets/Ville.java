package net.lecnam.trajets;


public class Ville {
	private String nom;
	private boolean visitee;
	
	public Ville(String name) {
		this.nom = name;
		this.visitee = false;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public boolean estVisitee() {
		return visitee;
	}

	public void setVisitee(boolean isVisited) {
		this.visitee = visitee;
	}
	
	
}
