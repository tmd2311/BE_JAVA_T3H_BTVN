package Phan2_CauTrucDieuKien;

import java.util.Scanner;
/*
Câu 1 Viết chương trình nhập vào một số nguyên từ người dùng và kiểm tra số đó là số chẵn hay số lẻ. Chương trình cần in ra kết quả phù hợp. Hãy sử dụng cấu trúc điều kiện if-else để giải quyết.

Yêu cầu:

1. Nhập một số nguyên từ bàn phím.

2. Nếu số là chẵn, in ra "Số chẵn".

3. Nếu số là lẻ, in ra "Số lẻ".
 */
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println(n+ "là số chẵn");
            return;
        }
        System.out.println(n+" là số lẻ");
    }
}
