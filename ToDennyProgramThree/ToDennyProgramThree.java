//Denny To
//CSCI 1301
//Program Three
package ToDennyProgramThree;
import java.util.Scanner;
public class ToDennyProgramThree {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" }; //array for days is created with elements in indices
		String[] entrees = new String [5]; //a new string array of size 5, indices 0 to 4, is created for entrees
		double[] prices = new double [5]; //a new double array of size 5, indices 0 to 4, is created for prices
		int i;
		int index = 0;
		
		for (i = 0; i < 5; i++)
		{
			System.out.print("What is " + days[i] + "'s entree? ");
			entrees[i] = sc1.nextLine();
		}
		
		System.out.println();

		for (i = 0; i < 5; i++)
		{
			System.out.print("What is the price of the " + days[i] + "'s "  + "entree? ");
			prices[i] = sc1.nextDouble();
		}
		
		System.out.println();
		
		double maxPrice;
		maxPrice = prices[0];
		
		for (i = 0; i < prices.length; ++i) {
			if (prices[i] > maxPrice) {
				maxPrice = prices[i];
				index = i;
			}
			
		}
		
		System.out.println("The highest priced item is " + entrees[index] + " at $" + maxPrice);
		
		System.out.println();
		
		String mealItem;
		System.out.print("What are you interested in eating? ");
		mealItem = sc2.nextLine();
		
		System.out.println();
		
		System.out.println("You entered " + mealItem);
		
		for (i = 0; i < 5; i++)
		{
			if ( mealItem.equalsIgnoreCase(entrees[i]) ) System.out.println("The " + entrees[i] 
					+ " is available on " + days[i] + " and its price is $" 
					+ prices[i]);
		}
		
		
		
	}

}
