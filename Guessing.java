import java.util.Scanner;
 
public class Guessing 
{
   public static void main(String[] args) 
   {
      int guessThis;
      guessThis = (int) (Math.random() * 9 + 1);           
      Scanner keyboard = new Scanner(System.in);
      int guess;
      
      do 
      {
         System.out.print("guess between one and ten: ");
         guess = keyboard.nextInt();
         if (guess == guessThis)
         System.out.println("correct!");
         else if (guess > guessThis)
         System.out.println("too high");
         else if (guess < guessThis)
         System.out.println("too low");
         
       } 
     
    }
}