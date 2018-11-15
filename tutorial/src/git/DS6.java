package git;
import java.util.ArrayList;
import java.util.Scanner;
public class DS6 {

	public static void main(String[] args) {
		ArrayList<String> allSongs = new ArrayList<String>();
		ArrayList<String> artists = new ArrayList<>();
		ArrayList<String> partyPlaylist = new ArrayList<>();
		
		allSongs.add("Thank U, Next");
		artists.add("Ariana Grande");
		
		allSongs.add("Happier");
		artists.add("Marshmello");
		
		allSongs.add("Without Me");
		artists.add("Halsey");
		
		allSongs.add("FRIENDS");
		artists.add("Marshmello");
		
		//Prints Library of all songs
		for(int i = 0; i < allSongs.size(); i++) {//Prints all songs
			System.out.println(i + " " + allSongs.get(i) + " " + artists.get(i));
		}//end for
		
		boolean flag = true; 	
		do {
		System.out.println();
		System.out.println("1. Add to Library \n"
									+ "2. Delete from Library \n"
									+ "3. Add to Party Playlist \n"
									+ "4. Exit");
		System.out.println();
	
		Scanner input = new Scanner(System.in);
		int choice1 = input.nextInt();	
		
		switch(choice1) {
		case 1:
			input.nextLine();
			System.out.print("Enter Song Title: ");
			allSongs.add(input.nextLine());
			System.out.print("Enter Artist: ");
			artists.add(input.nextLine());
			System.out.println();
			break;
			
		case 2:
			System.out.print("Enter Song Number to Delete: ");
			int delete = input.nextInt();
			allSongs.remove(delete);
			artists.remove(delete);
			System.out.println();
			break;
			
		case 3:
			System.out.println("Enter song number to add to Party Playlist: ");
			partyPlaylist.add(allSongs.get(input.nextInt()));
			break;
			
		case 4:
			System.out.println("Bye");
			flag = false;
			break;
			
		default:
			System.out.println("Invalid option");
		}//end switch

		for(int i = 0; i < allSongs.size(); i++) {//Prints all songs
			System.out.println(i + " " + allSongs.get(i) + " " + artists.get(i));
		}//end for
		}while(flag);


	}//end main

}//end class
