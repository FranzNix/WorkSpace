package tutorialpackage;

public class Hero {
	private String name;
	private String power;
	private int age;
	private int health;
	private int damagePerHit;
	
	public Hero() {
		name = "Jane Doe";
		power = "Super Speed";
		age = 20;
		health = 100;
		damagePerHit = 10;
	}
	
	public Hero(String name, String power, int age, int health, int damagePerHit) {
		this.name = name;
		this.power = power;
		this.age = age;
		this.health = health;
		this.damagePerHit = damagePerHit;
	}
	
	public void setPower(String power) {
		this.power = power;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getDamagePerHit() {
		return damagePerHit;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void attack(Hero h) {
		h.setHealth(h.getHealth() - damagePerHit);
	}
	
	@Override
	public String toString() {
		return "Name: " + name + " Power: " + power + " Age: " + age + " Power Level: " + health + " Damage Per Hit: " + damagePerHit;
	}

}



