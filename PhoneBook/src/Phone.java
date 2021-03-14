class Phone {
	private int number;
	private int model;
	private double weight;
	private String name;
	
	Phone (){
		setModel(0);
		number=0;
		setWeight(0);
	}

	Phone(int x, int y, double z){
		setModel(x);
		number= y;
		setWeight(z);
	}

	Phone (int x, int y){
		setModel(x);
		number = y;
	}

	void receiveCall(){
		if (number==345) name = "Sasha";
		if (number==456) name = "Dima";
		if (number==566) name = "Julia";
		System.out.println("Звонит: " + name);
	}

	int getNumber() {
		if (name=="Sasha") number=345;
		if (name=="Dima") number=456;
		if (name=="Julia") number=566;
		return number;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}

