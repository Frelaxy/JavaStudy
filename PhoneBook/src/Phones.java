import java.io.IOException;

public class Phones {

	public static void main(String[] args) throws IOException {
		Phone iPhone5 = new Phone(5,345,7.2);
		Phone iPhone7 = new Phone(7,456,7.4);
		Phone iPhone11 = new Phone(11,566,8.5);
		char choice;

		System.out.println("Веберите телефон, информацию по которому хотите получить: ");
		System.out.println("1. iPhone 5");
		System.out.println("2. iPhone 7");
		System.out.println("3. iPhone 11");

		choice=(char) System.in.read();

		switch (choice) {
		case '1': 
			System.out.println("модель: " + iPhone5.getModel() + "\nномер: "+iPhone5.getNumber() + "\nтолщина: " + iPhone5.getWeight() + "\n");
			iPhone5.receiveCall();
			break;
		case '2':
			System.out.println("модель: " + iPhone7.getModel() + "\nномер: "+iPhone7.getNumber() + "\nтолщина: " + iPhone7.getWeight() + "\n");
			iPhone7.receiveCall();   
			break;
		case '3': 
			System.out.println("модель: " + iPhone11.getModel() + "\nномер: "+iPhone11.getNumber() + "\nтолщина: " + iPhone11.getWeight() + "\n");
			iPhone11.receiveCall();   
			break;
		}	
	}
}
