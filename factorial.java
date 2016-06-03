import java.util.Scanner;
public class factorial
{
   public static void main(String[] args)
   {
      System.out.println("Enter an integer: ");
      Scanner input = new Scanner(System.in);
      int n =input.nextInt();
      factorial(n);
   }
   
   public static int factorial( int n )
      {  
         if(n==1)
         {
            return 1;
         }
         else if(n==0)
         {
            return 0;
         }
         
         return n*factorial(n-1);
      }
} 