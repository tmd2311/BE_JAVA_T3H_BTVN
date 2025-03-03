import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int giaithua = 1;
        giaithua*=tinhGiaiThua(num);
        System.out.println("Giaithua : "+giaithua);
    }

    private static int tinhGiaiThua(int num) {
        if(num == 1) return 1;
        return num* tinhGiaiThua(num - 1);
    }
}
