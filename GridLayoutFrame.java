import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.GridLayout;
public class GridLayoutFrame extends JFrame {
	public GridLayoutFrame() {
		super();
		setSize(800,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 0 means auto
		// Rows X Columns
		setLayout(new GridLayout(5, 0));
		PoopButton2.addButtonstoFrame(10, this, new PoopButton2(new PoopButton2(false, Color.BLACK)));
		
		setVisible(true);
	}
}
