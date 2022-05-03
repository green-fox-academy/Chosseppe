public class O09_Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        // Print the Body mass index (BMI) based on these values
        System.out.println("Bmi for person is: " + (massInKg / heightInM / heightInM));
    }
}
