package boites3;

import javax.swing.JOptionPane;

public class Test1 {
  public static void main(String[] args) {
    JOptionPane jop = new JOptionPane(), jop2 = new JOptionPane();
    String nom = jop.showInputDialog(null, "Veuillez d�cliner votre identit� !", "Gendarmerie nationale !", JOptionPane.QUESTION_MESSAGE);
    jop2.showMessageDialog(null, "Votre nom est " + nom, "Identit�", JOptionPane.INFORMATION_MESSAGE);
  }
}
