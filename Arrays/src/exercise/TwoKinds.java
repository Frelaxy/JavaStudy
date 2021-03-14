package exercise;

public class TwoKinds {

	public static void main(String[] args) {
		double Ms[]= new double[5];
		double[] Ms1, Ms2= new double[12];
		double arf=0;
		
		for (int i=0; i<Ms.length; i++) {
			Ms[i]=Math.random()*Ms.length;
			arf+=Ms[i];
			
		}
		arf=arf/Ms.length;
		for (int i=0; i<Ms.length; i++) {
			System.out.println(Ms[i]);
		}
		System.out.println("Среднее арифметическое:" + arf);
	}

}
