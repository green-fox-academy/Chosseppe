import java.util.Scanner;
import java.lang.Integer;

public class F05_Sum {
    // Create the usual class wrapper and main method on your own

    // Write a function called `sum()` that returns the sum of numbers from zero to the given parameter
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number that you want to sum from zero to :");
        int CountTo=scanner.nextInt();

        sum(CountTo);
    }

    private static void sum(int number){
        int summ=0;
        for(int count=0;count<=number;count++)
            summ=Integer.sum(summ,count);
        System.out.println("Sum of numbers between 0 and "+number+" is: "+summ);
    }
}
