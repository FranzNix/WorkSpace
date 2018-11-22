package tutorialpackage;

public class Meteorite {
	
	String[] powers = {"Extreme Smaking", "Explosion", "Doing Taxes", "Baking"};
	
	public Meteorite() {}
	
	public void mutate(Hero h) {
		int r = (int)(Math.random() * powers.length);
		String newPower = powers[r];
		h.setPower(newPower);
		System.out.println(h.toString());
	}
}