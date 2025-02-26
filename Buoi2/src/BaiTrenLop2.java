import java.util.Scanner;

public class BaiTrenLop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập b: ");
        int b = scanner.nextInt();

        System.out.println("Tổng a+b: " + (a+b));
        System.out.println("Tích a*b: "+ (a*b));
        System.out.println("Thương: a/b: "+ (a/b));
        System.out.println(("Số dư: a%b: "+ (a%b)));


    }
}
