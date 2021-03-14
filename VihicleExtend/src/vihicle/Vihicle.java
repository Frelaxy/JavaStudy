package vihicle;

public class Vihicle {
	
	private int passengers; //количество пассажиров
	private int fuelcap;    //емкость топливного бака
	private int mpg;        //потребление топлива в милях на галлон
	
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
	
	int range(){        //дальность поездки ТС
		return fuelcap*mpg;
	}
	double fuelneeded(int miles) {  //Рассчитать объем топлива, необнходимого для поездки на заданное расстояние
		return (double)miles/mpg;
	}

}
