package net.lecnam.trajets;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Classe permettant de réaliser les algorithmes de plus court chemin
 * Elle possède un attribut :
 * - carte : la carte sur laquelle on va effectuer les calculs
 */
public class TrajetHandler {
	Carte carte = new Carte();
	
    /**
     * Constructeur de la classe TrajetHandler
     * @param map : carte sur laquelle vont se faire les calculs
     */
	public TrajetHandler(Carte map) {
		this.carte = map;
	}
	
	/**
     * Second constructeur de la classe TrajetHandler
     * @param file : fichier texte de la carte sur laquelle vont se faire les calculs
     */
	public TrajetHandler(String file) {
		try {
			this.carte.construireCarte(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

    /**
	 * Algorithme de Dijkstra permettant de calculer les plus courts chemins jusqu'à chaque ville
	 * à partir de la ville de départ
	 * @param nomVille : ville de départ
	 */
	public void dijkstra(String nomVille){
		//On récupère la ville de départ à partir de son son nom puis on met sa distance à 0
		Ville depart = this.carte.getVilleByName(nomVille);
		depart.setDistance(0);
        ArrayList<Ville> villes = this.carte.getVilles();
		for(int i = 0; i < this.carte.getNbVilles()-1; i++){

			//On recupère la 1ère ville non visitée dans le tableau des villes et on la passe à visitée
			Ville v = this.carte.min();
			v.setVisitee(true);

			//On recupère les trajets dont le départ est la ville obtenue précédemment
			ArrayList<Trajet> trajetsFromVille = this.carte.getTrajetFromVille(v.getNom());

			/*
			 * Pour chaque trajet, on vérifie si la distance sur la ville d'arrivée 
			 * est supérieure à la distance sur la ville de départ + la longueur du trajet.
			 * Si c'est le cas, on a trouvé un trajet plus court que celui existant :
			 * on met donc à jour la distance de la ville d'arrivée et on lui affecte en père la ville
			 */

			for(int j = 0; j < trajetsFromVille.size(); j++){
				int indexV = this.carte.getIndexOfVille(trajetsFromVille.get(j).getVille2().getNom());
				if(villes.get(indexV).estVisitee() == false && villes.get(indexV).getDistance() > v.getDistance() + trajetsFromVille.get(j).getLongueur()){
					villes.get(indexV).setDistance(v.getDistance() + trajetsFromVille.get(j).getLongueur());
					villes.get(indexV).setPere(v);
				}
			}
		}
	}

	/**
	 * Algorithme de Bellman-Ford permettant de calculer les plus courts chemins jusqu'à chaque ville
	 * à partir de la ville de départ
	 * @param nomVille : ville de départ
	 * @return boolean : Algo réussi
	 */
	public boolean bellman_ford(String nomVille){
		//On récupère la ville de départ à partir de son son nom puis on met sa distance à 0
		Ville v = this.carte.getVilleByName(nomVille);
		v.setDistance(0);

		/**
		 * Pour chaque ville, on parcourt l'ensemble des trajets de la carte
		 * et on vérifie si la distance sur la ville d'arrivée 
		 * est supérieure à la distance sur la ville de départ + la longueur du trajet.
		 * Si c'est le cas, on a trouvé un trajet plus court que celui existant :
		 * on met donc à jour la distance de la ville d'arrivée et on lui affecte en père la ville
		 */
		for(int i = 0; i < this.carte.getNbVilles()-1; i++){
			for(int j = 0; j < this.carte.getNbTrajets(); j++){
				Trajet t = this.carte.getTrajets().get(j);
				Ville v1 = this.carte.getVilleByName(t.getVille1().getNom());
				Ville v2 = this.carte.getVilleByName(t.getVille2().getNom());
				if(v2.getDistance() > v1.getDistance() + t.getLongueur()){
					v2.setDistance(v1.getDistance() + t.getLongueur());
					v2.setPere(v1);
				}
			}
		}
		/**
		 * Cette boucle permet de vérifier la présence d'un circuit de poids négatif.
		 */
		for(int i = 0; i < this.carte.getNbTrajets(); i++){
			Trajet t = this.carte.getTrajets().get(i);
			if(t.getVille2().getDistance() > t.getVille1().getDistance() + t.getLongueur()){
				return false;
			}
		}
		return true;
	}

	/**
	 * Méthode permettant de récupérer le chemin entre la ville de départ et la ville d'arrivée
	 * @param ville1 : ville de départ
	 * @param ville2 : ville d'arrivée
	 * @return fin : ArrayList<Ville>
	 */
	public ArrayList<Ville> recupererChemin(String ville1, String ville2){
		ArrayList<Ville> fin = new ArrayList<Ville>();
		Ville v = this.carte.getVilleByName(ville2);
		fin.add(v);
		while(v.getPere() != null){
			v = this.carte.getVilleByName(v.getPere().getNom());
			fin.add(v);
		}
		return fin;
	}

	/**
	 * Méthode permettant d'afficher le chemin entre 2 villes
	 * @param ville1 : ville de départ
	 * @param ville2 : ville d'arrivée
	 * @param fin
	 */
	public String afficherChemin(String ville1, String ville2, ArrayList<Ville> fin){
		String str = new String();
		str = ("Trajet de "+ville1+" à "+ville2+" : "+fin.get(0).getDistance()+" km");
		for(int i = fin.size()-1; i>=0; i--){
			str += (fin.get(i).getNom()+ " ");
			if(i!=0){
				str += ("-> ");
			}
		}
		
		return str;
	}
}
