import java.util.Scanner;

public class Identical 
{

    public static void main(String[] args) 
    {
        Scanner jimbo = new Scanner (System.in);
        
        System.out.print("Enter list length: ");
        
        int[] intArray = new int[jimbo.nextInt()];
        System.out.print("Enter list 1: ");
        for (int index = 0; index < intArray.length; index++) 
            
            intArray[index] = jimbo.nextInt();

        
        Scanner jimbo1 = new Scanner (System.in);
        
        System.out.print("Enter list length: ");
       
            
        int[] intArray1 = new int[jimbo1.nextInt()];
        System.out.print("Enter list 2: ");
        
        for (int index = 0; index < intArray1.length; index++) 
            
            intArray1[index] = jimbo1.nextInt();
       
        
     
            
         if (intArray.equals(intArray1))
            System.out.print("The lists are identical.");
         else
            System.out.print("The lists are not identical.");


         
        
        
    }
}
