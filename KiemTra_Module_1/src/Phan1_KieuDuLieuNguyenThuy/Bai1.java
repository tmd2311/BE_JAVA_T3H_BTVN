package Phan1_KieuDuLieuNguyenThuy;

import java.util.Scanner;
/*
Câu 1 Viết chương trình nhập vào hai số nguyên từ người dùng và tính tổng của chúng. Sau đó in ra kết quả.

Yêu cầu:

1. Nhập vào hai số nguyên từ bàn phím.

2. In ra kết quả tổng của hai số.
 */
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Nhap a: ");
        a = sc.nextInt();
        System.out.print("Nhap b: ");
        b = sc.nextInt();

        System.out.println("Tong 2 so la: "+  (a+b));
    }
}
