import java.util.Scanner;

public class BaiTrenLop1 {
    String hoTen, sinhNhat, queQuan, truong;
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập ngày sinh (dd/mm/yyyy): ");
        sinhNhat = scanner.nextLine();
        System.out.print("Nhập quê quán: ");
        queQuan = scanner.nextLine();
        System.out.print("Nhập tên trường: ");
        truong = scanner.nextLine();
        scanner.close();
    }
    public void xuatThongTin() {
        System.out.println("Xin chào "+hoTen+", sinh ngày: "+sinhNhat+", đến từ"+queQuan+", học tại: "+truong);
    }

    public static void main(String[] args) {
        BaiTrenLop1 nguoi = new BaiTrenLop1();
        nguoi.nhapThongTin();
        nguoi.xuatThongTin();
    }
}
