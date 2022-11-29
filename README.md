# TrajetsEntreVilles
Calcul du trajet le plus court entre les villes.


## Orga
**Thibaud** : Interface graphique

**Christophe & Bastien** : développement de l’algorithme

## Liste des classes
- **Trajet** :
	- Ville1 : Ville
	- Ville2 : Ville
	- Longueur : int
- **Ville** :
	- Nom : String
	- visitee : boolean
- **TrajetHandler** :
	- carte : Carte (getter)
	- Méthodes de calcul du trajet le plus court : Trajet
	- Obtenir la plus petite distance (array<entier>)
- **Fenetre** :
	- th : TrajetHandler
- **Carte** :
	- Liste de Trajets (à obtenir dans un fichier)
	- Méthode Construire carte
	
![diagramme de classes](/ZBEUL/uml.png)
	
## Structure programme
	Dijkstra
![Dijkstra](/ZBEUL/Dijkstra_Animation.gif)