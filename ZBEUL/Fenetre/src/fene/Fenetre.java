package fene;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Fenetre extends JFrame{
	private JPanel container = new JPanel();
	private JTextField jtf = new JTextField("Grand-remplace moi !");
	private JLabel label = new JLabel("Un JTextField");
	private JLabel recup = new JLabel();
	private JButton rcb = new JButton("Récupérer");
	

	public Fenetre(){
		this.setTitle("Animation");
	    this.setSize(400, 400);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    container.setBackground(Color.white);
	    container.setLayout(new BorderLayout());
	    JPanel top = new JPanel();
	    JPanel bot = new JPanel();
	    Font police = new Font("Montserrat", Font.BOLD, 14);
	    jtf.setFont(police);
	    jtf.setPreferredSize(new Dimension(200, 30));
	    jtf.setForeground(Color.BLUE);
	    rcb.addActionListener(new BoutonListener());
	    top.add(label);
	    top.add(jtf);
	    bot.add(rcb);
	    bot.add(recup);
	    container.add(top, BorderLayout.NORTH);
	    container.add(bot, BorderLayout.SOUTH);
	    this.setContentPane(container);
	    this.setVisible(true);            
	}
	
	public class BoutonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			recup.setText(jtf.getText());
		}
	}
}
