public class O25_Print_even {
    // Create a program that prints all the even numbers between 0 and 500
    public static void main(String[] args) {
        int i;
        for (i = 0;i <= 500; i ++)
            if (i % 2 == 0 && i > 0)
                System.out.println(i);
    }
}
