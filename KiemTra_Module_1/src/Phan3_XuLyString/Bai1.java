package Phan3_XuLyString;

import java.util.Scanner;

/*
Câu 1 Viết chương trình nhận một chuỗi từ người dùng và in ra chuỗi đó theo chiều đảo ngược. Hãy sử dụng StringBuilder hoặc StringBuffer để thực hiện thao tác này.

· Nhập vào một chuỗi.

· Sử dụng StringBuilder hoặc StringBuffer để đảo ngược chuỗi và in kết quả.
 */
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi: ");
        String n = sc.nextLine();
        StringBuilder chuoi = new StringBuilder();
        for (int i = n.length()-1; i >=0; i--) {
            chuoi.append(n.charAt(i));
        }
        System.out.println("Chuỗi đảo ngược: " + chuoi);
    }
}
