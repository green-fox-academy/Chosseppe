public class R01_Number_adder {
    public static void main(String[] args) {
        // Write a recursive function that takes one parameter: n and returns
        // the sum of numbers (integers) from 1 to n. The function should
        // return 0 for inputs less than 1.
        System.out.println(sum(5));

    }
    private static int sum(int input){
        if(input <= 0){
            return 0;
        }else {
            return input + sum(input - 1);
        }
    }
}
