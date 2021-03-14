
public class Triangle extends TwoDShape {
	
	private String style;
	
	Triangle(){
		super();
		style = "none";
	}
	
	Triangle(String s, double w, double h){
		super(w,h);
		style = s;
	}
	
	Triangle(double x){
		super(x);
		style = "Закрашенный";
	}
	double area(){
		return getWidth() * getHeight() / 2;
	}
	void showStyle() {
		System.out.println("Треугольник " + style);
	}
}
