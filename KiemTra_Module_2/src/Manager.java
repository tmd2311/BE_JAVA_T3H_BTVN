public class Manager extends Employee {
  private String department;
  public Manager(String name, int age, double salary, String department) {
    super(name, age, salary);
    this.department = department;
  }
  @Override
  public void displayInfo() {
    super.displayInfo();
    System.out.println("Phòng ban: " + department);
  }

  @Override
  public void work() {
    System.out.println(getName() + " Managing department");
  }

  public String getDepartment() {
    return department;
  }
}
