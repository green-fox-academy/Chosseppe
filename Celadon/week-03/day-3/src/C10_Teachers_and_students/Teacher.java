package C10_Teachers_and_students;

public class Teacher {

    public void teach(Student student){
        student.learn();
    }

    public void giveAnswer(){
        System.out.println("The teacher is answering a question.");
    }
}
