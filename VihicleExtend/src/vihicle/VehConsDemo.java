package vihicle;

public class VehConsDemo {

	public static void main(String[] args) {
		Vihicle minivan = new Vihicle(7,16,21);
		Vihicle spottcar = new Vihicle(2,14,12);
		Truck pickup = new Truck(3, 28, 15, 2000);
		Truck semi = new Truck(2, 200, 7, 44000);
		
		
		int dist=252;
		
		
		System.out.println("��� ����������� ������� " + dist + " ���� �����������: " + pickup.fuelneeded(dist) + " �������� �������");
		System.out.println("�������� ����� ��������� " + pickup.getCargocap() +" ������\n");
		

		System.out.println("��� ����������� ���������� " + dist + " ���� �����������: " + semi.fuelneeded(dist) + " �������� �������");
		System.out.println("�������� ����� ��������� " + semi.getCargocap() +" ������\n");

		
		System.out.println("��� ����������� ��������� " + dist + " ���� �����������: " + minivan.fuelneeded(dist) + " �������� �������\n");
		
		
		System.out.println("��� ����������� ���������� " + dist + " ���� �����������: " + spottcar.fuelneeded(dist) + " �������� �������");

	}

}
