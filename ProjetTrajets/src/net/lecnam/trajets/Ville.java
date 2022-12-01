package net.lecnam.trajets;

/**
 * Classe représentant une ville.
 * Elle possède quatre attributs : 
 * - nom : nom de la ville
 * - visitee : booléen permettant de savoir si la ville a été visitée (utilisé lors des calcul de plus court chemin)
 * - distance : entier permettant de connaître la distance par rapport à la ville précédente (utilisé lors des calcul de plus court chemin)
 * - pere : ville précédente dans le calcul du plus court chemin
 */
public class Ville {
	private String nom;
	private boolean visitee;
	private int distance;
	private Ville pere;
	
	/**
	 * Constructeur de la classe Ville
	 * @param name : nom de la ville
	 */
	public Ville(String name) {
		this.nom = name;
		this.visitee = false;
		this.distance = 999999;
		this.pere = null;
	}

	/**
	 * Méthode permettant de récupérer le nom de la ville
	 * @return this.nom
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * Méthode permettant de modifier le nom de la ville
	 * @param nom : nom de la ville
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Méthode permettant de savoir si une ville est visitée
	 * @return this.visitee
	 */
	public boolean estVisitee() {
		return this.visitee;
	}

	/**
	 * Méthode permettant de passer une ville à visitée ou non visitée (pour l'algo)
	 * @param isVisited : est visitee
	 */
	public void setVisitee(boolean isVisited) {
		this.visitee = isVisited;
	}
	
	/**
	 * Méthode permettant de récupérer la distance de la ville par rapport à la précédente (pour l'algo)
	 * @return this.distance
	 */
	public int getDistance(){
		return this.distance;
	}

	/**
	 * Méthode permettant de changer la distance de la ville par rapport à la précédente (pour l'algo)
	 * @param d : distance
	 */
	public void setDistance(int d){
		this.distance = d;
	}

	/**
	 * Méthode permettant de récupérer la ville précédente (pour l'algo)
	 * @return this.pere
	 */
	public Ville getPere(){
		return this.pere;
	}

	/**
	 * Méthode permettant de changer la ville précédente (pour l'algo)
	 * @param isVisited : est visitee
	 */
	public void setPere(Ville v){
		this.pere = v;
	}
	
}
