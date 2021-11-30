public class O12_Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // For example: if the 3 sides are 10, 10, and 10, then you program should
        // produce the following output:
        //
        // Surface Area: 600
        // Volume: 1000
        int a = 10;
        int surface = (a * a) * 6;
        int volume = a * a * a;

        System.out.println("Surface Area: " + surface);
        System.out.println("Volume: " + volume);
    }
}
