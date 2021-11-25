public class Define_basic_info {
    public static void main(String[] args) {
        // Define several things as a variable then print their values
        // Your name as a string
        String name = "Jozef Michalicka";
        // Your age as an integer
        int age = 30;
        // Your height in meters as a double
        float height = (float) (1.77 * 2);
        // Whether you are married or not as a boolean
        boolean married = false;

        System.out.println("Hello, my name is " + name + ", I am " + age + " years old, " + (height / 2) + " meters tall and am I married? " + married);
    }
}
