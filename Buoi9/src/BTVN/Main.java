package BTVN;

public class Main {
    public static void main(String[] args) {
        CourseManager courseManager = new CourseManager();
        Student hs1 = new Student(1, "Dung");
        Student hs2 = new Student(2, "DungTaManh");
        courseManager.addStudent(hs1);
        courseManager.addStudent(hs2);

        courseManager.registerStudentForCourse(hs1, "Dung");
        courseManager.registerStudentForCourse(hs1, "Math");
        courseManager.registerStudentForCourse(hs1, "Math");
        courseManager.registerStudentForCourse(hs1, "Philosophy");
    }
}
