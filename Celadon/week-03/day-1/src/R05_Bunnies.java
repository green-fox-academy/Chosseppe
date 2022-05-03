public class R05_Bunnies {
    public static void main(String[] args) {
        // We have a number of bunnies and each bunny has two big floppy ears. Write
        // a recursive method (no loops or multiplication) which takes the number of
        // bunnies as its sole parameter and returns the total number of ears
        // the bunnies have. The method should be able to handle invalid input
        // (e.g. negative numbers)
        System.out.println(Bunnies(-10));
        System.out.println(Bunnies(-8));
        System.out.println(Bunnies(-6));
        System.out.println(Bunnies(-4));
        System.out.println(Bunnies(-2));
        System.out.println(Bunnies(2));
        System.out.println(Bunnies(4));
        System.out.println(Bunnies(6));
        System.out.println(Bunnies(8));
        System.out.println(Bunnies(10));
        System.out.println(Bunnies(12));
        System.out.println(Bunnies(0));

    }
    private static int Bunnies(int number){
        if(number > 0){
            number = Bunnies(number - 1) +2;
        }else if(number < 0){
            number = Bunnies(number + 1) -2;
        }else{
            number = 0;
        }
    return number;
    }
}
