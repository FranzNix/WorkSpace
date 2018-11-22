package tutorialpackage;

import git.Hero;

public class TestHero {

	public static void main(String[] args) {
		Hero h1 = new Hero();
		Hero h2 = new Hero("Superman", "Super Strength", 35, 80, 50);
		Hero h3 = new Hero("Magneto", "Magnetic", 40, 100, 60);
		Hero h4 = new Hero("Miguel", "Intelligence", 17, 1000, 100);
		
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3.toString());
		System.out.println(h4.toString());
		
		System.out.println();
		
		Meteorite m = new Meteorite();
		m.mutate(h1);
		m.mutate(h2);
		m.mutate(h3);
		m.mutate(h4);
		
		
		while(h4.getHealth() > 0) {
			h1.attack(h4);
			System.out.println();
			System.out.println("Hero 4 Health: " + h4.getHealth());
		}

		
		

	}

}
