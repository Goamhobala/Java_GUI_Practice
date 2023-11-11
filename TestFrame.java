import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class TestFrame extends JFrame{
    public TestFrame(){
        this.setVisible(true);
        this.setSize(800, 600);
        this.setTitle("Super dope app");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        ImageIcon icon = new ImageIcon("MarcusAurelius_bgRemoved.png");
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(122, 35, 89));
    }
}