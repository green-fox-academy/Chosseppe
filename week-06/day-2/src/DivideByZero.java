import java.util.Scanner;

public class DivideByZero {



    public static void main(String[] args) {

        int divided = 10;

        System.out.println("Enter number for division:");
        Scanner scanner = new Scanner(System.in);
        int divisor = scanner.nextInt();

        System.out.println(divideNumber(divided, divisor));
    }
    // Create a function that divides number 10
    // by a number that's passed as a paramater and prints the result.
    // It should print "fail" if the parameter is 0

    private static Object divideNumber(int dividedNumber, int divisorNumber){
        try{
            return (dividedNumber / divisorNumber);
        }catch (ArithmeticException e){
            return "Can't divide with zero!";
        }
    }
}
