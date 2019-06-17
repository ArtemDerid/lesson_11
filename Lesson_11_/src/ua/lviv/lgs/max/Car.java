package ua.lviv.lgs.max;

public class Car {
	
	private int horsepower;
	private int yearOfProduction;
	private Helm helm;
	private Engine engine;
	
	public Car(int horsepower, int yearOfProduction, Helm helm, Engine engine) {
		super();
		this.horsepower = horsepower;
		this.yearOfProduction = yearOfProduction;
		this.helm = helm;
		this.engine = engine;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public Helm getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [horsepower=" + horsepower + ", yearOfProduction=" + yearOfProduction + ", helm=" + helm
				+ ", engine=" + engine + "]";
	}

}
