import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number to check:");
        int number = scanner.nextInt();

        if (isArmstrongNumber(number)){
            System.out.println(number + " is an Armstrong number");
        }
        else {
            System.out.println(number + " is not an Armstrong number");
        }

    }


    private static boolean isArmstrongNumber(int inputNumber){
        int number = inputNumber;
        int sum = 0;
        List<Integer> reversedList = new ArrayList<>();
        List<Integer> doubledList = new ArrayList<>();

        while(number > 0){
            reversedList.add(number % 10);
            number = number / 10;
        }
        for(Integer numb: reversedList){
            doubledList.add((int) Math.pow(numb, reversedList.size()));
        }
        for(int numb: doubledList){
            sum += numb;
        }

        return inputNumber == sum;
    }
}