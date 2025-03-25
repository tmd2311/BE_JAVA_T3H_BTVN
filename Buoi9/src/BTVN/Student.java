package BTVN;

import java.util.Arrays;

public class Student {
    private int id;
    private String name;
    private String[] course = new String[10];
    private static final String[] VALID_COURSES = {"Math", "English", "History", "Science"};

    private void registerCourse(String courseName) throws CourseAlreadyRegisteredException{
        if(!Arrays.asList(VALID_COURSES).contains(courseName)) {
            throw new Exception("")
        }
    }

}
