public class A11_Swap_elements {
    // - Create an array variable named `orders`
    //   with the following content: `["first", "second", "third"]`
    // - Swap the first and the third element of `orders`
    public static void main(String[] args) {
        String[] orders = {"first", "second", "third"};
        SwapFirstWithLast(orders);

        //for(int iterator=0; iterator<orders.length; iterator++){
        //    System.out.println(orders[iterator]);
        //}
    }
    private static void SwapFirstWithLast(String[] fizibablech){
        String temporary = fizibablech[fizibablech.length - 1];
        fizibablech[fizibablech.length - 1] = fizibablech[0];
        fizibablech[0] = temporary;
    }
}
