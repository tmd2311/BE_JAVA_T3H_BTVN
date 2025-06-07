package vn.com.t3h.config;

import java.util.*;

public class DemoCollection {
  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();

    students.add(new Student("Nam", 20));
    students.add(new Student("An", 18));
    students.add(new Student("Linh", 22));

    System.out.println("Trước khi sắp xếp:");
    for (Student s : students) {
      System.out.println(s);
    }

    // Sắp xếp theo thứ tự mặc định (theo compareTo)
    Collections.sort(students);

    // Sắp xếp theo tuổi tăng dần bằng Comparator
    Collections.sort(students, new Comparator<Student>() {
      public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getAge(), s2.getAge());
      }
    });


    Student s1 = students.get(0);
    // Nếu chúng ta muốn xóa một phần tử 'x' từ ArrayList
    students.remove(s1);

    // Nếu chúng ta muốn xóa tất cả các phần tử
    students.clear();
  }
}

class Student implements Comparable<Student> {
  private String name;
  private int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public int getAge() { return age; }

  public String getName() { return name; }

  public void setAge(int age) { this.age = age; }

  public void setName(String name) { this.name = name; }

  // Mặc định sắp xếp theo tên
  @Override
  public int compareTo(Student other) {
    return this.name.compareTo(other.name);
  }

  @Override
  public String toString() {
    return "Student{name='" + name + "', age=" + age + "}";
  }
}
