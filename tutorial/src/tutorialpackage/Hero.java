package tutorialpackage;

public class Hero {
	private String name;
	private String power;
	private int age;
	private int powerLevel;
	
	public Hero() {
		name = "Jane Doe";
		power = "Super Speed";
		age = 20;
		powerLevel = 10;
	}
	
	public Hero(String name, String power, int age) {
		this.name = name;
		this.power = power;
		this.age = age;
	}
	
	public void setPower(String power) {
		this.power = power;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + " Power: " + power;
	}

}



