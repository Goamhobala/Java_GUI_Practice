import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.BorderFactory;


public class LabelFrame extends JFrame{
    public LabelFrame(){
    	Color neonPurple = new Color(157, 0, 255);
    	Border border = BorderFactory.createLineBorder(neonPurple, 5);
    	
        ImageIcon mainPic = new ImageIcon("MarcusAurelius_bgRemoved.png");
        JLabel heading = new JLabel();
        heading.setText("Marcus Aurelius is the GOAT");
        heading.setIcon(mainPic);
        heading.setHorizontalTextPosition(JLabel.CENTER);
        heading.setVerticalTextPosition(JLabel.BOTTOM);
        heading.setForeground(neonPurple);
        heading.setFont(new Font("Orbitron", Font.BOLD, 22));
        heading.setIconTextGap(20);
        heading.setBackground(new Color(0, 0, 0));
        heading.setOpaque(true);
        heading.setBorder(border);
        heading.setHorizontalAlignment(JLabel.CENTER);
        heading.setVerticalAlignment(JLabel.CENTER);
        add(heading);
//        heading.setBounds(360, 0, 720, 960);
        
        
        
//        setLayout(null);
        setVisible(true);
//        setSize(1280, 800);
        
        setTitle("Marcus Aurelius the Goat🐐");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(255,255,255));
        
        pack();
    }
}