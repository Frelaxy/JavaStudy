package Ex13;

public class Ex13 {

	public static void main(String[] args) {
		Sum a = new Sum();
		
		double total=a.sum(2,2,1,4,5,5);
		System.out.println(total);

	}
}
	class Sum{

	double sum(int ...v){
		double sums=0;
		for (int i=0; i < v.length; i++) {
		sums+=v[i];
		}
		
		return sums/v.length;
		
	}

}
