package C10_Teachers_and_students;

public class Student {
    String student = new String();

    public void learn(){
        System.out.println("The student is actually learning.");
    }

    public void question(Teacher teacher){
        teacher.giveAnswer();
    }
}
