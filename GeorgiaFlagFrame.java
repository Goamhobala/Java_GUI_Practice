import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.lang.Math;

public class GeorgiaFlagFrame extends JFrame {
	
	public GeorgiaFlagFrame() {
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1200,800);
		setLayout(new BorderLayout());
		
		Color red = new Color(252,3,15);
		Color whtie = new Color(0, 0, 0);
		
		// The rows
		JPanel upper = new JPanel();
		JPanel lower = new JPanel();
		
		upper.setPreferredSize(new Dimension(0, (int)Math.round(0.5 * getContentPane().getHeight())));
		lower.setPreferredSize(new Dimension(0, (int)Math.round(0.5 * getContentPane().getHeight())));
		
		// Upper
		
		
	}

}
