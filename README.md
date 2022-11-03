# TrajetsEntreVilles
Calcul du trajet le plus court entre les villes.


## Orga


## Liste des classes
- Trajet :
	- Ville1 : Ville
	- Ville2 : Ville
	- Longueur : int
- Ville :
	- Nom : String
	- Visitée ? : boolean
- TrajetHandler :
	- Méthodes de calcul du trajet le plus court
	- Obtenir la plus petite distance (array<entier>)
	
## Structure programme
####Récursivité:
- Fonction faireTrajet(Trajet : tableau, numéro trajet : entier)
	- Si Trajet[numéro trajet].Ville1 = faux et Trajet[numéro trajet].Ville2 = faux
		- On fait le trajet
	- Sinon
		- Si numéro trajet inférieur à nombre de trajets
			- faireTrajet(Trajet, numéro trajet + 1)
