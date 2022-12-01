package net.lecnam.trajets;

import javax.swing.JCheckBox;

public class CheckBoite extends JCheckBox {
	private String nomVille;
	
	public CheckBoite(String ville) {
		super();
		this.nomVille = ville;
	}
	
	public String getVille() {
		return this.nomVille;
	}
}
