import javax.swing.JPanel;
import java.awt.Color;
import java.lang.Math;

public class MondrianPanel extends JPanel {
	private Color color;
	private double x_ratio, y_ratio, width, height;
	
	public MondrianPanel(Color color, double x_ratio, double y_ratio) {
		this.color = color;
		this.x_ratio = x_ratio;
		this.y_ratio = y_ratio;
		this.setBackground(color);
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public double getXratio() {
		return this.x_ratio;
	}
	
	public double getYratio() {
		return this.y_ratio;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public int getWidthRounded() {
		return (int) Math.round(this.width);
	}
	
	public int getHeightRounded() {
		return (int) Math.round(this.height);
	}
	
	public double getWidthExact() {
		return this.width;
	}
	
	public double getHeightExact() {
		return this.height;
	}
}
