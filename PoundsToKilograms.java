
import java.util.Scanner;

public class PoundsToKilograms {

public static void main(String[] args)
{

Scanner input = new Scanner(System.in); 

System.out.println("Please enter the largest integer value that you would like converted to kilograms:");
System.out.println("The conversion is (pounds, kilograms):");
double kg = 1; 
int max = input.nextInt();

for (int count = max - max; count <= max; count = count + 2)
   { 
   if (max % 2 == 0){
     
      kg = count *.45;
      
      System.out.println(count + ", " + kg);
      }
   else if (max % 2 == 1 ){
      int counttwo;
      counttwo = count + 1;
      kg = counttwo *.45;
     
     
     
      System.out.println(counttwo +  ", " + kg);
      
      }
   else{
   }
     
   }
   
   
}      
    

   }
