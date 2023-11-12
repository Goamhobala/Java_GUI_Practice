import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;


import javax.swing.ImageIcon;

//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
public class ButtonFrame  extends JFrame{
	PoopButton poop, cantPoop;
	JButton boterasu;
	PoopButton[] bowelStates;
	public ButtonFrame() {
		

		setSize(800,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setTitle("Defecation Activities Simulator");
		BackgroundPanel background = new BackgroundPanel(new ImageIcon("SpongeBobBathroom800.png"));
		background.setLayout(null);
		background.setBounds(0, 0, 800, 800);
		background.setBackground(new Color(0, 0, 0, 0));

		
		ImageIcon song = new ImageIcon("song.png");
		ImageIcon constipatedPhilosopher = new ImageIcon("constipated.png");
		
		PoopActionListener p = new PoopActionListener();
		poop = new PoopButton(false, Color.WHITE);
		poop.setBounds(160, 250, 100, 100);
		poop.addActionListener(p);
		poop.setIcon(song);
		add(poop);
		
		cantPoop = new PoopButton(true, Color.WHITE);
		cantPoop.setBounds(540, 250, 100, 100);
		cantPoop.addActionListener(p);
		cantPoop.setIcon(constipatedPhilosopher);
		add(cantPoop);
		
		PoopButton[] bowelStates = new PoopButton[] {poop, cantPoop};
		
		JButton boterasu = new JButton();
		boterasu.setBounds(275, 500, 75, 75);
		boterasu.setBackground(Color.WHITE);
		boterasu.addActionListener((e) -> {for (PoopButton pb: bowelStates) { pb.setConstipation(false); pb.setIcon(song);}});
		boterasu.setFocusable(false);
		boterasu.setOpaque(true);
		boterasu.setText("🏥");
		add(boterasu);
		
		JButton meat = new JButton();
		meat.setBounds(425, 500, 75, 75);
		meat.setBackground(Color.WHITE);
		meat.addActionListener((e) -> {for (PoopButton pb: bowelStates) { pb.setConstipation(true); pb.setIcon(constipatedPhilosopher);}});
		meat.setText("🍖");
		meat.setOpaque(true);
		meat.setFocusable(false);
		add(meat);
		
		Font enlargedButtonFont = new Font(boterasu.getFont().getName(), boterasu.getFont().getStyle(), 36 );
		boterasu.setFont(enlargedButtonFont);
		meat.setFont(enlargedButtonFont);
		
		add(background);
		setVisible(true);
	}
	


}
