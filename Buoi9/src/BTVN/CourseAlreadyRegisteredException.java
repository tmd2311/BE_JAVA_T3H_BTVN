package BTVN;

public class CourseAlreadyRegisteredException extends Exception {
    private String courseName;
    public CourseAlreadyRegisteredException(String courseName, String message) {
        super(message);
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

}
