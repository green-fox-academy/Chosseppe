import java.util.Scanner;

public class F06_Factorial {
    //  Create the usual class wrapper and main method on your own

    // - Create a function called `calculateFactorial()`
    //   that returns the factorial of its input
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter number which will be converted to factorial: ");
        int Input=scanner.nextInt();

        calculateFactorial(Input);
    }

    private static void calculateFactorial(int number){
        long factor=1;
        for(int iterat=1;iterat<=number;iterat++)
            factor*=iterat;

        System.out.println(factor);


    }
}
