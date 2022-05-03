package C10_Teachers_and_students;

public class TeacherAndStudents {
    public static void main(String[] args) {

        Student Joseph = new Student();

        Teacher Tom = new Teacher();

        Joseph.question(Tom);

        Tom.teach(Joseph);

        Joseph.learn();

        Tom.giveAnswer();
    }
}
