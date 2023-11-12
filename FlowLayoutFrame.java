import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.FlowLayout;
public class FlowLayoutFrame extends JFrame {
	
// Kind of like flex box
// Row based. If the space in a line cannot contain the items with their preferred width, a new row is used
	public FlowLayoutFrame() {
		setSize(800, 800);
		setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		                    
//		PoopButton p1 = new PoopButton2(false, Color.WHITE);
//		PoopButton p2 = new PoopButton2(false, Color.WHITE);
//		PoopButton p3 = new PoopButton2(false, Color.WHITE);
//		PoopButton p4 = new PoopButton2(false, Color.WHITE);
//		PoopButton p5 = new PoopButton2(false, Color.WHITE);
//		PoopButton p6 = new PoopButton2(false, Color.WHITE);
//		PoopButton p7 = new PoopButton2(false, Color.WHITE);
//		PoopButton p8 = new PoopButton2(false, Color.WHITE);
//		PoopButton p9 = new PoopButton2(false, Color.WHITE);
//		PoopButton p10 = new PoopButton2(false, Color.WHITE);
//		add(p1);
//		add(p2);
//		add(p3);
//		add(p4);
//		add(p5);
//		add(p6);
//		add(p7);
//		add(p8);
//		add(p9);
//		add(p10);
		
		PoopButton2.addButtonstoFrame(80, this);
		
		setVisible(true);
		
	}
}
class PoopButton2 extends PoopButton{
	public PoopButton2(boolean constipated, Color background) {
		super(constipated, background);
		this.setPreferredSize(new Dimension(100, 100));
	}
	
	public static void addButtonstoFrame(int quantity, JFrame frame) {
		for (int i = 0; i<quantity ; i++ ) {
			frame.add(new PoopButton2(false, Color.WHITE));
		}
	}
}
