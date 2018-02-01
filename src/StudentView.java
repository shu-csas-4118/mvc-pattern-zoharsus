import java.util.IllformedLocaleException;

public class StudentView {
    private Student student;


    public StudentView(Student student) {
        this.student = student;
    }

    public StudentView(){

    }
    public void printStudentDetails(Student student) {
        this.student = student;
        printStudentDetails();
    }

    public void setStudentDetails(Student student) {

    }

    public void printStudentDetails() {
        if (this.student == null) throw new IllegalArgumentException("student");
        if (this.student.getCourses().size() < 2) {
            System.out.println("Student must be registered in 2 or more courses");
        }
        else {
            System.out.println("Student's first name is " + this.student.getFirstName());
            System.out.println("Student's last name is " + this.student.getLastName());
            System.out.println("Student's id number is " + this.student.getIdNumber());
            System.out.println("Student's email address is " + this.student.getEmail());
            System.out.println("Student's list of courses is: ");
            for (Course course : this.student.getCourses()) {
                System.out.println(course.getCourseName() + " Taught by " + course.getProfessor().getFirstName() + " " + course.getProfessor().getLastName());
            }
            System.out.println();
        }
    }
}