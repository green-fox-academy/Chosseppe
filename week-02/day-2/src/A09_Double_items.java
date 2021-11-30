public class A09_Double_items {
    // - Create an array variable named `numberList`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Double all the values in the array
    public static void main(String[] args) {
        int[] numberList = {3,4,5,6,7};

        for (int iterator = 0; iterator < numberList.length; iterator++){
            numberList[iterator] *= 2;
            System.out.println(numberList[iterator]);
        }
    }
}
