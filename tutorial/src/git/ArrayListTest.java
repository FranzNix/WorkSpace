package git;
import java.util.ArrayList;
public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Integer> listOfInts = new ArrayList<>();
		//Useful methods of ArrayList
		listOfInts.add(98);//Adding to ArrayLists
		listOfInts.add(55);//Adding to ArrayLists
		listOfInts.add(1, 80);//Insert to index 1 in this case
		listOfInts.remove(0);//Remove item at first index
		listOfInts.get(0);//Returns item at index 0
		listOfInts.size();//Returns size of ArrayLists
		
		//Print ArrayLists
		listOfInts.add(98);
		listOfInts.add(24);
		
		for(int i = 0; i < listOfInts.size(); i++) {
			System.out.println(listOfInts.get(i));
		}//end for
		
		listOfInts.remove(listOfInts.size() -1);//Remove last element
		//Print new ArrayLists
		for(int i = 0; i < listOfInts.size(); i++) {
			System.out.println(listOfInts.get(i));
			}//end for
		
		System.out.println(listOfInts.indexOf(98));
		System.out.println(listOfInts.indexOf(99));
		
		
	}//end main

}//end class
