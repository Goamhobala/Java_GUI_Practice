import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Graphics;
public class BackgroundPanel extends JPanel{
	private ImageIcon background;
	public BackgroundPanel(ImageIcon background) {
		super();
		this.background = background;
	}
	@Override protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(this.background.getImage(), 0, 0, this);
	}
}
