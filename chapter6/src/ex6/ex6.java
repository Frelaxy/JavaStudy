package ex6;

public class ex6 {

	public static void main(String[] args) {
		
		
		
		String a[] = {"AA","AB","AC","AD","AF" };
		ex6 b = new ex6();
		b.Swap(a);
		
		for (String i : a) {
			System.out.println(i);
		}

	}
	
	String[] Swap(String a[]){
		String temp;
		for (int i = 0; i < a.length/2; i++ ) {
			temp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = temp;
		}
		
		return a;
	}
	


}
