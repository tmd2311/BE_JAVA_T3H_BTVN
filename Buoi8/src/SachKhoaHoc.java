import java.util.Scanner;

public class SachKhoaHoc extends Book {
    private String researchSubject;
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Đối tượng nghiên cứu: " + researchSubject);
    }

    @Override
    public void inputInfo(int id) {
        Scanner scanner = new Scanner(System.in);
        super.inputInfo(id);
        System.out.print("Nhập đối tượng nghiên cứu: ");
        researchSubject = scanner.nextLine();
    }
}
