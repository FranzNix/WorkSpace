package tutorialpackage;

public class Employees {

	public static void main(String[] args) {
		String[] employeesName = {"Greg", "George", "Jill", "John", "Basil" };
		int[] wage = {15, 16, 23, 15, 22};
		int[] hoursWorked = new int[5];
		
		hoursWorked[0] = 20;
		hoursWorked[1] = 30;
		hoursWorked[2] = 15;
		hoursWorked[3] = 60;
		hoursWorked[4] = 38;
		
		for(int i = 0; i < wage.length; i++) {//Name and wage
			System.out.println("i: " + i + " Name :" + employeesName[i] + "\twage: " + wage[i] );
		}//end for
		
		System.out.println();
		
		for(int i = 0; i < wage.length; i++) {//Week's pay
			System.out.println("Name: " + employeesName[i] + "\tpay: " + wage[i] * hoursWorked[i]);
		}//end for
		
		System.out.println();
		
		for(int i = 0; i < wage.length; i++) {//Linear search for wage over 20
			if(wage[i] > 20) {
				System.out.println("FIRE Name: " + employeesName[i]);
				employeesName[i] = "";
				wage[i] = 0;
				}//end if
		}//end for
		
		System.out.println();
		
		for(int i = 0; i < wage.length; i++) {//Name and wage
			System.out.println("i: " + i + " Name: " + employeesName[i] + "\twage: " + wage[i] );
			}
	}//end main

}//end class

