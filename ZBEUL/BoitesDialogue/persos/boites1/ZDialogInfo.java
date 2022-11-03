package boites1;

public class ZDialogInfo {
	private String nom, sexe, age, cheveux, taille;
	
	public ZDialogInfo() {}
	public ZDialogInfo(String nom, String sexe, String age, String cheveux, String taille) {
		this.nom = nom;
		this.sexe = sexe;
		this.age = age;
		this.cheveux = cheveux;
		this.taille = taille;
	}
	
	public String toString() {
		String str;
		if(this.nom != null && this.sexe != null && this.age != null && this.cheveux != null && this.taille != null) {
			str = "Description de l'objet ZDialogInfo";
			str += "Nom : "+this.nom+"\n";
			str += "Sexe : "+this.sexe+"\n";
			str += "Age : "+this.age+"\n";
			str += "Cheveux : "+this.cheveux+"\n";
			str += "Taille : "+this.taille+"\n";
		}
		else {
			str = "Aucune information !";
		}
		return str;
	}
	
}
