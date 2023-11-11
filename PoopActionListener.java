import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PoopActionListener implements ActionListener{

@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().getClass().equals(PoopButton.class)){
			if (((PoopButton) e.getSource()).getConstipation()) {
				
				System.out.println("Constipation 🥲");
			}
			else {
				System.out.println("Poop💩");
			}
		}
		else {
			System.out.println("Here ain't no bathroom 😡");
		}
	}
}
