

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
	String[] tab_string = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", "=", "C", "+", "-", "*", "/"};
	  //Un bouton par élément à afficher
	JButton[] bouton = new JButton[tab_string.length];
	private JPanel container = new JPanel();
	private JPanel chiffres = new JPanel();
	private JPanel chiffresLigneMilieu = new JPanel();
	private JPanel chiffresLigne1 = new JPanel();
	private JPanel chiffresLigne2 = new JPanel();
	private JPanel chiffresLigne3 = new JPanel();
	private JPanel chiffresLigne4 = new JPanel();
	private JPanel oper = new JPanel();
	private JLabel label = new JLabel(" ");
	
	private int i;
	private double result;
	private double err, er;
	private boolean plus = false;
	private boolean moins = false;
	private boolean fois = false;
	private boolean div = false;
	
	public Fenetre() {
		this.setTitle("Calculatrice");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setUndecorated(false);
		for(i=0; i < 17; i++) {
			bouton[i].addActionListener(new BoutonListener());
		}
		for(i=11; i< 17; i++) {
			bouton[i].addActionListener(new OperListener());
		}
		label.setHorizontalAlignment(JLabel.CENTER);
		chiffres.setBackground(Color.white);
		chiffresLigne1.setBackground(Color.white);
		chiffresLigne2.setBackground(Color.white);
		chiffresLigne3.setBackground(Color.white);
		chiffresLigne4.setBackground(Color.white);
		chiffresLigneMilieu.setBackground(Color.white);
	    chiffresLigne4.setLayout(new BorderLayout());
	    chiffresLigne3.setLayout(new BorderLayout());
	    chiffresLigne2.setLayout(new BorderLayout());
	    chiffresLigne1.setLayout(new BorderLayout());
	    chiffresLigneMilieu.setLayout(new BorderLayout());
	    for(i=0; i<=17; i++) {
	    	chiffres.add(bouton[i]);
	    }
		container.setBackground(Color.white);
	    container.setLayout(new BorderLayout());
	    container.add(label, BorderLayout.NORTH);
		container.add(chiffres, BorderLayout.CENTER);
		label.setSize(500, 50);
		this.setContentPane(container);
		this.setVisible(true);
	}
	
	class BoutonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(!plus && !moins && !fois && !div) {
				if(e.getSource() == bouton[9]) {
					label.setText(label.getText()+ "0");
					err = 0;
				}
				if(e.getSource() == bouton[0]) {
					label.setText(label.getText()+ "1");
					err = 1;
				}
				if(e.getSource() == bouton[1]) {
					label.setText(label.getText()+ "2");
					err = 2;
				}
				if(e.getSource() == bouton[2]) {
					label.setText(label.getText()+ "3");
					err = 3;
				}
				if(e.getSource() == bouton[3]) {
					label.setText(label.getText()+ "4");
					err = 4;
				}
				if(e.getSource() == bouton[4]) {
					label.setText(label.getText()+ "5");
					err = 5;
				}
				if(e.getSource() == bouton[5]) {
					label.setText(label.getText()+ "6");
					err = 6;
				}
				if(e.getSource() == bouton[6]) {
					label.setText(label.getText()+ "7");
					err = 7;
				}				
				if(e.getSource() == bouton[7]) {
					label.setText(label.getText()+ "8");
					err = 8;
				}				
				if(e.getSource() == bouton[8]) {
					label.setText(label.getText()+ "9");
					err = 9;
				}
			}
			if(plus || moins || fois || div) {
				if(e.getSource() == bouton[9]) {
					label.setText(label.getText()+ "0");
					er = 0;
				}
				if(e.getSource() == bouton[0]) {
					label.setText(label.getText()+ "1");
					er = 1;
				}
				if(e.getSource() == bouton[1]) {
					label.setText(label.getText()+ "2");
					er = 2;
				}
				if(e.getSource() == bouton[2]) {
					label.setText(label.getText()+ "3");
					er = 3;
				}
				if(e.getSource() == bouton[3]) {
					label.setText(label.getText()+ "4");
					er = 4;
				}
				if(e.getSource() == bouton[4]) {
					label.setText(label.getText()+ "5");
					er = 5;
				}
				if(e.getSource() == bouton[5]) {
					label.setText(label.getText()+ "6");
					er = 6;
				}
				if(e.getSource() == bouton[6]) {
					label.setText(label.getText()+ "7");
					er = 7;
				}				
				if(e.getSource() == bouton[7]) {
					label.setText(label.getText()+ "8");
					er = 8;
				}				
				if(e.getSource() == bouton[8]) {
					label.setText(label.getText()+ "9");
					er = 9;
				}
			}
			if(e.getSource() == bouton[10]) {
				label.setText("");
			}
			if(e.getSource() == bouton[11]) {
				label.setText("");
			}
			if(e.getSource() == bouton[12]) {
				label.setText("");
			}
			if(e.getSource() == bouton[13]) {
				label.setText("");
			}
			if(e.getSource() == bouton[14]) {
				label.setText(label.getText()+ ".");
			}
			if(e.getSource() == bouton[15]) {
				label.setText("");
				err = 0;
				er = 0;
				plus = false;
				moins = false;
				fois = false;
				div = false;
			}
			if(e.getSource() == bouton[16]) {
				if(plus)
					result = err + er;
				else if(moins)
					result = err - er;
				else if(fois)
					result = err * er;
				else if(div)
					result = err / er;
				plus = false;
				moins = false;
				fois = false;
				div = false;
				label.setText(""+result);
				err = result;
			}				
		}
	}
	
	class OperListener implements ActionListener{
		public void actionPerformed(ActionEvent f) {
			if(f.getSource() == bouton[13]) {
				plus = true;
				moins = false;
				fois = false;
				div = false;
			}
			if(f.getSource() == bouton[14]) {
				plus = false;
				moins = true;
				fois = false;
				div = false;
			}
			if(f.getSource() == bouton[15]) {
				plus = false;
				moins = false;
				fois = true;
				div = false;
			}
			if(f.getSource() == bouton[16]) {
				plus = false;
				moins = false;
				fois = false;
				div = true;
			}
		}
	}
}
