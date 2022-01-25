import java.lang.Integer.*;

public class A12_Sum_all_elements {
    // - Create an array variable named `numbers`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Print the sum of the elements of `numbers`
    public static void main(String[] args) {
        int[] numbers = {3,4,5,6,7};

        SumOfNums(numbers);

    }
    private static void SumOfNums(int[] jamal){
        int SumAll=0;
        for(int iterator=0; iterator<jamal.length; iterator++){
            SumAll = Integer.sum(SumAll, jamal[iterator]);
            //System.out.println(jamal[iterator]);
        }
        System.out.println(SumAll);
    }
}
