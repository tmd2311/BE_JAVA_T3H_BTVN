public class Employee implements Workable {
  private  String name;
  private  int age;
  private  double salary;

  public Employee(String name, int age, double salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public void displayInfo() {
    System.out.println("Tên: " + name + ", Tuổi: " + age + ", Lương: " + salary);
  }
  @Override
  public void work() {
    System.out.println(name + " Working as an employee");
  }
  public void updateSalary(double luongMoi) throws Exception {
    if (luongMoi < 0) {
      throw new Exception("Salary cannot be negative");
    }
    this.salary = luongMoi;
  }
}
