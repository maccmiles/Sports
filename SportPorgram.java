/*
/ MacchiaroliM
/ CS2
/ Feb 27 2018
/ Sports Program Main Class
*/
public class SportProgram {
	public static void main (String[]args)
	{
/////////////////CREATE OBJECTS////////////////////
		String sameCals = "";//variable for comparing cals
		Sports s0=new Sports("Skiing",612);//Skiing
		Sports s1=new Sports("Curling",272);//Curling
		Sports s2=new Sports();//Skating (Blank b/c Skating is default)
		Sports s3=new Sports("Hockey",544);//Hockey
		Sports s4=new Sports("Snowboarding",429);//Snowboarding

///////////////// PRINT ////////////////////	
		System.out.println("Sport Activity Tracker\nVersion 1.2\n================\n\n");
		
    	System.out.println("There are " + Sports.sportObjects() + " Sports objects \n");//print number of objects created

		// print properties of the Sports objects
    	System.out.println("Here are their properties: \n");
		Sports [] Sport = {s0, s1, s2, s3, s4};//create array with sports objects for easy printing
		for (int i = 0; i < Sport.length; i++){//loop while i<array
			System.out.println("S" + i + "\n" + Sport[i] + "\n");//print sport based on order
		}

///////////////// Retrieve and adjust variables ////////////////////
		System.out.println("Sport S0 is: " + s0.getActivity());
		System.out.println("S0 is being changed to: \"Downhill Skiing\"");
		s0.setActivity("Downhill Skiing");// change sport
		System.out.println("Sport S0 is now: " + s0.getActivity() + "\n");//verify change

		System.out.println("Doing S0 burns: " + s0.getCalories()+ " calories");
    	System.out.println("S0's calories are being changed to 429 for a " + "slower skiing rate");
		s0.setCalories(429);//change calories
		System.out.println("Sport S0 now burns " + s0.getCalories() + " calories per hour \n");//verify change

///////////////// Compare Calories ////////////////////
    	System.out.println("Sport S3 is " + s3.getActivity());
		if (s0.sameCaloriesExpended(s3)) {//check if calories match
			sameCals = "";//if do, add nothing to string
		}else {
			 sameCals = "not ";//else, insert "not "
		}
		System.out.println("Skiing and hockey will " + sameCals + "burn the same number of calories");       

    	System.out.println("\nSports s4 is " + s4.getActivity()); 
    	if (s0.sameCaloriesExpended(s3)) {//check if calories match
			sameCals = "";//if do, add nothing to string
		}else {
			sameCals = "not ";//else, insert "not "
		}
    	System.out.println("Skiing and snowboarding will " + sameCals + "burn the same number of calories");       
	}
}
