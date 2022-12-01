package net.lecnam.trajets;

import java.awt.geom.Line2D;

public class Ligne extends Line2D.Float {
	private String nomVille1;
	private String nomVille2;
	
	public Ligne(float x1, float y1, float x2, float y2, String ville1, String ville2) {
		super(x1, y1, x2, y2);
		this.nomVille1 = ville1;
		this.nomVille2 = ville2;
	}

	public String getNomVille1() {
		return nomVille1;
	}

	public String getNomVille2() {
		return nomVille2;
	}
}
