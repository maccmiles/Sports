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
///LA5      - to be fixed
	public abstract double computeCalories();//make abstract
	public int compareTo (Sports s) {//compare calories
		return calories;//todo: edit
}
/////////////////
	public class TeamSport {
		private int players;//# of players
		private int time;//# of time
		public TeamSport() {
			activity = "Ice Hockey";//set name of activity
			calories = 544;//set calories burned
			players = 6;//set # of players
			time = 60; //set time
			sportObjects++;// increment object counter
		}
		public TeamSport(String act, int cal, int pla, int tim) {
			activity = act;//activity
			calories = cal;//calories
			players = pla;//players
			time = tim;//time
			sportObjects++;//object counter
		}
		public void setPlayers(int pla)
		{
			players = pla;//set Players
		}
		public void setTime(int tim)
		{
			time = tim;//set Time
		}
		public int getPlayers()
		{
			return players;//return players
		}
		public int getTime()
		{
			return time;//return time
		}
		public String toString()
		{
			return "Activity: " + activity + "\n" + "Calories: " + calories + "\n" + "Players: " + players + "\n" + "Time: " + time + "\n";//return string
		}
		public boolean equals (Object o) {
			return false; // TODO fill
		}
		public double computeCalories(){
			return 15.2;// TODO fill
		//	calories = (time + overtime)*calories /60
		//	where overtime = rand#(0-5) and each overtime is 5min
		}
	}
	public class IndividualSport {
		private int enjoyability;// 1=chore 2=indiff 3=love
		public IndividualSport() {
			enjoyability = 1; // default - Chore
			sportObjects++;// increment object counter
		}
		public IndividualSport(int enjoy) {
			enjoyability = enjoy;
			sportObjects++;//object counter
		}
		public void setEnjoyability(int enjoy) {
			enjoyability = enjoy;//update enjoyability
		}
		public int getEnjoyability() {
			return enjoyability;//return enjoyability
		}
		public String toString() {
			return "Activity: " + activity + "\n" + "Calories: " + calories + "\n" + "Enjoyability: " + enjoyability + "\n";
		}
		public double computeCalories() {
			return 14.2;//TODO populate
			//calories = min played * cals / 60
			//where time is based on enjoy (1-15min 2-halfhr 3-hr)
		}
	}
}

