package Ex4;

public class Ex4 {

	public static void main(String[] args) {
		Test ob1 = new Test(2);
		Test ob2 = new Test(3);
		
		System.out.println(ob1.a + " " + ob2.a);
		ob1.Swap(ob1, ob2);
		System.out.println(ob1.a + " " + ob2.a);

	}

}
