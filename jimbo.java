import java.util.Scanner;
public class jimbo
{
   public static void main(String[] args)
   {

Scanner input = new Scanner(System.in);
int[] numbers = new int[10];
boolean[] uniques = new boolean[10];

for(int i = 0; i < 10; i++) {
    System.out.println("Enter ten numbers: ");
    numbers[i] = input.nextInt();
    uniques[i] = true;
    for(int j = 0; j < 10; j++) {
        if(numbers[i] == numbers[j] && i != j) {
            uniques[i] = false;
        }
    }
}




System.out.print("The distinct numbers are: ");
for(int i = 0; i < 10; i++) {
    if(uniques[i]) {
        System.out.println(numbers[i] + ", ");
    }
}


   }
}