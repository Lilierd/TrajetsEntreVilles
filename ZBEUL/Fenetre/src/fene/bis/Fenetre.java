package fene.bis;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
  private JPanel container = new JPanel();
  private JFormattedTextField jtf = new JFormattedTextField(NumberFormat.getIntegerInstance());
  private JFormattedTextField jtf2 = new JFormattedTextField(NumberFormat.getPercentInstance());
  private JLabel label = new JLabel("Un JTextField");
  private JButton b = new JButton ("OK");

  public Fenetre(){
    this.setTitle("Animation");
    this.setSize(300, 300);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    container.setBackground(Color.white);
    container.setLayout(new BorderLayout());
    JPanel top = new JPanel();        
    Font police = new Font("Arial", Font.BOLD, 14);
    jtf.setFont(police);
    jtf.setPreferredSize(new Dimension(150, 30));
    jtf.setForeground(Color.BLUE);
    jtf2.setPreferredSize(new Dimension(150, 30));
    b.addActionListener(new BoutonListener());
    jtf.addKeyListener(new ClavierListener());
    top.add(label);
    top.add(jtf);
    top.add(jtf2);
    top.add(b);
    this.setContentPane(top);
    this.setVisible(true);            
  }       

  class BoutonListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
      System.out.println("TEXT : jtf " + jtf.getText());
      System.out.println("TEXT : jtf2 " + jtf2.getText());
      jtf2.setText(jtf.getText()+"%");
    }
  }
  
  class ClavierListener implements KeyListener{
	  public void keyPressed(KeyEvent event) {
	      System.out.println("Code touche pressée : " + event.getKeyCode() + " - caractère touche pressée : " + event.getKeyChar());
	      pause();
	    }

	    public void keyReleased(KeyEvent event) {
	      System.out.println("Code touche relâchée : " + event.getKeyCode() + " - caractère touche relâchée : " + event.getKeyChar());         
	      pause();                  
	    }

	    public void keyTyped(KeyEvent event) {
	      System.out.println("Code touche tapée : " + event.getKeyCode() + " - caractère touche tapée : " + event.getKeyChar());
	      pause();
	    }  
  }
  
  private void pause() {
	  try {
		  Thread.sleep(125);
	  } catch(InterruptedException e) {
		  e.printStackTrace();
	  }
  }
}
