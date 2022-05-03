package I01.Green_Fox;

import java.util.ArrayList;
import java.util.List;

public class Cohort {

    String name;
    List<Student> students;
    List<Mentor> mentors;

    public void addStudent(Student student){
        this.students.add(student);

    }

    public void addMentor(Mentor mentor){
        this.mentors.add(mentor);

    }

    public void info(){
        System.out.println("The " + this.name + " cohort has " + this.students.size() + " students and "
                + this.mentors.size() + " mentors.");

    }

    public Cohort(String name){
        this.name = name;
        this.mentors = new ArrayList<>();
        this.students = new ArrayList<>();


    }

}
