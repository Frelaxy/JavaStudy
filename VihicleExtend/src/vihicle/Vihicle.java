package vihicle;

public class Vihicle {
	
	private int passengers; //���������� ����������
	private int fuelcap;    //������� ���������� ����
	private int mpg;        //����������� ������� � ����� �� ������
	
	Vihicle(int a,int b,int c){
		passengers=a;
		fuelcap=b;
		mpg=c;
	}
	
	public int getPassengers() {
		return passengers;
	}
	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
	public int getFuelcap() {
		return fuelcap;
	}
	public void setFuelcap(int fuelcap) {
		this.fuelcap = fuelcap;
	}
	public int getMpg() {
		return mpg;
	}
	public void setMpg(int mpg) {
		this.mpg = mpg;
	}
	
	int range(){        //��������� ������� ��
		return fuelcap*mpg;
	}
	double fuelneeded(int miles) {  //���������� ����� �������, ������������� ��� ������� �� �������� ����������
		return (double)miles/mpg;
	}

}
