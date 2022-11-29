package net.lecnam.trajets;


public class Ville {
	private String nom;
	private boolean visitee;
	private int distance;
	
	public Ville(String name) {
		this.nom = name;
		this.visitee = false;
		this.distance = Integer.MAX_VALUE;
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

	public int getDistance() {
		return this.distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
}
