package vihicle;

public class VehConsDemo {

	public static void main(String[] args) {
		Vihicle minivan = new Vihicle(7,16,21);
		Vihicle spottcar = new Vihicle(2,14,12);
		Truck pickup = new Truck(3, 28, 15, 2000);
		Truck semi = new Truck(2, 200, 7, 44000);
		
		
		int dist=252;
		
		
		System.out.println("Для преодаления ПИКАПОМ " + dist + " миль потребуется: " + pickup.fuelneeded(dist) + " галлонов топлива");
		System.out.println("Грузовик может перевести " + pickup.getCargocap() +" фунтов\n");
		

		System.out.println("Для преодаления ГРУЗОВИКОМ " + dist + " миль потребуется: " + semi.fuelneeded(dist) + " галлонов топлива");
		System.out.println("Грузовик может перевести " + semi.getCargocap() +" фунтов\n");

		
		System.out.println("Для преодаления МИНИВЕНОМ " + dist + " миль потребуется: " + minivan.fuelneeded(dist) + " галлонов топлива\n");
		
		
		System.out.println("Для преодаления СПОРТКАРОМ " + dist + " миль потребуется: " + spottcar.fuelneeded(dist) + " галлонов топлива");

	}

}
