import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhập số nguyên dương n: ");
            n = scanner.nextInt();
        } while (n <= 0);

        String binary = convertToBinary(n);

        System.out.println("Nhị phân của: "+n + " là:  " + binary);
    }

    public static String convertToBinary(int n) {
        String binary = "";
        while (n > 0) {
            binary = (n % 2) + binary;
            n /= 2;
        }
        return binary;
    }

}
