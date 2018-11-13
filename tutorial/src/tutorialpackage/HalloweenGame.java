package tutorialpackage;
import java.util.Scanner;
public class HalloweenGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] monsters = {"Miguel", "Vampire", "Werewolf", "Frankenstein", "Mummy", "Skeleton", "Player"};
		
		System.out.println("Enter player's name: ");
		monsters[monsters.length - 1] = "Player: " + input.nextLine();
		
		int [] coins = new int[monsters.length];
		
		for(int i = 0; i < monsters.length; i++) {//add coins
			coins[i] = (int)(Math.random()  * 8) + 2;
			System.out.println(monsters[i] + " has " + coins[i] +  " gold coins.");
		}//end for
		
		String[] abilities = new String[monsters.length]; 
		
		//Monsters abilities
		abilities[0] = "Life Insurance";
		abilities[1] = "Fangs";
		abilities[2] = "Claws";
		abilities[3] = "Brains";
		abilities[4] = "Tapes";
		abilities[5] = "Scare";
		abilities[6] = "Ninja Skills";
		
		System.out.println();
		//prints out abilities
		for(int i = 0; i < monsters.length; i++) {
			System.out.println(monsters[i] + " will attack with " + abilities[i]);
	}
		System.out.println();
	int[] hp = new int[monsters.length];
	//assign random hp
	for(int i = 0; i < monsters.length; i++) {
		hp[i] = (int)(Math.random() * 15 + 2);
	}
	System.out.println();
		//prints out hp
	for (int i = 0; i < monsters.length; i++) {
		System.out.println(monsters[i] + " has " + hp[i] + " health points");
	}
	System.out.println("The " + monsters[2] + " ate a teenager, how " +
	"many coins did it get?");//prompt to enter a number
	//taking in a number from user input
	coins[2] += input.nextInt();//adding coins to coins[2]
	input.nextLine();//get rid of extra enter character
	
	//taking in a string from user input
	System.out.println(monsters[2] + " morphs into what? ");//prompt
	monsters[2] = input.nextLine();
		
	System.out.println("The monster is a: " + monsters[2]);

	//todo list
	int totalCoins = coins[monsters.length-1];//accumulator
	int turns = 0;//track turns
	//fight while player hp > 0
	while(hp[hp.length-1] > 0) {
	  int randomMonster = (int)(Math.random() * monsters.length);
	  if(randomMonster != monsters.length-1) {
	  //decide hit or be hit
	  int hitChance = (int)(Math.random() * 2);
	  
	  if(hitChance % 2 == 0) {//
		//subtract random hp if player is hit
		int randomDmg = (int)(Math.random() * 2 + 1);
		hp[monsters.length-1] -= randomDmg;//subtracting hp
		System.out.println(monsters[randomMonster] + " hit you for " 
				+ randomDmg + "hp! " + hp[monsters.length-1] 
				+ " Hp Left. ");
	  }
	  else {//player does dmg
		  System.out.println("Player hits with " + abilities[monsters.length-1]
			+ " " + monsters[randomMonster] + " runs away. It left "
			+ coins[randomMonster] + " coins");
		 //collect coins
		  totalCoins += coins[randomMonster];
	  }
	  //track number of turns
	  turns++;   
	  }//end if
	  System.out.println();
	}//end while 
	System.out.println("You run away with " + totalCoins + " coins"
			+ " and lasted " + turns + " Turns. ");

	}//end main
}
