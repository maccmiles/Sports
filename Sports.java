/*
/ MacchiaroliM
/ CS2
/ Feb 27 2018
/ Sports Program Sports Class
*/
public class Sports {
	private String activity;//name of sport
	private int calories;//calories burned per hour
	private static int sportObjects;//keep track of objects created

	public Sports()
	{
		activity = "Skating";//set name of activity
		calories = 392;//set calories burned
		sportObjects++;//increment object counter
	}
	public Sports(String act, int cal)
	{
		activity = act;//set name of activity
		calories = cal;//set calories burned
		sportObjects++;// increment object counter
	}
	public void setActivity(String act)
	{
		activity = act;//set activity
	}
	public void setCalories(int cal)
	{
		calories = cal;//set calories
	}
	public String getActivity()
	{
		return activity;//get activity
	}
	public int getCalories()
	{
		return calories;//get calories
	}
	public String toString()
	{
		return "Activity: " + activity + "\n" + "Calories: " + calories + "\n";//return string
	}
	public boolean sameCaloriesExpended(Sports compare)
	{
			return calories==compare.getCalories();//return true if Calories are the same
	}
	public static int sportObjects()
	{
		return sportObjects;
	}
}
