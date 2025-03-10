package Phan1_KieuDuLieuNguyenThuy;

import java.util.Scanner;
/*
Câu 2 Viết một chương trình tính diện tích của một hình tròn từ bán kính nhập vào từ người dùng. Sau đó, in ra kết quả và kiểm tra xem diện tích có phải là số chẵn hay số lẻ. Sử dụng các phép toán với kiểu dữ liệu double và int để tính diện tích.

Yêu cầu:

1. Nhập vào bán kính hình tròn.

2. Tính diện tích hình tròn.

3. Kiểm tra diện tích là chẵn hay lẻ và in kết quả.
 */
public class Bai2 {
    static final  double pi= 3.14;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r, s;
        System.out.println("Nhập bán kính: ");
        r = sc.nextDouble();
        s= pi * Math.pow(r, 2);
        System.out.println("Diện tích là: "+ s);

        if((int) s %2 ==0){
            System.out.println("Bán kính là số chẵn");
            return;
        }
        System.out.println("Bán kính là số lẻ");

    }
}
