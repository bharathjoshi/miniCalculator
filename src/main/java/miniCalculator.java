import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class miniCalculator {

    private static final Logger logger = LogManager.getLogger(miniCalculator.class);
    private static final Scanner scanner = new Scanner(System.in);

    public miniCalculator(){
    }
    public static double squareRootFunction(double n){
        logger.info("[INFO]: Input for the Square Root function: " + n);
        logger.info("[INFO]: Output of the Square Root function: " + Math.sqrt(n));
        return Math.sqrt(n);
    }

    public static double LogFunction(double n)
    {
        logger.info("[INFO]: Input for the Natural Logarithm function: " + n);
        logger.info("[INFO]: Output of the Natural Logarithm function: " + Math.log(n));
        return Math.log(n);
    }

    public static double powerFunction(double n1, double n2)
    {
        logger.info("[INFO]: Input for the power function: " + n1 + " , "+ n2);
        if(n1==0 && n2==0)
        {
            logger.info("[INFO]: Output of the power function: " + Double.NaN);
            return Double.NaN;
        }

        logger.info("[INFO]: Output of the power function: " + Math.pow(n1, n2));
        return Math.pow(n1, n2);
    }

    public static double factorialFunction(double n)
    {

        logger.info("[INFO]: Input for the Factorial function: " + n);
        double res=1;

        if(n < 0)
            return Double.NaN;

        for(int i=2;i<n+1;i++){
            res*=i;
        }
        logger.info("[INFO]: Output of the Factorial function: "+ res);
        return res;
    }

    public static void main(String[] args) {

        int option;
        double num1, num2;
        while(true){
            System.out.println("-----------------------\n");
            System.out.println("Please choose one of the below:\n1. For Square root\n2. For Factorial\n3. For Natural Logarithm\n4. For Power Function\n5. Exit");
            try{
                option = scanner.nextInt();
            } catch (InputMismatchException error) {
                logger.error("[ERROR]: Value type mismatch. Other type input instead of integer, Please try again.");
                System.out.print("Only Decimal input is allowed");
                return;
            }
            switch (option){

                case 1:
                    System.out.print("\nPlease enter a number for square root: ");
                    num1 = scanner.nextDouble();
                    if(num1 < 0)
                    {
                        System.out.println("please enter positive number\n");
                        logger.error("[ERROR]: Square root is defined only for Positive numbers");
                    }
                    else
                        System.out.println("The Square root of " + num1 + " is: " + squareRootFunction(num1));
                    break;

                case 2:
                    System.out.print("\nPlease enter a number for factorial: ");
                    num1 = scanner.nextInt();
                    if (num1 < 0)
                    {
                        System.out.println("Please enter positive number\n");
                        logger.error("[ERROR]: Factorial is defined only for Positive numbers");
                        break;
                    }
                    else
                        System.out.println("The Factorial of " + num1 + " is: " + factorialFunction(num1));
                    break;

                case 3:

                    System.out.print("\nPlease enter number: ");
                    num1 = scanner.nextDouble();
                    if (num1 <= 0) {
                        System.out.println("Please enter positive number\n");
                        logger.error("[ERROR]: Logarithm is defined only for Positive numbers");
                    }
                    else {
                        System.out.println("The Natural logarithm of " + num1 + " is: " + LogFunction(num1));
                    }
                    break;

                case 4:
                    System.out.print("\nPlease enter base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("\nPlease enter exponent: ");
                    num2 = scanner.nextDouble();
                    System.out.println(num1 + " to the power " + num2 + " is: " + powerFunction(num1, num2));
                    break;
                case 5:
                    System.out.println("Exited.");
                    return;
            }
        }
    }



}