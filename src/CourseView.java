public class CourseView {

    private Course course;

    public CourseView(Course course) {
        this.course = course;
    }

    public CourseView(){

    }

    public void printCourseDetails(Course course) {
        this.course = course;
        printCourseDetails();
    }

    public void setStudentDetails(Student student) {

    }

    public void printCourseDetails() {
        if (this.course == null) throw new IllegalArgumentException("course");

        System.out.println("Course name is " + this.course.getCourseName());
        System.out.println("Course number is " + this.course.getCourseNumber());
        System.out.println("Amount of credits is " + this.course.getCredits());
        System.out.println("Professor teaching is " + this.course.getProfessor().getFirstName() + " " + this.course.getProfessor().getLastName());
        System.out.println();
    }
}
