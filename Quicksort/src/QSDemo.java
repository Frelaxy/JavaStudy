
public class QSDemo {

	public static void main(String[] args) {
		char a[] = { 'd', 'x', 'a', 'r', 'p', 'j', 'i' } ;
		int i;

		System.out.println("�������� ������: ");
		for(i=0; i < a.length; i++)
			System.out.println(a[i]);

		System.out.println();

		//������������� ������
		Quicksort.qsort(a);

		System.out.println("��������������� ������: ");
		for (char n: a) {
			System.out.println(n);

		}
	}

}