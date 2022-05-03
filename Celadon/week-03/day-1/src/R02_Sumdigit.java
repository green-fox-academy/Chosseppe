public class R02_Sumdigit {
    public static void main(String[] args) {
        // Given a non-negative integer n, return the sum of its digits recursively
        // (without loops).
        //
        // Hint
        //
        // Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
        //
        // Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).

        System.out.println(Sum_digit(126));

    }

    private static int Sum_digit(int number){
        if(number/10 != 0) {
            number = number/10 + number % 10;
            return Sum_digit(number);
        }else{
            return number;
        }
    }
}
