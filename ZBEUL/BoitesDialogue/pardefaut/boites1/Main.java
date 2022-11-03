package boites1;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		JOptionPane jop1, jop2, jop3;
		 
		//Boîte du message d'information
		jop1 = new JOptionPane();
		jop1.showMessageDialog(null, "Message informatif", "Information", JOptionPane.INFORMATION_MESSAGE);
				
		//Boîte du message préventif
		jop2 = new JOptionPane();
		jop2.showMessageDialog(null, "Message préventif", "Attention", JOptionPane.WARNING_MESSAGE);
				
		//Boîte du message d'erreur
		jop3 = new JOptionPane();
		jop3.showMessageDialog(null, "Message d'erreur", "Erreur", JOptionPane.ERROR_MESSAGE);
	}
}
