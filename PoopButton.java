import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;

public class PoopButton extends JButton{
	private boolean constipated;
	private Color background;
	public PoopButton(boolean constipated, Color background) {
		super();
		this.background = background;
		this.setBackground(this.background);
		this.constipated = constipated;
		this.setOpaque(true);
	}
	
	public PoopButton(PoopButton source) {
		this(source.constipated, source.background);
	}
	
	public boolean getConstipation() {
		return constipated;
	}
	
	public void setConstipation(boolean constipated) {
		this.constipated = constipated;
	}
	
	public static void addButtonstoFrame(int quantity, JFrame frame) {
		for (int i = 0; i<quantity ; i++ ) {
			frame.add(new PoopButton(false, Color.WHITE));
		}
	}
	
	public static void addButtonstoFrame(int quantity, JFrame frame,PoopButton source) {
		for (int i = 0; i<quantity ; i++ ) {
			frame.add(new PoopButton(source));
		}
	}
}
