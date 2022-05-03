import static java.lang.Math.pow;

public class R03_Power {
    public static void main(String[] args) {
        // Given base and n that are both 1 or more, write a recursive method (no loops)
        // which returns the value of base to the n-th power, so powerN(3, 2) is 9 (3 squared).

        System.out.println(powerN(3, 1));//3
        System.out.println(powerN(3, 2));//9
        System.out.println(powerN(3, 3));//27
        System.out.println(powerN(3, 4));//81
        System.out.println(powerN(3, 5));//243
        System.out.println(powerN(3, 6));//729
        System.out.println(powerN(3, 7));//2187
        System.out.println(powerN(3, 8));//6561
        System.out.println(powerN(3, 9));//19683
        System.out.println(powerN(3, 10));//59049
    }

    private static int powerN(int num1, int num2){
        if(num1 >= 1 && num2 > 1){
            return num1 * powerN(num1, num2 - 1);
        }else{
            return num1;
        }
    }
}
