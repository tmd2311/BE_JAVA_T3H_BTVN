import java.util.Scanner;

public class BaiTrenLop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int t = sc.nextInt();
        int soDaoNguoc=0;
        do {
            int temp = t %10;
            soDaoNguoc= soDaoNguoc*10 +temp;
            t = (t-temp)/10;
        }while (t != 0);
        System.out.println("So dao nguoc: "+soDaoNguoc);
    }
}
