import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.println("Nhập số điện thoại: ");
        String chuoi= new Scanner(System.in).nextLine();
        if(kiemTra(chuoi)){
            System.out.println("Hợp lệ");
            return;
        }
        System.out.println("Không hợp lệ");

    }
    public static boolean kiemTra(String chuoi) {
        String regex = "^(\\+84|84|0)\\d{9}$|^(0\\d{2,3}[-.]\\d{3}[-.]\\d{3,4})$";
        return chuoi.matches(regex);
    }
}
