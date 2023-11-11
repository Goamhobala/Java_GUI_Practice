import javax.swing.JButton;
import java.awt.Color;

public class PoopButton extends JButton{
	private boolean constipated;
	public PoopButton(boolean constipated, Color background) {
		super();
		this.setBackground(background);
		this.constipated = constipated;
		this.setOpaque(true);
	}
	
	public boolean getConstipation() {
		return constipated;
	}
	
	public void setConstipation(boolean constipated) {
		this.constipated = constipated;
	}
}
