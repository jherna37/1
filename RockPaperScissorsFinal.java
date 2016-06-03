
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsFinal
{
	public static void main(String[] args)
	{
		
      Random randomNumberGenerator = new Random();
		
      int randomNumber = randomNumberGenerator.nextInt(3);
    
    
      String[] choiceList = new String[]{"scissors", "rock", "paper"};
      String computerChoice = choiceList[randomNumber];
		
		String scissors = "0";
		String rock = "1";
		String paper = "2";
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter 0 (scissors), 1 (rock) or 2 (paper): ");
		
      int userInput = input.nextInt();
		   String userChoice = "";
		if (userInput == 0){
			userChoice = scissors;}
		
		if (userInput == 1){
			userChoice = rock;}
		
		if (userInput == 2){
			userChoice = paper;}

    
		
  

    System.out.println("You entered " + userChoice);
    System.out.println("The computer chose " + computerChoice);

  

	if (randomNumber == 0) {
      if (userInput == 0){
	System.out.println("It's a tie!");
		}if (userInput == 1){
	System.out.println("You won!");}
		
		if (userInput == 2){
	System.out.println("You lose!");}
		}
	
	
	
    if (  randomNumber == 1) {
      if (userInput == 1){
	System.out.println("It's a tie!");
		} if (userInput == 2){
	System.out.println("You won!");}
		 if (userInput == 0){
	System.out.println("You lose!");}
		}


	if (randomNumber == 2) {
      if (userInput == 2){
	System.out.println("It's a tie!");
		} if (userInput == 0){
	System.out.println("You won!");}
		if (userInput == 1){
	System.out.println("You lose!");}
		}
   
		
		
     
	}
}
