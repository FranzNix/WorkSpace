package tutorialpackage;

import git.Hero;

public class TestHero {

	public static void main(String[] args) {
		Hero h1 = new Hero();
		Hero h2 = new Hero("Superman", "Super Strength", 35);
		Hero h3 = new Hero("Magneto", "Magnetic", 40);
		Hero h4 = new Hero("Miguel", "Intelligence", 17 );
		
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
		

	}

}
