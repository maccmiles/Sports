
public class SportProgram {
	private String activity;//name of sport
	private int calories;//calories burned per hour
	private static int sportObjects;//keep track of objects created

	public void Sport()
	{
		activity = "Skating";//set name of activity
		calories = 392;//set calories burned
	}
	public void Sport(String act, int cal)
	{
		activity = act;//set name of activity
		calories = cal;//set calories burned
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
	public boolean sameCaloriesExpended(int a, int b)
	{
		if(a == b) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int sportObjects()
	{
		return sportObjects;
	}
}
