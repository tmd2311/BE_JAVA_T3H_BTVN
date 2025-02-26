import java.util.Scanner;

public class BaiTrenLop3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        int a = scanner.nextInt();
        System.out.print("Nhập chiều rộng: ");
        int b = scanner.nextInt();

        System.out.println("Diện tích hình chữ nhật là: "+ (a*b));

    }
}
