package I01.Green_Fox;

public class Student extends Person{

    String previousOrganization;
    int skippedDays;

    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender + " from " + this.previousOrganization + " who skipped " + this.skippedDays);
    }

    public void skipDays(int numberOfDays){
        this.skippedDays += numberOfDays;
    }

    public Student(String name, int age, String gender, String previousOrganization){
        super();
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student(){
        super();
        this.previousOrganization = "Thi School of Life";
        this.skippedDays = 0;

    }

}