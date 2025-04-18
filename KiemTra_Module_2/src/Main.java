import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static void main(String[] args) {
    Company company = new Company();
    Scanner sc = new Scanner(System.in);
    int n ;
    do {
      System.out.println("\n--- Company Menu ---");
      System.out.println("1. Thêm nhân viên");
      System.out.println("2. Hiển thị tất cả nhân viên");
      System.out.println("3. Cập nhật lương nhân viên");
      System.out.println("4. Tìm lương theo tên");
      System.out.println("5. Thêm phòng ban");
      System.out.println("6. Hiển thị phòng ban");
      System.out.println("7. Sắp xếp nhân viên theo lương giảm dần");
      System.out.println("8. Tìm nhân viên theo tên");
      System.out.println("9. Thoát");
      System.out.print("Lựa chọn: ");
      n = sc.nextInt();
      sc.nextLine(); // Clear buffer

      switch (n) {
        case 1 : {
          System.out.print("Tên: ");
          String name = sc.nextLine();
          System.out.print("Tuổi: ");
          int age = sc.nextInt();
          System.out.print("Lương: ");
          double salary = sc.nextDouble();
          sc.nextLine();
          System.out.print("Có phải là Manager? (y/n): ");
          String isManager = sc.nextLine();
          if (isManager.equalsIgnoreCase("y")) {
            System.out.print("Phòng ban: ");
            String dept = sc.nextLine();

            company.addEmployee(new Manager(name, age, salary, dept));
          } else {
            company.addEmployee(new Employee(name, age, salary));
          }
          break;
        }
        case 2 : company.displayInfo(); break;
        case 3 : {
          System.out.print("Nhập tên nhân viên cần cập nhật lương: ");
          String name = sc.nextLine();
          for (Employee e : company.getEmployees()) {
            if (e.getName().equalsIgnoreCase(name)) {
              System.out.print("Nhập lương mới: ");
              double newSalary = sc.nextDouble();
              try {
                company.updateSalary(e, newSalary);
                System.out.println("Cập nhật thành công.");
              } catch (IllegalArgumentException ex) {
                System.out.println("Lỗi: " + ex.getMessage());
              }
              break;
            }
          }
        }
        case 4 : {
          System.out.print("Nhập tên: ");
          String name = sc.nextLine();
          company.getSalary(name);
        }
        case 5 : {
          System.out.print("Tên phòng ban: ");
          String dept = sc.nextLine();
          company.adDeparment(dept);
        }
        case 6 : company.displayDeparments(); break;
        case 7 : {
          company.sortBySalary();
          System.out.println("Danh sách đã được sắp xếp theo lương giảm dần.");
          break;
        }
        case 8 : {
          System.out.print("Nhập tên nhân viên: ");
          String name = sc.nextLine();
          company.searchByName(name);
          break;
        }
        case 9 : System.out.println("Thoát chương trình."); break;
        default : System.out.println("Lựa chọn không hợp lệ.");
      }

    } while (n != 9);

  }
}