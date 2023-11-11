import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.lang.Math;


public class MondrianFrame extends JFrame {
	int width, height;
	/*
	 * Colours
	 * #fac901 (250,201,1) 
	 * #ffffff (255,255,255) 
	 * #225095 (34,80,149) 
	 * #ffffff (255,255,255)
	 * #dd0100 (221,1,0)
	 */

	public MondrianFrame() {
		setTitle("Piet Mondrian, Composition with Red, Blue, and Yellow, 1930");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 800);
		setVisible(true);
	
		
		width = getContentPane().getWidth();
		height = getContentPane().getHeight();
		Color red = new Color(221,1,0);
		Color blue = new Color(34,80,149);
		Color yellow = new Color(250,201,1);
		Color white = new Color(255, 255, 255);
		Color black = new Color(0, 0 ,0);
		int borderThickness = (int) Math.round(((double)40/1230) * width);
		
		
		
		
// Create the top right red tile
		MondrianPanel redPanel = new MondrianPanel(red, (double)(970)/1230, (double)(925)/1230);
		redPanel.setWidth(width * redPanel.getXratio());
		redPanel.setHeight(height * redPanel.getYratio());
		redPanel.setBorder(BorderFactory.createMatteBorder(0, borderThickness, borderThickness ,0, black));
		redPanel.setBounds((int) Math.round(width - redPanel.getWidthExact()), 0, redPanel.getWidthRounded(), redPanel.getHeightRounded());
		add(redPanel);

// Create the bottom left blue tile
		MondrianPanel bluePanel = new MondrianPanel(blue, (double)(300)/1230, (double)(345)/1230);
		bluePanel.setWidth(width * bluePanel.getXratio());
		bluePanel.setHeight(height * bluePanel.getYratio());
		bluePanel.setBorder(BorderFactory.createMatteBorder(borderThickness ,0 , 0, borderThickness, black));
		bluePanel.setBounds(0, (int) Math.round(height - bluePanel.getHeightExact()), bluePanel.getWidthRounded(), bluePanel.getHeightRounded());
		add(bluePanel);
		
// Create the bottom right yellow ti
		MondrianPanel yellowPanel = new MondrianPanel(yellow, (double)(130)/1230, (double)(170)/1230);
		yellowPanel.setWidth(width * yellowPanel.getXratio());
		yellowPanel.setHeight(height * yellowPanel.getYratio());
		yellowPanel.setBorder(BorderFactory.createMatteBorder(borderThickness , borderThickness , 0, 0, black));
		yellowPanel.setBounds((int) Math.round(width - yellowPanel.getWidthExact()), (int) Math.round(height - yellowPanel.getHeightExact()), yellowPanel.getWidthRounded(), yellowPanel.getHeightRounded());
		add(yellowPanel);
		
// Create the bottom right white tile
		MondrianPanel whiteBRPanel = new MondrianPanel(white, (double)(130)/1230, (double)(200)/1230);
		whiteBRPanel.setWidth(width * whiteBRPanel.getXratio());
		whiteBRPanel.setHeight(height * whiteBRPanel.getYratio());
		whiteBRPanel.setBorder(BorderFactory.createMatteBorder(borderThickness , borderThickness , borderThickness, 0, black));
		//	Plus 10 to adjust for the 1.2 X thickness of the border between the yellow and the white tile
		whiteBRPanel.setBounds((int) Math.round(width - whiteBRPanel.getWidthExact()), (int) Math.round(height + 10 + borderThickness - 2 * whiteBRPanel.getHeightExact()), whiteBRPanel.getWidthRounded(), whiteBRPanel.getHeightRounded());
		add(whiteBRPanel);

		
// Create top left white tile
		MondrianPanel whiteTLPanel = new MondrianPanel(white, (double)(300)/1230, (double)(410)/1230);
		whiteTLPanel.setWidth(width * whiteTLPanel.getXratio());
		whiteTLPanel.setHeight(height * whiteTLPanel.getYratio());
		whiteTLPanel.setBorder(BorderFactory.createMatteBorder(0 ,0 , borderThickness, borderThickness, black));
		whiteTLPanel.setBounds(0, 0, whiteTLPanel.getWidthRounded(), whiteTLPanel.getHeightRounded());
		add(whiteTLPanel);

// Create middle left white tile
		MondrianPanel whiteMLPanel = new MondrianPanel(white, (double)(300)/1230, (double)(445)/1230);
		whiteMLPanel.setWidth(width * whiteTLPanel.getXratio());
		whiteMLPanel.setHeight(height * whiteTLPanel.getYratio());
		whiteMLPanel.setBorder(BorderFactory.createMatteBorder(borderThickness , 0, 0, borderThickness, black));
		whiteMLPanel.setBounds(0, whiteTLPanel.getHeightRounded(), whiteMLPanel.getWidthRounded(), whiteMLPanel.getHeightRounded());
		add(whiteMLPanel);
	}
	
	
		
}
