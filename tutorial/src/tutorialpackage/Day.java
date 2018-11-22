package tutorialpackage;
public class Day
{
	public Day(int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		Day birthday = new Day(1951, 5, 26);
		Day lastDay = new Day(2012, 7, 23);
		int daysAlive = lastDay.daysFrom(birthday);
		System.out.println(daysAlive);
	}
}

