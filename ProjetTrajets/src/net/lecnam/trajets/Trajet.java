package net.lecnam.trajets;

/**
 * Classe permettant de représenter un trajet direct entre deux villes.
 * Elle possède trois attributs : 
 * - ville1 : ville de départ
 * - ville2 : ville d'arrivée
 * - longueur : longueur du trajet
 */
public class Trajet {
	private Ville ville1;
	private Ville ville2;
	private int longueur;
	
	/**
	 * Constructeur de la classe trajet.
	 * @param city1 : ville de départ
	 * @param city2 : ville d'arrivée
	 * @param length : longeur du trajet
	 */
	public Trajet(Ville city1, Ville city2, int length) {
		this.ville1 = city1;
		this.ville2 = city2;
		this.longueur = length;
	}

	/**
	 * Méthode permettant de récupérer la ville de départ
	 * @return this.ville1
	 */
	public Ville getVille1() {
		return this.ville1;
	}

	/**
	 * Méthode permettant de modifier la ville de départ
	 * @param ville1 : ville de départ
	 */
	public void setVille1(Ville ville1) {
		this.ville1 = ville1;
	}

	/**
	 * Méthode permettant de récupérer la ville d'arrivée
	 * @return this.ville1
	 */
	public Ville getVille2() {
		return this.ville2;
	}

	/**
	 * Méthode permettant de modifier la ville d'arrivée
	 * @param ville2 : ville d'arrivée
	 */
	public void setVille2(Ville ville2) {
		this.ville2 = ville2;
	}

	/**
	 * Méthode permettant de récupérer la longueur du trajet
	 * @return this.ville1
	 */
	public int getLongueur() {
		return this.longueur;
	}

	/**
	 * Méthode permettant de modifier la longueur du trajet
	 * @param longueur : longueur du trajet
	 */
	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}
	
	
}
