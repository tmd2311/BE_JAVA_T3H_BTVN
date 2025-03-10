package Phan2_CauTrucDieuKien;

import java.util.Scanner;

/*
Câu 3 Viết một chương trình tính tiền vé xe bus theo số chuyến đi của người dùng. Cấu trúc giá vé như sau:

· Mỗi chuyến đi có giá 10.000 VNĐ.

· Nếu người dùng đi trên 5 chuyến, áp dụng giảm giá 10%.

· Nếu đi trên 10 chuyến, áp dụng giảm giá 20%.

Chương trình cần nhập vào số chuyến đi và in ra số tiền phải trả sau khi áp dụng giảm giá.

Yêu cầu:

1. Nhập vào số chuyến đi.

2. Áp dụng giảm giá nếu số chuyến đi vượt qua các mức quy định.

3. In ra số tiền phải trả.
 */
public class Bai3 {
    static final int gia= 10000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhập số chuyến đi: ");
            n = sc.nextInt();
            if(n<=0){
                System.out.println("Dữ liệu không hợp lệ");
            }
        }while (n<=0);
        double giaPhaiTra=0;
        if(n<=5){
            giaPhaiTra+= n* gia;
        }else if(n<=10){
            giaPhaiTra+= (n* gia)  - (n * gia * 0.1);
        }else {
            giaPhaiTra+= (n* gia) - (n * gia * 0.2);
        }
        System.out.println("Giá phải trả cho: "+n+" chuyến đi là: "+(int) giaPhaiTra+" VND");
    }
}
