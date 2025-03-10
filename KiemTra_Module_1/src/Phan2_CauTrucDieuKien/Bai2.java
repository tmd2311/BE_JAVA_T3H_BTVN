package Phan2_CauTrucDieuKien;

import java.util.Scanner;
/*
Câu 2: Viết chương trình nhập vào một số nguyên từ 1 đến 7 đại diện cho một ngày trong tuần và in ra tên của ngày đó (1 - "Chủ nhật", 2 - "Thứ hai", ..., 7 - "Thứ bảy"). Chương trình phải sử dụng cấu trúc switch-case để thực hiện.

1. Nhập vào số nguyên từ 1 đến 7.

2. Dùng switch-case để in ra tên của ngày tuần tương ứng.
 */
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Nhập số( 1 - 7): ");
            n = sc.nextInt();
            if(n<1 || n>7){
                System.out.println("Dữ liệu không hợp lệ-> Nhập lại");
            }
        }while (n<1 || n>7);
        switch (n){
            case 1:{
                System.out.println("Chủ nhật");
                break;
            }

            case 2:{
                System.out.println("Thứ hai");
                break;
            }
            case 3:{
                System.out.println("Thứ ba");
                break;
            }
            case 4:{
                System.out.println("Thứ tư");
                break;
            }
            case 5:{
                System.out.println("Thứ năm");
                break;
            }
            case 6:{
                System.out.println("Thứ sáu");
                break;
            }
            case 7:{
                System.out.println("Thứ bảy");
                break;
            }
        }
    }
}
