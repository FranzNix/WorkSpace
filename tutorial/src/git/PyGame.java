package git;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
public class PyGame {

			static Random rand = new Random();
			static Scanner sc = new Scanner(System.in);
		
	static int UserHP = 50;
	// sets UserHP to 50
	static ArrayList<String>Backpack = new ArrayList<String>();
	// makes a backpack which will be filled with items during gameplay

	public static void YourRoom() {
	// creates YourRoom with no arguments  
	  System.out.println ("Your name is Rebly.");
	  //System.out.printlns Your name is Rebly
	  //thread.sleep(4);
	  // //thread.sleeps the program for 4 seconds
	  System.out.println ("Rebly wakes up in their room.");
	  // System.out.printlns UserName <- Choice of user + "wakes up in their room"
	  //thread.sleep(3);
	  ////thread.sleeps the program for 3 seconds
	  System.out.println ("You wake up with only underwear on.");
	  // System.out.printlns "You wake up with only underwear on."
	  //thread.sleep(3);
	  ////thread.sleeps the program for 3 seconds
	  System.out.println ("You hear glass breaking outside.");
	  // System.out.printlns "You hear glass breaking outside"
	  //thread.sleep(3);
	  ////thread.sleeps the program for 3 seconds
	  System.out.println ("You look out the window and zombies are overrunning the place.");
	  // System.out.printlns "You look out the window and zombie are overrunning the place."
	  //thread.sleep(4);
	  ////thread.sleeps the program for 4 seconds
	  System.out.println ("You know you have to make quick decisions.");
	  // System.out.printlns "You know you have to make quick decisions."
	  //thread.sleep(3);;
	  ////thread.sleeps the program for 3 seconds
	  System.out.println ("Your options are: \n1 Jump out the Window(Potential Danger)\n2: Walk out of the Room(Potential Danger)");
	  // System.out.printlns "Your options are
	  // 1: Jump out the Window(Potential Danger)
	  // 2: Walk out of the Room(Potential Danger)
	  Scanner input = new Scanner(System.in);
	  int choice = input.nextInt();
	  System.out.print("Enter a Number for your Choice, Remember Both have potential Danger");
	  // makes the variable choice and System.out.printlns "Enter a number for your Choice, Remember both have potential Danger"
	  if (choice == 1){
	  // if the choice == 1 continues  
	    window1();//calls window1()
	    }//end if choice equals to 1
	  else if (choice == 2){
	  // if the choice is 2 continues
	    door1();//calls door1
	    }//end else if choice equals 2
	  else {
	  // if the anwser is different than 1 or 2 continue
	    System.out.println ("Invalid choice, Try again");
	    // System.out.printlns Invalid choice, Try again
	    YourRoom();//calls YourRoom()
	    }//end else
	}//end YourRoom
	
	public static void window1() {
	//public staticines window01 with no arguments
	    System.out.println ("You die from the fall. Bad choice");
	    //System.out.printlns You die from the fall. Bad choice
	    //thread.sleep(3);
	    ////thread.sleeps the program for 3 seconds
	    YourRoom();//calls YourRoom()
	  }//end window1
	
	public static void door1() {
	//public staticines door1 with no arguments 
	  System.out.println ("You end up in your kitchen.");
	  //System.out.printlns You end up in your kitchen
	  //thread.sleep(3);
	  ////thread.sleeps the program for 3 seconds
	  System.out.println ("You hear a noise coming from the basement");
	  //System.out.printlns You head a noise coming from the basement
	  //thread.sleep(3);
	  ////thread.sleeps the program for 3 seconds
	  System.out.println ("1. Go to see what caused the noise? \n"
	  		                    + "2. Stay?");
	  // System.out.printlns "Go to see what caused the noise? or Stay?"
	  Scanner input = new Scanner(System.in);
	  int choice = input.nextInt();
	  //makes the variable choice and says "Go see what cause the noise? Or Stay?"
	  if (choice == 1){
	  //if the userchoice is equal to "Go" continue
	    basement1();//calls basement1()
	    }//end if choice equals 1
	  else if (choice == 2){
	  // else if the choice is equal to "Stay" continue
	    kitchen1();//calls kitchen1()
	    }//end else if choice equals 2
	  else {
	  // if the anwser is something either than "Go" or "Stay" continue
	    System.out.println ("Invalid choice, Try again");
	    // System.out.printlns "Invalid choice, Try again"
	    door1();//calls door1()
	}//end else
	  }//end door1
	
	public static void basement1() {
	// public staticines basement1 with nho arguments
	  System.out.println ("You enter the Basement");
	  // System.out.printlns "You enter the Basement"
	  //thread.sleep(3);;
	  // //thread.sleeps the program for 3 seconds
	  System.out.println ("False alarm, It was just a box");
	  // System.out.printlns "False alarm, It was just a box"
	  //thread.sleep(3);;
	  // //thread.sleeps the program for 3 seconds
	  System.out.println ("There is however clothes for you to take");
	  // System.out.printlns There is however clothes for you to take
	  //thread.sleep(3);;
	  // //thread.sleeps the program for 3 seconds
	  System.out.println ("Would you like to take these clothes?");
	  // System.out.printlns Would you like to take these clothes?
	  //thread.sleep(3);;
	  // //thread.sleeps the program for 3 seconds
	  System.out.println("1. Take Clothes\n"
			   + "2. Leave Clothes");
	  Scanner input = new Scanner(System.in);
	  int choice = input.nextInt();
	  // makes the choice variable and System.out.printlns "Say yes to take clothes. Say no to leave them"
	  if (choice == 1 && !Backpack.contains("Clothes")) {
	  // if the user choice equals to Yes and clothes are not in the variable Backpack continue  
	  if (Backpack.contains("Clothes")){
	  // if Clothes are in Backpack continue  
	    System.out.println ("You already have clothes. Why would you need more?");
	      // System.out.printlns "You already have clothes. Why would you need more?"
	      }//end if Backpack.contains("Clothes")
	    }//end if choice equals 1 and Backpack.contains("Clothes")
	    if (Backpack.contains("Clothes")){
	    // if Clothes are not in Backpack continue
	      Backpack.add("Clothes");
	      }//adds Clothes to Backpack
	      // goes to Backpack and adds the Item "Clothes to it"
	  else if (choice == 2){
	  // if the user choice is equal to No continue  
	    System.out.println ("Thats alright, I also like being without clothes");
	    // System.out.printlns Thats alright, I also like being without clothes
	  }//end else if choice equals 2
	  else {
	  // if anything other than 'No' or 'no' or 'Yes' or 'yes' continue
	    System.out.println ("I don't think you understood the question");
	    //System.out.printlns "I don't think you understood the question"
	    //thread.sleep(3);
	    ////thread.sleeps the program for 3 seconds
	    basement1();//calls basement1()
	  }//end else
	  System.out.println ("You suddenly remember your dad had a safe with guns.");
	  //System.out.printlns You suddenly remember your dad had a safe with guns.
	  //thread.sleep(3);
	  // //thread.sleeps the program for 3 seconds
	  System.out.println ("There is however an alarm on the door to the room");
	  // System.out.printlns There is however an alarm on the door to the room
	  //thread.sleep(3);
	  // //thread.sleeps the program for 3 seconds
	  System.out.println ("You do not know what the passcode to turn off the alarm is.");
	  // System.out.printlns "You do not know what the passcode to turn off the alarm is."
	  //thread.sleep(3);
	  // //thread.sleeps the program for 3 seconds 
	  System.out.println ("Your choice are  \n1. Continue Through the door anyways. \n2. Go back to the kitchen");
	  // System.out.printlns Your choice are
	  // 1. Continue Through the door anyways.
	  // 2. Go back to the kitchen
	  Scanner input1 = new Scanner(System.in);
	  int choice1 = input1.nextInt();
	  // creates the variable choice and System.out.printlns "Say 1 to Continue, or Say 2 to go Back"
	  if (choice1 == 1){
	  // if the choice is equal to 1 continue 
	    System.out.println ("Might as well go since we're down here.");
	    // System.out.printlns "Might as well go since we're down here."
	    gunroom();//calls gunroom()
	    }//end if choice1 equals 1
	  else if (choice1 == 2){
	  // else if the choice is equal to 2 continue  
	    System.out.println ("I'm not going to take that chance, it might be too loud.");
	    // System.out.printlns "I'm not going to take that chance, it might be too loud."
	    kitchen1();//calls kitchen1()
	    }//end else if choice1 equals 2
	  else {
	  // if the choice is anything other than 1 or 2 continue  
	    System.out.println ("Invalid choice, maybe you didn't understand?");
	    // System.out.printlns "Invalid choice, maybe you didn't understand?"
	    //thread.sleep(3);
	    // //thread.sleeps the program for 3 seconds
	    basement1();//calls basement1()
	  }//end else
	}//end basement1
	
	public static void kitchen1() {
	// public staticines Kitchen1 with no arguments
	  System.out.println ("You return to the kitchen.");
	  //System.out.printlns You return to the kitchen
	  //thread.sleep(2)
	  // //thread.sleeps the program for 2 seconds
	  System.out.println ("You have to make a choice whether: \n"
			  + "1. Leave the house and find people \n"
			  + "2. Stay and make a hideout?");
	  //System.out.printlns "You have to make a choice whether to leave the house and find people, or stay and make a hideout?"
	  Scanner input = new Scanner(System.in);
	  int choice = input.nextInt();
	  // creates the variable choice and System.out.printlns "Enter Leave to leave, or Enter Stay to Stay"
	  if (choice == 1) {
	  // if the user choice is equal to 'Leave' or 'leave' continue
	    System.out.println ("You leave the house to try and find people");
	    // System.out.printlns "You leave the house to try and find people"
	    //thread.sleep(3);
	    ////thread.sleeps the program for 3 seconds
	    System.out.println ("The moment you leave the house you see people");
	    // System.out.printlns "The moment you leave the house you see people"
	    //thread.sleep(3);
	    // //thread.sleeps the program for 3 seconds
	    System.out.println ("The people you have found are your family members.");
	    // System.out.printlns "The people you have found are your family members."
	    //thread.sleep(3);
	    ////thread.sleeps the program for 3 seconds
	    Endgame();//calls Endgame()
	  }//end if choice equals 1
	  else if (choice == 2) {
	  // else if the user choice = 'Stay' or 'stay' continue
	    System.out.println ("Ok, well if we're going to stay we might as well secure this place.");
	    //System.out.printlns "Ok, well if we're going to stay we might as well secure this place."
	    //thread.sleep(3);
	    ////thread.sleeps the program for 3 seconds
	    System.out.println ("There's a couple of things that you could take apart.");
	    // System.out.printlns "There's a couple of things that you could take apart."
	    //thread.sleep(3);
	    ////thread.sleeps the program for 3 seconds
	    System.out.println ("Would you like to take apart the chair's, the table's, or the cabinet's?");
	    // System.out.printlns "Would you like to take apart the chair's, the table's, or the cabinet's?"
	    //thread.sleep(3);
	    // //thread.sleeps the program for 3 seconds
	    System.out.println ("There are 3 chair's and each chair gives 4 wood");
	    // System.out.printlns "There are 3 chair's and each chair gives 4 wood"
	    //thread.sleep(3);
	    ////thread.sleeps the program for 3 seconds
	    System.out.println ("There is 1 table and it gives 10 wood");
	    // System.out.printlns "There is 1 table and it gives 10 wood"
	    //thread.sleep(3);
	    // //thread.sleeps the program for 3 seconds
	    System.out.println("There are 7 cabinets which give 3 wood each.");
	    // System.out.printlns "There are 7 cabinets which give 3 wood each."
	    //thread.sleep(3);
	    ////thread.sleeps the program for 3 seconds
	    System.out.println("You require 21 wood to complete the house, you only have enough energy to take apart 1 item.");
	    // System.out.printlns "You require 21 wood to complete the house, you only have enough energy to take apart 1 item."
	    //thread.sleep(3);}
	    // //thread.sleeps the program for 3 seconds
	  }//end else if choice equals 2
	  System.out.println("Enter 1. For Chairs"
	  		+ "2. For Tables"
	  		+ "3. For Cabinets");
	  Scanner input1 = new Scanner(System.in);
	  int choice1 = input1.nextInt();
	    // creates the variable choice and System.out.printlns "Enter Ch for chair's, T for table's, C for Cabinets"
	    if (choice1 == 1){
	    // if the user choice equals to 1 continue
	      System.out.println ("Calculating...");
	      // System.out.printlns "Calculating..."
	      //thread.sleep(2)
	      ////thread.sleeps the program for 2 seconds 
	      System.out.println ("...........");
	      // pritns ...........
	      //thread.sleep(2);
	      // //thread.sleeps the frogram for 2 seconds
	      System.out.println ("I think you might need to practice your math a bit.");
	      // System.out.printlns "I think you might need to practice your math a bit."
	      kitchen1();//calls kitchen1()
	    }//end if choice1 equals 2
	      // calls the function kitchen1() to go back to it
	    else if (choice1 == 2) {
	    // else if the chocie is equal to 2 continue
	      System.out.println ("Calculating...");
	      // System.out.printlns "Calculating..."
	      //thread.sleep(2)
	      // //thread.sleeps the program for 2 seconds
	      System.out.println ("...........");
	      //System.out.printlns "..........."
	      //thread.sleep(2)
	      System.out.println ("If only there was another table than you would be good.");
	      // System.out.printlns "If only there was another table than you would be good."
	      //thread.sleep(3);
	      // //thread.sleeps the program for 3 seconds
	      System.out.println ("But sadly I think your math is a bit off");
	      // System.out.printlns "But sadly I think your math is a bit off"
	      kitchen1();//calls kitchen1()
	      }//end else if choice1 equals to 2
	    else if (choice1 == 3) {
	    // else if the choice is equal to 3 continue
	      System.out.println ("Calculating...");
	      //System.out.printlns "Calculating..."
	      //thread.sleep(2)
	      // //thread.sleeps the program for 2 seconds
	      System.out.println ("..........");
	      // System.out.printlns ".........."
	      //thread.sleep(2)
	      // //thread.sleeps the program for 2 seconds
	      System.out.println ("Well done sir! Your math is on point!");
	      // System.out.printlns "Well don sir! Your math is on point!"
	      //thread.sleep(3);
	      ////thread.sleeps the program for 3 seconds
	      System.out.println ("Wow, that was some hard work.");
	      // System.out.printlns "Wow, that was some hard work."
	      //thread.sleep(3);
	      // //thread.sleeps the program for 3 seconds
	      System.out.println ("I think you deserve some well rest, you'll continue tomorrow.");
	      // System.out.printlns "I think you deserve some well rest, you'll continue tomorrow."
	      //thread.sleep (4)
	      // //thread.sleeps the program for 4 seconds
	      wakeup();//calls wakeup()
	      }//end else if choice1 equals 3
	    else {
	    // if anything else is written than 1, 2 or 3 continue
	      System.out.println ("I don't think you know your numbers.");
	      // System.out.printlns "I don't think you know your numbers."
	      //thread.sleep(3);
	      // //thread.sleeps the program for 3 seconds
	      System.out.println ("Try again");
	      // System.out.printlns "Try again"
	      //thread.sleep(2)
	      // //thread.sleeps the program for 2 seconds
	      kitchen1();//calls kitchen1()
	      }//end else
	}//ends kitchen1
	
	public static void wakeup() {
	// public staticines the fuction wakeup()
	  System.out.println ("Yawwwwn!");
	  // System.out.printlns Yawwwwn!
	  //thread.sleep(2)
	  // //thread.sleeps the program for 2 seconds
	  System.out.println ("That was a good rest don't you think?");
	  // System.out.printlns "That was a good rest don't you think?"
	  System.out.println("Enter: 1. Yes \n"
	  		+ "2. No");
	  Scanner input = new Scanner(System.in);
	  int choice = input.nextInt();
	  // creates the function choice and System.out.printlns "Enter 1 for Yes, or 2 for No"
	  if (choice == 1) {
	  // if the user choice is equal to 1 continue
	    System.out.println("You bet it was!");
	    // System.out.printlns "You bet it was!"
	    //thread.sleep(1)
	    // //thread.sleeps the program for 1 second
	    System.out.println("Now let's continue this journey shall we?");
	    // System.out.printlns "Now let's continue this journey shall we?"
	    //thread.sleep(2)
	    // //thread.sleeps the program for 2 seconds
	  }//end if choice equals 1
	  System.out.println("Enter: 1. Continue \n"
	  		+ "2. Stop");
	  Scanner input1 = new Scanner(System.in);
	  int choice1 = input1.nextInt();
	    // creates the variable choice and System.out.printlns "Enter 1 to continue, or 2 to stop"
	    if (choice1 == 1) {
	    // if the user choice is equal to 1 continue
	      System.out.println("Great let's get back to securing this place!");
	      // System.out.printlns "Great let's get back to securing this place!"
	      //thread.sleep(2)
	      // //thread.sleeps the program for 2 seconds
	      journeycontinue();
	      // calls the function journeycontinue to continue to it
	    }//end if choice1 equals 1
	    else if (choice1 == 2) {
	    // else if the choice is equal to 2 continue
	      System.out.println("You stopped the journey.");
	      // System.out.printlns "You stopped the journey"
	      //thread.sleep(2)
	      // //thread.sleeps the program for 2 seconds
	      System.out.println ("Just kidding you can't stop this journey.");
	      // System.out.printlns "Just kidding you can't stop this journey"
	      //thread.sleep(3);
	      // //thread.sleeps the program for 3 seconds
	      System.out.println ("Now let's continue and stop being lazy");
	      // System.out.printlns "Now let's continue and stop being lazy"
	      //thread.sleep(2)
	      // //thread.sleeps the program for 2 seconds
	      journeycontinue();//calls journeycontinue()
	      }//end else if choice1 equals 2
	    else if (choice1 == 2) {
		// else if the user choice is equal to 2 continue
		System.out.println("Well you have no choice we're continuing this journey!");
		// System.out.printlns "Well you have no choice we're continuing this journey!"
		//thread.sleep(2)
		//thread.sleeps the program for 2 seconds
		journeycontinue();//calls journeycontinue()
		}//end else if choice1 equals 2
	    else {
	    // if anything other than 1 or 2 is entered continue
	      System.out.println ("I don't think that you understood the question");
	      // System.out.printlns "I don't think that you understood the question"
	      //thread.sleep(3);
	      // //thread.sleeps the program for 3 seconds
	      System.out.println ("Try again");
	      // System.out.printlns "Try again"
	      //thread.sleep(2)
	      // //thread.sleeps the program for 2 seconds
	      wakeup();//calls wakeup()
	    }//end else
	}//end wakeup
	
	public static void journeycontinue() {
	// public staticines journeycontinue()
	  System.out.println("Well we have baricaded the windows and doors already");
	  // System.out.printlns "Well we have baricaded the windows and doors already"
	  //thread.sleep(3);
	  // //thread.sleeps the program for 3 seconds
	  System.out.println("We might as well dismantle the table and chairs too.");
	  // System.out.printlns "We might as well dismantle the table and chairs too."
	  //thread.sleep(3);
	  // //thread.sleeps the program for 3 seconds
	  System.out.println("What would you like to dismantle first?");
	  // System.out.printlns "What would you like to dismantle first?"
	  //thread.sleep(2)
	  ////thread.sleeps the program for 2 seconds
	  System.out.println("Enter: 1. Table \n"
	  		+ "2. Chairs");
	  Scanner input = new Scanner(System.in);
	  int choice = input.nextInt();
	  // creates the variable choice and System.out.printlns "Enter 1 for Tables, or 2 for chairs"
	  if (choice == 1) {
	  // if the user choice is equal to 1 continue
	    System.out.println ("You begin to dismantle the tables.");
	    // System.out.printlns "You begin to dismantle the tables"
	    //thread.sleep(2)
	    // //thread.sleeps the program for 2 seconds
	    System.out.println ("As you dismantle one of the tables you find something wierd under it.");
	    // System.out.printlns "As you dismantle one of the tables you find something wierd under it."
	    //thread.sleep(4)
	    // //thread.sleeps the program for 4 seconds
	    System.out.println ("It is a secret passage...");
	    // System.out.printlns "It is a secret passage..."
	    //thread.sleep(2)
	    ////thread.sleeps the program for 2 seconds
	    secretpassageentrance();//calls secretpassageentrance()
	    }//end if choice equals to 1
	  else if (choice == 2) {
	  // else if the choice is equal to 2 continue
	    System.out.println ("You dismantle all of the chairs in a quick matter.");
	    // System.out.printlns "You dismantle all of the chairs in a quick matter."
	    //thread.sleep(3);
	    // //thread.sleeps the program for 3 seconds
	    System.out.println ("Once you finish the chairs, you begin to dismantle all the tables.");
	    // System.out.printlns "Once you finish the chairs, you begin to dismantle all the tables."
	    //thread.sleep(4)
	    // //thread.sleeps the program for 4 seconds
	    System.out.println("Under one of the tables you find something rather wierd.");
	    // System.out.printlns "Under one of the tables you find something rather wierd"
	    //thread.sleep(3);
	    ////thread.sleeps the program for 3 seconds
	    System.out.println("There is a secret passageway.");
	    // System.out.printlns "There is a secret passageway."
	    //thread.sleep(2)
	    // //thread.sleeps the program for 2 seconds
	    secretpassageentrance();//calls secretpassageentrance()
	    }//end else if choice equals 2
	  else {
	  // if anything else is typed continue
	    System.out.println ("I think you wrote the wrong number.");
	    // System.out.printlns "I think you wrote the wrong number."
	    System.out.println ("Try again");
	    // System.out.printlns "Try again"
	    //thread.sleep(2)
	    // //thread.sleeps the program for 2 seconds
	    journeycontinue();//calls journeycontinues()
	    }//end else
	}//end journeycontinue
	
	public static void secretpassageentrance() {
	// public staticines the function secretpassageentrance
	  System.out.println ("Do you want to enter this secret passage?");
	  // System.out.printlns "Do you want to enter this secret passage?"
	  //thread.sleep(2)
	  // //thread.sleeps the program for 2 seconds
	  System.out.println("1. Go\n"
	  		   + "2. Stay");
	  Scanner input = new Scanner(System.in);
	  int choice = input.nextInt();
	  // creates the variable choice and asks System.out.printlns "Enter 1 to go, or 2 to stay"
	  if (choice == 1) {
	  // if the choice is equal to 1 continue
	    System.out.println ("Ok here we go !");
	    // System.out.printlns "Ok here we go !"
	    //thread.sleep(2)
	    // //thread.sleeps the program for 2 seconds
	    secretpassage();//calls secretpassage()
	    }//end if choice equals 1
	  else if (choice == 2) {
	  // else if the user choice is equal to 2 continue
	    knockknock();//calls knockknock
	    }//end else if choice equals 2
	  else {
	  // if the user choice is something either than 1 or 2 continue
	    System.out.println ("I think you have misread the question");
	    // System.out.printlns "I think you have misread the question"
	    System.out.println ("Try again.");
	    // System.out.printlns "Try again"
	    //thread.sleep(3);
	    // //thread.sleeps the program for 3 seconds
	    secretpassageentrance();//calls secretpassageentrance
	    }//end else
	}//end secretpassageentrance
	
	public static void secretpassage() {
	// public staticines the variable secretpassage() 
	  System.out.println ("You enter the Secret passage");
	  // System.out.printlns "You enter the Secret passage"
	  //thread.sleep(3);
	  // //thread.sleeps the program for 3 seconds
	  System.out.println ("There are 3 doors ahead of you.");
	  // System.out.printlns "There are 3 doors ahead of you."
	  //thread.sleep(3);
	  // //thread.sleeps the program for 3 seconds
	  System.out.println ("Each are labeled Trap door. Do not Enter");
	  // System.out.printlns "Each are labeled Trap door. Do not Enter"
	  //thread.sleep(3);
	  // //thread.sleeps the program for 3 seconds
	  System.out.println("Do you want to Enter one of the doors or leave?");
	  // System.out.printlns "Do you want to Enter one of the doors or leave?"
	  //thread.sleep(3);
	  // //thread.sleeps the program for 3 seconds
	  System.out.println("1. Door #1\n"
	  		   + "2. Door #2\n"
	  		   + "3. Door #3\n"
	  		   + "4. Leave");
	  Scanner input = new Scanner(System.in);
	  int choice = input.nextInt();
	  // creates the variable choice and System.out.printlns "Enter 1 for door 1, 2 for door 2, 3 for door 3, or 4 to leave."
	  if (choice == 1) {
	  // if the user choice is equal to 1 continue
	    System.out.println ("You enter Trap door 1");
	    // System.out.printlns "You enter Trap door 1"
	    //thread.sleep(2)
	    // //thread.sleeps the program for 2 seconds
	    System.out.println ("It is infact a trap.");
	    // System.out.printlns "It is infact a trap."
	    //thread.sleep(2)
	    // //thread.sleeps the program for 2 seconds
	    System.out.println ("You die.");
	    // System.out.printlns "You die."
	    //thread.sleep(2)
	    // //thread.sleeps the program for 2 seconds
	    secretpassage();//calls secretpassage()
	    }//end if choice equals 1
	  else if (choice==2) {
	  // else if the choice is equal to 2 continue
	    System.out.println ("You enter Trap door 2");
	    // System.out.printlns "You enter Trap door 2"
	    //thread.sleep(2)
	    // //thread.sleeps the program for 2 seconds
	    System.out.println ("It is infact a trap.");
	    // System.out.printlns "It is infact a trap."
	    //thread.sleep(2)
	    // //thread.sleeps the program for 2 seconds
	    System.out.println ("You die.");
	    // System.out.printlns "You die."
	    //thread.sleep(2)
	    // //thread.sleeps the program for 2 seconds
	    secretpassage();//calls secretpassage()
	    }//end else if choice equals 2
	  else if (choice==3) {
	  // else if the choice is equal to 3 continue
	    System.out.println ("You enter Trap door 3");
	    // System.out.printlns "You enter Trap door 3"
	    //thread.sleep(2)
	    // //thread.sleeps the program for 2 seconds
	    System.out.println ("It is infact a trap.");
	    // System.out.printlns "It is infact a trap."
	    //thread.sleep(2)
	    // //thread.sleeps the program for 2 seconds
	    System.out.println ("You die.");
	    // System.out.printlns "You die"
	    //thread.sleep(2)
	    // //thread.sleeps the program for 2 seconds
	    secretpassage();//calls secretpassage()
	    }//end else if choice equals 3
	  else if (choice == 4) {
	  // else if the user choice is equal to 4 continue
	    System.out.println ("Are you sure you want to go back?");
	    // System.out.printlns "Are you sure you want to go back?"
	    //thread.sleep(3);}
	    // //thread.sleeps the program for 3 seconds
	  }//end else if choice equals 4
	  System.out.println("1. Yes\n"
	  		   + "2. Go back");
	  Scanner input1 = new Scanner(System.in);
	  int choice1= input1.nextInt();
	    // creates the variable choice and System.out.printlns "Enter 1 for Yes, or 2 to go back to secret passage."
	    if (choice1 == 1) {
	    // if the user choice is equal to 1 continue
	      System.out.println ("Ok! Let's Go!");
	      // System.out.printlns "Ok! Let's Go!"
	      //thread.sleep(2)
	      // //thread.sleeps the program for 2 seconds
	      knockknock();//calls knockknock
	      }//end if choice1 equals 1
	    else if (choice1 == 2) {
	    // else if the choice equals to 2 continue
	      System.out.println ("Alright! Let's go back!");
	      // System.out.printlns "Alright! Let's go back!"
	      //thread.sleep(2)
	      // //thread.sleeps the program for 2 seconds
	      secretpassage();//calls secrepassage()
	      }//end else if choice1 equals 2
	    else {
	    // if user choice is something other than 1 or 2 continue
	      System.out.println ("I think you have misread the question");
	      // System.out.printlns "I think you have misread the question"
	      //thread.sleep(3);
	      // //thread.sleeps the program for 3 seconds
	      System.out.println ("Try again");
	      // System.out.printlns "Try again"
	      //thread.sleep(2)
	      // //thread.sleeps the program for 2 seconds
	      secretpassage();//calls secretpassage()
	      }//end else
	}//end secretpassage
	
	public static void knockknock() {
	// public staticines the variable knockknock()  
	  System.out.println ("You hear a knock coming from the door.");
	  // System.out.printlns "You hear a knock coming from the door."
	  //thread.sleep(3);
	  // //thread.sleeps the program for 3 seconds
	  System.out.println ("Do you want to open the door?");
	  // System.out.printlns "Do you want to open the door?"
	  //thread.sleep(1)
	  // //thread.sleeps the program for 1 seconds
	  System.out.println("1. Open door \n"
	  		+ "2. Keep it closed");
	  Scanner input = new Scanner(System.in);
	  int choice = input.nextInt();
	  // creates the variable choice and System.out.printlns "Enter 1 to open the door, or 2 to keep it closed"
	  if (choice == 1) {
	  // if the choice is equal to 1 continue
	    System.out.println ("You open the door....");
	    // System.out.printlns "You open the door"
	    //thread.sleep(5)
	    // //thread.sleeps program for 5 seconds
	    System.out.println ("To your surprise it's someone you know.");
	    // System.out.printlns "To your surprise it's someone you know."
	    //thread.sleep(3);
	    // //thread.sleeps the program for 3 seconds
	    System.out.println ("It's.");
	    // System.out.printlns "It's."
	    //thread.sleep(1)
	    // //thread.sleeps the program for 1 second
	    System.out.println ("It's.");
	    // System.out.printlns "It's."
	    //thread.sleep(1)
	    // //thread.sleeps the program for 1 second.
	    System.out.println ("It's Your family they live!");
	    // System.out.printlns "It's Your family they live!"
	    //thread.sleep(2)
	    // //thread.sleeps the program for 2 seconds
	    Endgame();//calls Endgame()
	    }//endif equals 1
	  else if (choice== 2) {
	  // else if the choice is equal to 2 continue
	    System.out.println ("The noise is getting louder.");
	    // System.out.printlns "The noise is getting louder."
	    //thread.sleep(2)
	    // //thread.sleeps the program for 2 seconds
	    System.out.println ("You begin to hear whispers outside the door.");
	    // System.out.printlns "You begin to hear whispers outside the door."
	    //thread.sleep(3);
	    // //thread.sleeps the program for 3 seconds
	    System.out.println ("Someone outside says.");
	    // System.out.printlns "Someone outside says."
	    //thread.sleep(2)
	    // //thread.sleeps the program for 2 seconds
	    System.out.println ("OPEN THE DOOR, OR WE WILL!");
	    // System.out.printlns "OPEN THE DOOR, OR WE WILL!"
	    //thread.sleep(3);
	    // //thread.sleeps the program for 3 seconds
	    System.out.println ("You're going to have to make a choice whether to open the door or not.");
	    // System.out.printlns "You're going to have to make a choice whether to open the door or not."
	  }//end else if choice equals 2
	  System.out.println("1. Open Door \n"
			   + "2. Keep Close");
	  Scanner input = new Scanner(System.in);
	  int choice = input.nextInt();
	    // creates variable choice and System.out.printlns "Enter 1 to open Door, Enter 2 to keep it closed."
	    if (choice== 1) {
	    // if the choice is equal to 1 continue
	      System.out.println ("You aproach the door quickly");
	      // System.out.printlns "You aproach the door quickly"
	      //thread.sleep(2)
	      // //thread.sleeps the program for 2 seconds
	      System.out.println ("You can still go back if you'd like?");
	      // System.out.printlns "You can still go back if you'd like"
	      //thread.sleep(2)
	      // //thread.sleeps the program for 2 seconds
	    }//end if choice equals 1
		System.out.println("1. Turn Handle \n"
				   + "2. Do not Open");
		Scanner input1 = new Scanner(System.in);	
		int choice1 = input1.nextInt();
	      // creates the variable choice and System.out.printlns "Enter 1 to turn handle, Enter 2 to not open"
	      if (choice1 == 1) {
	      // if the user choice is equal to 1 continue
	        System.out.println ("You slowly turn the handle.");
	        // System.out.printlns "You slowly turn the handle."
	        //thread.sleep(2)
	        // //thread.sleeps the program for 2 seconds
	        System.out.println ("The door opens.");
	        // System.out.printlns "The door opens."
	        //thread.sleep(2)
	        // //thread.sleeps the program for 2 seconds
	        System.out.println ("It's Your family.");
	        // System.out.println ("It's Your family.")
	        //thread.sleep(3);
	        // //thread.sleeps the program for 3 seconds
	        Endgame();//calls Endgame()
	      }//end if choice1 equals 1
	      else if (choice1 == 2) {
	      // else if the user choice is equal to 2 continue
	        System.out.println("You step back and wait to see what happens.")
	        // System.out.printlns "You step back and wait to see what happens."
	        //thread.sleep(3);
	        // //thread.sleeps the program for 3 seconds
	        Bustdoor();//calls Bustdoor()
	      }//end else if choice1 equals 2
	      else {
	      // if the user choice is anything other than 1 or 2 continue
	        System.out.println ("Invalid choice");
	        // System.out.printlns "Invalid choice"
	        //thread.sleep(3);
	        // //thread.sleeps the program for 3 seconds
	        System.out.println ("Try again");
	        // pritns "Try again"
	        //thread.sleep(2)
	        // //thread.sleeps the program for 2 seconds
	        knockknock();//calls knockknock()
	      }//end else
	        // calls the function knock knock to go to it.
	    else if (choice1 == 2) {
	    // else if the choice is equal to 2 continue
	      System.out.println ("You patiently wait for what happens next.")
	      // System.out.printlns "You patiently wait for what happens next."
	      //thread.sleep(3);
	      // //thread.sleeps the program for 3 seconds
	      Bustdoor();
	    }//end 
	      // calls the function Bustdoor() to go to it
	    else {
	    // if the user choose anything other than 1 or 2 continue
	      System.out.println("Invalid choice.")
	      // System.out.printlns "Invalid choice."
	      //thread.sleep(2)
	      // //thread.sleeps the program for 2 seconds
	      System.out.println("Try again")
	      // System.out.printlns "Try again"
	      //thread.sleep(2)
	      // //thread.sleeps the program for 2 seconds
	      knockknock()}
	      // calls the function knockknock() to go to it.
	}
	public static void Bustdoor() {
	// public staticines the function Bustdoor():
	  System.out.println ("The door gets busted down.");
	  // System.out.printlns "The door gets busted down."
	  //thread.sleep(3);
	  // //thread.sleeps the program for 3 seconds
	  System.out.println ("It's your family.");
	  // System.out.printlns "It's your family."
	  //thread.sleep(3);
	  // //thread.sleeps the program for 3 seconds
	  Endgame();
	  // call the function Endgame() to go to it.
	}
	  

	public static void gunroom() {
	// public staticines the variable gunroom()  
	  System.out.println ("Ok, you don't have to continue if you dont want to.");
	  // System.out.printlns "Ok, you don't have to continue if you dont want to."
	  //thread.sleep(2);
	  // //thread.sleeps the program for 2 seconds
	  System.out.println ("\n1. Turn the handle and take the chance of the alarm going off? \n2. Return to the kitchen?");
	  //System.out.printlns
	  // 1. Turn the handle and take the chance of the alarm going off?
	  // 2. Return to the kitchen?
	  
	  choice = int(input("Enter 1 to enter the room, Enter 2 to return to kitchen"))
	  // creates the variable choice and System.out.printlns "Enter 1 to enter the room, Enter 2 to return to kitchen"
	  if (choice == 1) {
	  // if the user choice equals to 1 continue 
	    System.out.println ("BEEP! BEEP! BEEP!")
	    // System.out.printlns "BEEP! BEEP! BEEP!"
	    //thread.sleep(3);
	    // //thread.sleeps the program for 3 seconds
	    System.out.println ("....Groan....")
	    // System.out.printlns "....Groan...."
	    //thread.sleep(3);
	    // //thread.sleeps the program for 3 seconds
	    gunroominside()}
	    // calls the function gunroominside() to continue to it
	  else if (choice == 2) {
	  // else if the choice is equal to 2 continue
	    kitchen1()}
	    // calls the function kitchen1() to go to it
	  else {
	  // if the user choice is something other than 1 or 2 continue
	    System.out.println ("I think you have misread the question")
	    // System.out.printlns "I think you have misread the question"
	    //thread.sleep(2)
	    // //thread.sleeps the program for 2 seconds
	    System.out.println ("Try again")
	    // System.out.printlns "Try again"
	    //thread.sleep(1)
	    // //thread.sleeps the program for 1 seconds
	    gunroom()}
	    // calls the function gunroom() to go to it
	}

	public static void gunroominside() {
	// public staticines gun room inside
	  System.out.println ("Quickly! Grab a gun! THE ZOMBIES ARE COMING!");
	  // System.out.printlns "Quickly! Grab a gun! THE ZOMBIES ARE COMING!"
	  //thread.sleep(2);
	  // //thread.sleeps the program for 2 seconds
	  System.out.println ("Your choice of guns are: \n1: Pistol \n2: Shotgun");
	  //System.out.printlns '''Your choice of guns are:
	  // 1: Pistol
	  // 2: Shotgun
	  
	  choice = int(input("Enter 1 for Pistol, Enter 2 for Shotgun"))
	  // creates the variable choice and System.out.printlns "Enter 1 for Pistol, Enter 2 for Shotgun"
	  if (choice == 1 and "Pistol" not in Backpack) {
	  // if the user choice is equal to 1 and Pistol is not in Backpack continue
	    if ("Pistol" in Backpack) {
	    // if "Pistol" is already in the variable Backpakc continue
	      System.out.println ("You already have a Pistol you goof!")}
	      // System.out.printlns "You already have a Pistol you goof!"
	    if ("Pistol" not in Backpack) {
	    // if "Pistol" is not in the variable Backpack continue
	      System.out.println ("Good choice, flexible gun with lots of options!")
	      //System.out.printlns "Good choice, flexible gun with lots of options!"
	      Backpack.append("Pistol")}}
	      // Adds the String Pistol to The variable Backpack
	  else if (choice == 2 and "Shotgun" not in Backpack) {
	  // else if the user choice is equal to 2 and Shotgun is not in Backpack continue
	    if ("Shotgun" in Backpack){
	    // if the "Shotgun" string is in Backpack continue
	      System.out.println ("You already have a Pistol you goof!")}
	      // System.out.printlns "You already have a Pistol you goof!"
	    if ("Shotgun" not in Backpack){
	    // if "Shotgun" string is not in Backpack continue
	      System.out.println ("Good choice, Easy kills with this bad boy!")
	      // System.out.printlns "Good choice, Easy kills with this bad boy!"
	      Backpack.append("Shotgun")}}
	      // Adds the string "Shotgun" to the variable Backpack
	  else {
	  // if something else other than 1 or 2 is chosen continue
	    System.out.println ("Wasn't in the choice sorry")
	    // System.out.printlns "Wasn't in the choice sorry"
	    //thread.sleep(3);
	    ////thread.sleeps the program for 3 seconds
	    gunroominside()}
	    //calls the function gunroominside to go to it
	    
	  System.out.println ("5 zombies are incoming!");
	  // System.out.printlns "5 zombies are incoming!"
	  //thread.sleep(3);
	  // //thread.sleeps the program for 3 seconds
	  System.out.println ("Are you going to run? Or are you going to fight?");
	  //System.out.printlns "Are you going to run? Or are you going to fight?"
	  
	  choice = int(input("Enter 1 to Run, or Enter 2 to fight!"))
	  // makes the variable choice and System.out.printlns "Enter 1 to Run, or Enter 2 to fight!"
	  if (choice == 2) {
	  // if the user choice is 1 continue
	    System.out.println ("PREPARE TO FIGHT!!");
	    // System.out.printlns "PREPARE TO FIGHT!!"
	    Fightnumber1();}
	    // calls the function Fightnumber1() to go to it
	  else if (choice == 1) {
	  // else if the choice is equal to 2 continue
	    System.out.println ("You run right into the hoard of zombies and get caught.");
	    // System.out.printlns "You run right into the hoard of zombies and get caught."
	    //thread.sleep(3);
	    ////thread.sleeps the program for 3 seconds
	    System.out.println ("You die sorry.");
	    // System.out.printlns "You die sorry."
	    //thread.sleep(3);
	    // //thread.sleeps the program for 3 seconds
	    gunroominside();}
	    // calls the function gunroominside() to continue to it
	  else {
	  // if anything else is written other than 1 or 2 continue
	    System.out.println ("I don't think you understood the question.")
	    // System.out.printlns  "I don't think you understood the question"
	    //thread.sleep(3);
	    // //thread.sleeps the program for 3 seconds
	    System.out.println ("Try again")
	    // System.out.printlns "Try again"
	    //thread.sleep(2)
	    // //thread.sleeps the program for 2 seconds
	    gunroominside();
	    // calls the function gunroominside() to go back to it
	}
	public static void Fightnumber1() {
	//public staticines Fightnumber1 with no parameters
	  System.out.println ("Intense music incoming!");
	  // System.out.printlns "Intense music incoming!"
	  //thread.sleep(3);
	  // //thread.sleeps the program for 3 seconds
	  System.out.println ("First zombie coming");
	  // System.out.printlns "First zombie coming"
	  //thread.sleep(2);
	  // //thread.sleeps the program for 2 seconds
	  choice = int(input("Enter 1 to shoot in the head or 2 in the chest"))
	  // creates the variable choice and asks the user "Enter 1 to shoot in the head"
	  if (choice == 1) {
	  // if the choice is equal to 1 continue
	    System.out.println ("You shoot the zombies in the head");
	    // System.out.printlns "You shoot the zombies in the head"
	    //thread.sleep(3);
	    // //thread.sleeps the program for 3 seconds
	    System.out.println ("They all die");
	    // System.out.printlns "They all die"
	    //thread.sleep(2);
	    // //thread.sleeps the program for 2 seconds
	    System.out.println ("Congratulations");
	    // System.out.printlns Congratulations
	}
	  }
	public static void Endgame() {
	// public staticines function Endgame()
	  System.out.println ("Congratulations!");
	  // System.out.printlns "Congratulations!"
	  //thread.sleep(2);
	  // //thread.sleeps the program for 2 seconds
	  System.out.println ("You have succesfully found your family!");
	  // System.out.printlns "You have succesfully found your family!"
	  //thread.sleep(3);
	  ////thread.sleeps the program for 3 seconds
	  System.out.println ("And without dying too!");
	  // System.out.printlns "And without dying too!"
	  //thread.sleep(2);
	  // //thread.sleeps the program for 2 seconds
	  System.out.println ("I hope....");
	  // System.out.printlns "I hope...."
	  //thread.sleep(2);
	  // //thread.sleeps the program for 2 seconds
	  System.out.println ("Would you like to play again or End?");
	  // System.out.printlns "Would you like to play again or End?"
	  //thread.sleep(3);
	  // //thread.sleeps the program for 3 seconds
	  
	  choice = int(input("Enter 1 to play again or 2 to End."));
	  // creates the variable choice and System.out.printlns "Enter 1 to play again or 2 to End."
	  if (choice == 1){
	  // if the user choice is equal to 1 continue
	    System.out.println ("Good Luck!");
	    // System.out.printlns "Good Luck!"
	    //thread.sleep(2);
	    // //thread.sleeps the program for 2 seconds
	    YourRoom();}
	    // calls the function YourRoom() to go to it
	  else if (choice == 2){
	  // else if the user choice is equal to 2 continue
	    System.out.println ("Ok that's Fine!");
	    // System.out.printlns "Ok that's Fine!"
	    //thread.sleep(2);
	    // //thread.sleeps the program for 2 seconds
	    System.out.println ("Just press the Stopâ—»ï¸ button at the top");
	    // System.out.printlns "Just press the Stopâ—»ï¸ button at the top"
	  }
	  else {
	  // if user choice is anything other than 1 or 2 continue
	    System.out.println ("Come on it's the end of the game.");
	    // System.out.printlns "Come on it's the end of the game."
	    //thread.sleep(2);
	    // //thread.sleeps the program for 2 seconds
	    System.out.println ("And you still don't understand enter 1 or 2. Jeeze.");
	    // System.out.printlns "And you still don't understand enter 1 or 2. Jeeze."
	    //thread.sleep(3);
	    // //thread.sleeps the program for 3 seconds
	    Endgame();
	    // calls the function Endgame() to go to it.
	  }
	}//end Endgame
	  public static void main(String[] args) {
			System.out.println("This game will be based on your choice.");
			// System.out.printlns "This game will be based on your choice."
			System.out.println ("Choose Wisely...");
			// System.out.printlns "Choose Wisely."
			YourRoom();
			// calls the function YourRoom() which untimately starts the whole game
	  }//end main
		}//end class





