
public class Shapes6 {

	public static void main(String[] args) {
		ColorTriangle t1 = new ColorTriangle("�����", "���������", 8.0, 12.0);
		ColorTriangle t2 = new ColorTriangle("�������", "�����������", 2.0, 2.0);
		
		System.out.println("���������� � t1");
		t1.showColor();
		t1.showDim();
		t1.showStyle();
		System.out.println("������� - " + t1.area());
		
		System.out.println();
		
		System.out.println("���������� � t2");
		t2.showColor();
		t2.showDim();
		t2.showStyle();
		System.out.println("������� - " + t2.area());

	}

}
