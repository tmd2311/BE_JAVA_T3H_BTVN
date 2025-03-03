import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int soDaoNguoc=0;
        do {
            int temp = n % 10;
            soDaoNguoc= soDaoNguoc *10 +temp;
            n /= 10;
        }while (n != 0);
        System.out.println("So dao nguoc: "+soDaoNguoc);
    }
}
