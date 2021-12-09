package I01.Green_Fox;

public class Sponsor extends Person{

    String company;
    int hiredStudents;

    public void introduce(){
        System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender + " who represents "
                + this.company + " and hired " + this.hiredStudents + " students so far.");

    }

    public void hire(){
        this.hiredStudents ++;

    }

    public void getGoal(){
        System.out.println("Hire brilliant junior software developers.");

    }

    public Sponsor(String name, int age, String gender, String company){
        super();
        this.company = company;
        this.hiredStudents = 0;

    }

    public Sponsor(){
        super();
        this.company = "Google";
        this.hiredStudents = 0;
    }

}
