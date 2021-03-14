
public class Shapes6 {

	public static void main(String[] args) {
		ColorTriangle t1 = new ColorTriangle("Синий", "контруный", 8.0, 12.0);
		ColorTriangle t2 = new ColorTriangle("Красный", "закрашенный", 2.0, 2.0);
		
		System.out.println("Информация о t1");
		t1.showColor();
		t1.showDim();
		t1.showStyle();
		System.out.println("Площадь - " + t1.area());
		
		System.out.println();
		
		System.out.println("Информация о t2");
		t2.showColor();
		t2.showDim();
		t2.showStyle();
		System.out.println("Площадь - " + t2.area());

	}

}
