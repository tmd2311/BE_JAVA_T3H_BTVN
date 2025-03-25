import java.util.Scanner;

public class BaiTrenLop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int so1 = 0, so2 = 0;
        xuLyInput(sc);

        try {
            float thuong = (float) so1 / so2;
            System.out.println(thuong);
        }
        catch(Exception e){
            System.out.println("Lỗi");
        }

    }

    private static void xuLyInput(Scanner sc) {
        int so1;
        int so2;
        try {
            System.out.println("Nhập số chia: ");
            so1 = sc.nextInt();
            System.out.println("Nhập số bị chia: ");
            so2 = sc.nextInt();
        }
        catch(Exception e){
            sc.nextLine();
            System.out.println("Lỗi: "+ e.getMessage());
            xuLyInput(sc);

        }
    }
}
