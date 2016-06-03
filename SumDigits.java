
import java.util.Scanner;

public class SumDigits {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
       
       System.out.print("Enter an integer between 100 and 999: ");

      int number = input.nextInt();

             
      int hundreds = number / 100 ;
      
      int tens = (number % 100)/ 10 ;
       
      int ones = number % 10;
       
      int sum = (hundreds + tens + ones);
       
       System.out.println("The sum of your digits is: " + sum );
       
       
   }
}