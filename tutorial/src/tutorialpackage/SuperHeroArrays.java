package tutorialpackage;
import java.util.Random;
public class SuperHeroArrays {

	public static void main(String[] args) {
		
		String [] superHeroArrays = {"Flash", "Deadpool", "Batman", "Superman", "Thanos"};//Makes a String variable with all the superhero names
		boolean [] isHumanArrays = {true, true, true, false, false};//Makes a boolean variable and tells if the superheros are human or not
		String []	superPowerArrays = {"Speed\n ", "Regenaration\n ", "Intelligence\n ", "Strength\n ", "Immortality\n "};//An String variable for the superPowers of the superHero
		
		System.out.println(superHeroArrays[0]);//
		System.out.println(superHeroArrays[superHeroArrays.length - 1]);//To find which superhero there is 
		
		//Prints out the name, powers, and if they are human
		for(int i = 0; i < superHeroArrays.length; i++) {
			System.out.println("Name: " + i + " " + superHeroArrays[i] + " Powers: " + superPowerArrays[i] + 
					"	Are they human? " + isHumanArrays[i]);
		}//end for
		
		System.out.println();//Put spaces
		
		//Prints out the name of superhero and if they lose powers
		for(int i = 0; i < superHeroArrays.length; i++) {
			System.out.println("Name: " + i + " " +superHeroArrays[i] + " Have they lose power? " + isHumanArrays[i]);
		}//end for
		
		System.out.println();//Puts spaces
		
		//Prints the superhero and that they got exposed to Couprinite and if they are human they do not lose powers if they are non-human they lose powers
		for(int i = 0; i < isHumanArrays.length; i++) {  
			System.out.println("Name: "  +  superHeroArrays[i] + "Have been exposed to Couprinite: " + "Are they human? " + isHumanArrays[i] );
			//If hero is human they will not lose power
			if(isHumanArrays[i] == true) {
				System.out.println("They still have their power since they are still human. " + "Power: " + superPowerArrays[i]);
			}//end if
			
			//Else statement that runs if hero is non human and lose powers
			else {
				System.out.println("They have lost their power since they are non-human which turns their power to: NONE");
				System.out.println();//Put spaces
			}//end else
		}//end for
		

	}//end main
}//end class
	


