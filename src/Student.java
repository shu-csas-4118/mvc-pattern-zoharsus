import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private int idNumber;
    private String email;
    private ArrayList<Course> courses;

    public Student(String firstName, String lastName, int idNumber, String email, ArrayList<Course> courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.email = email;
        this.courses = courses;
    }

    public Student(){
        this.courses = new ArrayList<>();
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdNumber() {
        return this.idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course){
        if (!this.courses.contains(course))
            this.courses.add(course);
        else
            System.out.println("This Student is already enrolled in this course");
    }

    public void removeCourse(Course course){
        this.courses.remove(course);
    }

}