package tutorialpackage;
import java.io.*;
import java.util.*;

//interface - is a class with all abstract methods, no data members
public class Superhero implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;

	Superhero()
	{
	}

	public void display()
	{
		System.out.println( name );
	}

	public static void main( String args[] )
	{		
		ArrayList array = new ArrayList();
		Superhero s = new Superhero();
		s.name = "Batman";
		array.add( s);

		Superhero s2 = new Superhero();
		s2.name = "Superman";
		array.add(s2);

		//write the list to the file
		System.out.println("Threre are now " + array.size() + " superheros");
		displaySuperheros(array);

		//clear the list
		writeSuperHerosToFile(array);
		array.clear();
		System.out.println("Threre are now " + array.size() + " superheros");
		
		//read the list backin
		array = readSuperHerosFromFile();
		System.out.println("Threre are now " + array.size() + " superheros");
		displaySuperheros(array);

	}

	private static void displaySuperheros( ArrayList superheros )
	{
		for(int i = 0; i < superheros.size(); i++ )
		{
			Superhero s = (Superhero)superheros.get(i);
			s.display();
		}
	}

	private static void writeSuperHerosToFile(ArrayList superHeros)
	{
		File myFile = new File("superheroes.dat");
		try
		{
			FileOutputStream fileOutputstream = new FileOutputStream( myFile );
			ObjectOutputStream objectOutputStream = new ObjectOutputStream (fileOutputstream);
			objectOutputStream.writeObject( superHeros );
		}
		catch (FileNotFoundException e)
		{
			System.err.println("could not find the file");
		}
		catch (IOException e)
		{
			System.err.println("could not create teh objectOutputStream");
		}
	}

	private static ArrayList readSuperHerosFromFile()
	{
		ArrayList superheros = null;

		File myFile = new File("superheroes.dat");
		try
		{
			FileInputStream fileInputstream = new FileInputStream( myFile );
			ObjectInputStream objectInputStream = new ObjectInputStream (fileInputstream);
			superheros = (ArrayList)objectInputStream.readObject();
			System.out.println( "object read from file" );
			System.out.println(superheros.size());
		}
		catch (FileNotFoundException e)
		{
			System.err.println("could not find the file");
		}
		catch (IOException e)
		{
			System.err.println("could not create teh objectOutputStream");
		}
		catch (ClassNotFoundException e)
		{
			System.err.println("that file did not contain an ArrayList");
		}

		return superheros;
	}



    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
}

	    	
	    }
	       
