package tutorialpackage;

public class Assign4FundRaising{

	public static void main(String[] args) {
		
		String[] names = {"Josh", "Clark", "Midoriya", "Deku", "Bakugo", "Shen", "Don", "Don-Don", "Ed", "Eddie"};
		double[] raisedMoney = {78.90, 105, 110.56, 68, 300, 140, 210, 190.99, 200, 199};
		boolean[] returnedForm = {true,false,true,true,true,false,false,true,false,true};
		
		//Step 1
		for(int  i = 0; i < names.length; i++) {
			System.out.println("Name: " + names[i] + " $" + raisedMoney[i] + " Form: " + returnedForm[i]);
		}//end Step 1
		
		//Step 2
		double totalAmt = 0;	//Store total amount raised
		for(int i = 0; i < raisedMoney.length; i++) {
			totalAmt += raisedMoney[i]; //Adds each index to total amount
		}//end for
		double avgRaised = totalAmt / names.length;	//Calculates average amount raised
		
		int bigMoneyCount = 0;	//Tracks how many people raised over $200
		
		System.out.println();
		
		for (int i = 0; i < raisedMoney.length; i++) {	
			//Searching for > $200
			//Counting number of people over $200
			if(raisedMoney[i] > 200) {
				System.out.println(names[i] + " Raised $" + raisedMoney[i]);
				bigMoneyCount++;	//Add 1 to bigMonayCount
			}//end if
		}//end for
		
		System.out.println();
		
		for(int i = 0; i < returnedForm.length; i++) {
			//Searching for people who have not return form
			if(returnedForm[i] == false) {
				System.out.println(names[i] + " has not returned form");	
			}//end if
		}//end for
		
		System.out.println();
		
		System.out.println("Total amount Raised: $" + totalAmt);//Prints out the total money raised
		System.out.println("Average amount Raised: $" + avgRaised);//Prints out the average money raised
		
		double lowestAmt;	//Declare variable for item tracked
		lowestAmt = raisedMoney[0]; //assume first index is item search for
		int nameIndex = 0; //Tracks the index of the person with the lowest amount raised
		for (int i = 0; i < raisedMoney.length; i++) {	//Finds lowest amount raised	
			if(raisedMoney[i] < lowestAmt) {
				lowestAmt = raisedMoney[i];	//Set lowest value
				nameIndex = i;
			}//end if
		}//end for
		
		//Prints out the lowest raised amount
		System.out.println();
		System.out.println("Lowest Amount Raised: $" + lowestAmt 
				+ " by " + names[nameIndex]);
		
		
		
	}//end main

}//end class
