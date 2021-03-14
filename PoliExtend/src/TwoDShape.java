
public class TwoDShape {
	
	private double width;
	private double height;
	
	public TwoDShape() {
		
		width=height=0.0;
		
	}

	public TwoDShape(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public TwoDShape(double x) {
		
		this.width = this.height = x;
		
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	void showDim() {
		System.out.println("Ўирина и высота - " + width + " и " + height);
	}

}

