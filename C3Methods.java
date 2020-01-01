//Chapter3, Methods
import java.util.Scanner;
public class C3Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare data fields
		String player;
		int points = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the player's name: ");
		player = input.nextLine();
		
		//System.out.println("Enter the player points");
		//points = input.nextInt();
		
		//display a message to the user 
		//calls the displayGreeting() method without any arguments
		System.out.println("\nCalling displayGreeting(); method...");
		displayGreeting(); //doesn't pass any arguments
		
		//display a message to the user
		System.out.println("\nYou have " + points + " points");
		System.out.println("\nYou will be earn 500 more points when the earnPoints() method is called");
		
		// display message
		// calls earnPoints() method and passes one argument to the method
		// the method returns an integer which is assigned to the points variable
		System.out.println("\nCalling earnPoints() method...");
		points = earnPoints(points);
		 
		
		//display message
		//calls displayPlayerInfo method and passes two arguments to the method
		 System.out.println("\nCalling displayPlayerInfo() method...");
		 displayPlayerInfo(player, points);
		 
		 input.close();
	}//end main method
	
	//method to display greeting, requires no parameters
	public static void displayGreeting() {
		System.out.println("Welcome to the game program");
	}//end method
	
	//method to calculate points, requires an integer parameters
	public static int earnPoints(int pts) {
		pts += 500;
		return pts;
	}//end method
	
	//method to display points, requires two parameters, one string and one integer
	public static void displayPlayerInfo(String play, int pts) {
		System.out.println("Player: " + play);
		System.out.println("The new points are: " + pts);
	}//end method
}
