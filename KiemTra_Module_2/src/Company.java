import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Company {
  private List<Employee> ListEmployee = new ArrayList<Employee>();
  private Map<String, Double> salaryMap = new HashMap<String, Double>();
  private Set<String> deparments = new HashSet<String>();

  public Company() {
    addEmployee(new Employee("Dung", 20, 5000));
    addEmployee(new Manager("Hung", 20, 5000, "Sales"));
    addEmployee(new Employee("Hoang", 20, 5500));
  }

  public void addEmployee(Employee e) {
    this.ListEmployee.add(e);
    salaryMap.put(e.getName(), e.getSalary());
    if (e instanceof  Manager) {
      deparments.add(((Manager) e).getDepartment());
    }
  }
  public void displayInfo() {
    for (Employee e : ListEmployee) {
      e.displayInfo();
    }
  }
  public void updateSalary(Employee employee, double salary) {
    try {
      employee.setSalary(salary);
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
    salaryMap.put(employee.getName(), salary);
  }
  public double getSalary(String name) {
    return salaryMap.get(name);
  }
  public void adDeparment(String deparment) {
    this.deparments.add(deparment);
  }
  public void displayDeparments() {
    for (String deparment : deparments) {
      System.out.println(" "+deparment);
    }
  }

  public void sortBySalary() {
    ListEmployee.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
    displayInfo();
  }
  public void searchByName(String name) {
    ListEmployee.stream().filter((e) -> e.getName().equals(name)).findFirst().ifPresent((e) -> {e.displayInfo();});
  }
  public List<Employee> getEmployees() {
    return ListEmployee;
  }


}
