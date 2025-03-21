import java.util.Scanner;

public class SachKinhDoanh extends Book{
    private String businessField;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Business Field: " + businessField);
    }

    @Override
    public void inputInfo(int id) {
        Scanner scanner = new Scanner(System.in);
        super.inputInfo(id);
        System.out.print("Nhập lĩnh vực kinh doanh: ");
        businessField = scanner.nextLine();
    }
}
