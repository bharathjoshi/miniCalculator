import java.lang.Math;
import java.util.Scanner;

public class miniCalculator {
    public static double sqrt(int n){
        return Math.sqrt(n);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please select one of the below operations\nPress 1 for Square root function\nPress 2 for Factorial function\nPress 3 for Natural logarithm\nPress 4 for Power function\nPress 0 for exit\n");
            int input = scanner.nextInt();
            switch (input){
                case 1:
                    System.out.println("Enter a number for sqrt");
                    int num = scanner.nextInt();
                    System.out.println("\nThe sqrt of "+num+" is: "+sqrt(num));
                case 5:
                    return;
            }
        }
    }
}