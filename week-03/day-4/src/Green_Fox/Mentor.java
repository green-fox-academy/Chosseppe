package I01.Green_Fox;

public class Mentor extends Person{

    String level;

    public void getGoal(){
        System.out.println("Educate brilliant junior software developers.");
    }

    public void introduce(){
        System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender);
    }

    public Mentor(String name, int age, String gender, String level){
        super();
        this.level = level;

    }

    public Mentor() {
        super();
        this.level = "Intermediate";
    }
}
