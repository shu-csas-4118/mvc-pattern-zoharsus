package MVCAssignment;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Professor Garett = new Professor("Garett", "Chang", "gachang@shu", 5550101);

        Course CSAS4117 = new Course("Software Engineering I", 1, 3, Garett);
        Course CSAS4118 = new Course("Software Engineering II", 2, 3, Garett);
        Course CSAS4119 = new Course("Software Engineering III", 3, 4, Garett);

        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(CSAS4117);
        courses.add(CSAS4118);
        courses.add(CSAS4119);

        Student student = new Student("Zohar", "suslovich", 11161694, "zoharsus@gmail.com",courses );

        StudentView studentView = new StudentView();
        StudentController controller = new StudentController(student, studentView);
        controller.printStudentDetails(); //initial print of student details

        student.removeCourse(CSAS4118);
        student.removeCourse(CSAS4119);
        controller.printStudentDetails(); //prints out an error message because only enrolled in 1 course

        student.addCourse(CSAS4119);
        controller.printStudentDetails(); //prints information again with 2 courses

        CourseView courseView = new CourseView();
        CourseController courseController = new CourseController(CSAS4117, courseView);
        courseController.printCourseDetails(); // Prints out all of the information about a course

    }
}
