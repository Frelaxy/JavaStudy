package vihicle;

public class Truck extends Vihicle{
	
	private int cargocap; // грузоподъемность в фунтах

	Truck(int a, int b, int c, int d) {
		super(a, b, c);
		cargocap = d;
	}

	public int getCargocap() {
		return cargocap;
	}

	public void setCargocap(int cargocap) {
		this.cargocap = cargocap;
	}
	
	

}
