import java.util.Scanner;
public class O27_Count_from_to {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number:");
        int Input = scanner.nextInt();
        System.out.print("Enter second number:");
        int Input_2 = scanner.nextInt();

        if (Input > Input_2)
            System.out.println("The second number should be bigger");
        else
            for (int i = Input; i < Input_2; i ++)
                System.out.println(i);
    }
}
