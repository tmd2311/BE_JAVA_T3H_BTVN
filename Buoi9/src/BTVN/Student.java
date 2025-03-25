package BTVN;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String[] course;
    private int count;
    public Student(){
        course = new String[10];
        count = 0;
    }
    public Student(int id, String name){
        this.id = id;
        this.name = name;
        this.course = new String[10];
        count = 0;
    }
    private static final String[] VALID_COURSES = {"Math", "English", "History", "Science"};

    public void registerCourse(String courseName) throws Exception {
        if(!Arrays.asList(VALID_COURSES).contains(courseName)) {
            throw new Exception("Khong co mon hoc nay");
        }
        checkExist(courseName);
        course[count++] = courseName;
    }

    private void checkExist(String courseName) throws CourseAlreadyRegisteredException {
        for(int i = 0; i < count; i++) {
            if (courseName.toLowerCase().equals(course[i].toLowerCase())) {
                throw new CourseAlreadyRegisteredException(courseName, "Ban da dang ky: " + courseName);
            }
        }
    }

    public void inputInfo(int id){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten hoc sinh: ");
    }

    public void showInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println(" Danh sach Courses: ");
        for(int i = 0; i < count; i++) {
            System.out.println("    - "+course[i]);
        }
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
