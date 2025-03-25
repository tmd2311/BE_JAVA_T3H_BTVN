package BTVN;

import java.util.Arrays;

public class CourseManager {
    private Student[] students;
    private int numberCurrentStudent;
    public CourseManager() {
        students = new Student[10];
        numberCurrentStudent = 0;
    }
    public void addStudent(Student student) {
        if (existsStudent(student)) return;
        if(numberCurrentStudent == students.length) {
            students = Arrays.copyOf(students, students.length * 2);
            students[numberCurrentStudent++] = student;
            return;
        }
        students[numberCurrentStudent++] = student;
    }

    private boolean existsStudent(Student student) {
        for (int i = 0; i < numberCurrentStudent; i++) {
           if(student.getId() == students[i].getId()) {
               System.out.println("Student already exists");
               return true;
           }
        }
        return false;
    }

    public void registerStudentForCourse(Student student, String courseName) {
        try {
            student.registerCourse(courseName);
            System.out.println("Dang ky thanh cong " + courseName + " for " + student.getName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Hoan thanh dang ky");
        }
    }

}
