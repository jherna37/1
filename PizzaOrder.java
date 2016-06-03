

import java.util.Scanner;
import java.text.DecimalFormat;

public class PizzaOrder {
	
   public static void main (String [] args) {
				
		Scanner keyboard = new Scanner (System.in);
      	String input; 
		
		String firstName;					//user's first name
		boolean discount = false;		//flag, true if user is eligible for discount
		int inches;							//size of the pizza
		char crustType;					//code for type of crust
		String crust = "Hand-tossed"; //name of crust
		double cost = 12.99;				//cost of the pizza
		final double TAX_RATE = .08;	//sales tax rate
		double tax;							//amount of tax
		char choice;						//user's choice
		String toppings = "Cheese ";	//list of toppings	
		int numberOfToppings = 0;		//number of toppings
		
		
      	System.out.println("Welcome to Amy Jeans's Pizza");
		System.out.print("Enter your first name:  ");
		firstName = keyboard.nextLine();
		
		//Determine if user is eligible for discount by
		//having the same first name as one of the owners
		//CODE FOR TASK #1 GOES HERE
		
		if (firstName.equalsIgnoreCase("Diane")) 
		{
			discount = true;
		}		
		else if (firstName.equalsIgnoreCase("Mike"))
		{
			discount = true;
		}
		else 
		{
			discount = false;
		}
		
		
		System.out.println("Pizza Size (inches)   Cost");
		System.out.println("        10            $10.99");
		System.out.println("        12            $12.99");
		System.out.println("        14            $14.99");
		System.out.println("        16            $16.99");
		System.out.println("What size pizza would you like?"); 
		System.out.print("10, 12, 14, or 16 (enter the number only): ");
		inches = keyboard.nextInt();
		
		//Set price and size of pizza ordered
		//CODE FOR TASK #2 GOES HERE
		if (inches == 10) 
		{
		cost = 10.99;
		}
		else if (inches == 12)
		{
		cost = 12.99;
		}
		else if (inches == 14)
		{
		cost = 14.99;
		}
		else if(inches == 16)
		{
		cost = 16.99;
		}
		else
		{
		cost = 12.99;
		}
		//Consume the remaining newline character
		keyboard.nextLine();	
		
		System.out.println("What type of crust do you want? ");
		System.out.print("(H)Hand-tossed, (T) Thin-crust, or " + "(D) Deep-dish (enter H, T, or D): ");
		input = keyboard.nextLine();
		crustType = input.charAt(0);
	
		//Set user's crust choice on pizza ordered
		//CODE FOR TASK #3 GOES HERE
		switch (crustType)
		{
			case 'h':
				crust = "Hand-Tossed";
					break;
			case 't':	
				crust = "Thin Crust";
					break;
			case 'd':
				crust = "Deep Dish";
					break;
			case 'H':
				crust = "Hand-Tossed";
					break;
			case 'T':	
				crust = "Thin Crust";
					break;
			case 'D':
				crust = "Deep Dish";
					break;
			default:
				System.out.println("No option chosen, hand-tossed will be selected.");
		}
								
		System.out.println("All pizzas come with cheese."); 
		System.out.println("Additional toppings are $1.25 each.");
		System.out.println("Choose from: pepperoni, sausage, onion, and mushroom");
	
		System.out.print("Do you want Pepperoni?  (Y/N):  ");
		input = keyboard.nextLine();
		choice = input.charAt(0);
		if (choice == 'Y' || choice == 'y')
		{
			numberOfToppings = numberOfToppings + 1;
			toppings = toppings + "Pepperoni ";
		}
   
	   else if (choice == 'N' || choice == 'n')
		{
		numberOfToppings = (numberOfToppings);
		}
		
		System.out.print("Do you want Sausage?  (Y/N):  ");
		input = keyboard.nextLine();
		choice = input.charAt(0);
      	//CODE FOR TASK #4 GOES HERE
      
		if (choice == 'Y' || choice == 'y')
		{
			numberOfToppings = numberOfToppings + 1;
			toppings = toppings + "Sausage ";
		}
		else if (choice == 'N' || choice == 'n')
		{
		numberOfToppings = numberOfToppings;
		}
		
		
		System.out.print("Do you want Onions?  (Y/N):  ");
		input = keyboard.nextLine();
		choice = input.charAt(0);
      	//CODE FOR TASK #4 GOES HERE
			
			if (choice == 'Y' || choice == 'y')
		{
			numberOfToppings = numberOfToppings + 1;
			toppings = toppings + "Onions ";
		}
		else if (choice == 'N' || choice == 'n')
		{
		numberOfToppings = numberOfToppings;
		}

      
		System.out.print("Do you want Mushrooms?  (Y/N):  ");
		input = keyboard.nextLine();
		choice = input.charAt(0);
      	//CODE FOR TASK #4 GOES HERE
			
			if (choice == 'Y' || choice == 'y')
		{
			numberOfToppings = numberOfToppings + 1;
			toppings = toppings + "Mushroom ";
		}
			else if (choice == 'N' || choice == 'n')
			{
			numberOfToppings = numberOfToppings;
			}


		cost = cost + (1.25 * numberOfToppings);
		
		System.out.println();
		System.out.println("Your order is as follows: ");
		System.out.println(inches + " inch pizza");
		System.out.println(crust + " crust");
		System.out.println(toppings);		
		
		//Apply discount if user is elibible
		//CODE FOR TASK #5 GOES HERE
		if (firstName.equalsIgnoreCase("Diane"))
		{
		cost = cost  - 2.00;
			System.out.println("There was a discount of two dollars.");
		}
		else if (firstName.equalsIgnoreCase("Mike"))
		{
		cost = cost  - 2.00;
			System.out.println("There was a discount of two dollars.");
		}
		else
		{
		cost = cost;
		}
		
		DecimalFormat currencyFormat = new DecimalFormat("0.00");
		System.out.println("The cost of your order is: $" + currencyFormat.format(cost));
			
		tax = cost * TAX_RATE;
		System.out.println("The tax is:  $" + currencyFormat.format(tax));
		System.out.println("The total due is:  $" + currencyFormat.format(tax + cost));
		
		System.out.println(firstName + ", your order will be ready for pickup in 30 minutes.");
	}	
}