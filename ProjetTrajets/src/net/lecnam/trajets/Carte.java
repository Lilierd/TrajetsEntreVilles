package net.lecnam.trajets;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe permettant de représenter une carte.
 * Elle possède deux attributs : 
 * - un tableau de trajets : ensemble des trajets sur la carte
 * - un tableau de villes : ensemble des villes sur la carte
 */
public class Carte {
	private ArrayList<Trajet> trajets;
	private ArrayList<Ville> villes;
	
	/**
	 * Constructeur de la classe Carte
	 */
	public Carte() {
		this.trajets = new ArrayList<Trajet>();
		this.villes = new ArrayList<Ville>();
	}
	
	/**
	 * Méthode permettant de construire la carte à partir d'un fichier
	 * @param fichier : nom du fichier à utiliser pour créer la carte
	 */
	public void construireCarte(String fichier) throws FileNotFoundException {
		File myFile = new File(fichier);
		Scanner s = new Scanner(myFile);
		s.useDelimiter(" ");
		while(s.hasNext()) {
			Ville ville1 = new Ville(s.next().replaceAll("\\s", ""));
			Ville ville2 = new Ville(s.next().replaceAll("\\s", ""));
			boolean present = false;
			int i = 0;
			while(i < this.villes.size() && present == false){
				if(this.villes.get(i).getNom().equals(ville1.getNom())){
					present = true;
				}
				i++;
			}
			if(present == false){
				this.villes.add(ville1);
			}
			present = false;
			i = 0;
			while(i < this.villes.size() && present == false){
				if(this.villes.get(i).getNom().equals(ville2.getNom())){
					present = true;
				}
				i++;
			}
			if(present == false){
				this.villes.add(ville2);
			}
			int distance = Integer.parseInt(s.next());
			Trajet t = new Trajet(ville1, ville2, distance);
			this.addTrajet(t);
			t = new Trajet(ville2, ville1, distance);
			this.addTrajet(t);
		}
		s.close();
	}
	
	/**
	 * Méthode permettant de récupérer les trajets
	 * @return this.trajets
	 */
	public ArrayList<Trajet> getTrajets(){
		return this.trajets;
	}
	
	/**
	 * Méthode permettant de modifier le tableau de trajets
	 * @param trajets : tableau de trajets
	 */
	public void setTrajets(ArrayList<Trajet> trajets) {
		this.trajets = trajets;
	}
	
	/**
	 * Méthode permettant d'ajouter un trajet à la liste des trajets
	 * @param t : trajet
	 */
	public void addTrajet(Trajet t) {
		this.trajets.add(t);
	}

	/**
	 * Méthode permettant de récupérer les villes
	 * @return this.villes
	 */
	public ArrayList<Ville> getVilles(){
		return this.villes;
	}

	/**
	 * Méthode permettant de récupérer le nombre de trajets sur la carte
	 * @return int
	 */
	public int getNbTrajets(){
		return this.trajets.size();
	}

	/**
	 * Méthode permettant de récupérer le nombre de villes sur la carte
	 * @return int
	 */
	public int getNbVilles(){
		return this.villes.size();
	}

	/**
	 * Méthode permettant de récupérer tous les trajets dont la ville de départ est nomVille
	 * @return trajets : ArrayList<Ville>
	 */
	public ArrayList<Trajet> getTrajetFromVille(String nomVille){
		ArrayList<Trajet> trajets = new ArrayList<Trajet>();
		for(int i = 0; i<this.trajets.size(); i++){
			if(this.trajets.get(i).getVille1().getNom().equals(nomVille)){
				trajets.add(this.trajets.get(i));
			}
		}
		return trajets;
	}

	/**
	 * Méthode permettant de récupérer la 1ère ville non visitée du tableau
	 * @return min : Ville
	 */
	public Ville min(){
		Ville min = null;
		int j = 0;
		int sortie = 0;
		while(j < this.getNbVilles() && sortie == 0){
			if(this.villes.get(j).estVisitee() == false){
				min = this.villes.get(j);
				sortie = 1;
			}
			j++;
		}
		for(int i = 0; i < this.getNbVilles(); i++){
			if(this.villes.get(i).getDistance() < min.getDistance() && this.villes.get(i).estVisitee() == false){
				min = this.villes.get(i);
			}
		}
		return min;
	}

	/**
	 * Méthode permettant de récupérer l'indice de la ville dans le tableau de villes à partir de son nom
	 * @param nomVille : nom de la ville
	 * @return index : int
	 */
	public int getIndexOfVille(String nomVille){
		int index = 0;
		for(int i = 0; i < this.getNbVilles(); i++){
			if(this.villes.get(i).getNom().equals(nomVille)){
				index = i;
			}
		}
		return index;
	}

	/**
	 * Méthode permettant de récupérer la ville dans le tableau de villes à partir de son nom
	 * @param nomVille : nom de la ville
	 * @return v : Ville
	 */
	public Ville getVilleByName(String nomVille){
		Ville v = null;
		int n = 0;
		boolean stop = false;
		while(n < this.getNbVilles() && stop == false){
			if(this.villes.get(n).getNom().equals(nomVille)){
				v = this.villes.get(n);
				stop = true;
			}
			n++;
		}
		return v;
	}
}