import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Dimension;


public class WindowFrame extends JFrame {
	public WindowFrame() {
		setVisible(true);
		setLayout(new BorderLayout(50, 50));
		setSize(800, 800);
		
		JPanel upper = new MondrianPanel(Color.LIGHT_GRAY);
		JPanel left = new MondrianPanel(Color.BLUE);
		JPanel center = new MondrianPanel(Color.CYAN);
		JPanel right = new MondrianPanel(Color.BLUE);
		JPanel bottom = new MondrianPanel(Color.DARK_GRAY);
		
		upper.setPreferredSize(new Dimension(0, 160));
		left.setPreferredSize(new Dimension(200, 0));
		center.setPreferredSize(new Dimension(400, 0));
		right.setPreferredSize(new Dimension(200, 0));
		bottom.setPreferredSize(new Dimension(0, 160));
		
		add(upper, BorderLayout.NORTH);
		add(left, BorderLayout.WEST);
		add(center, BorderLayout.CENTER);
		add(right, BorderLayout.EAST);
		add(bottom, BorderLayout.SOUTH);
		
	}
}
