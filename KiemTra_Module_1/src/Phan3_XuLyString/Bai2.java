package Phan3_XuLyString;

import java.util.Scanner;

/*
Câu 3 Viết chương trình nhập vào một chuỗi từ người dùng và kiểm tra xem chuỗi đó có phải là chuỗi Palindrome (chuỗi đối xứng) hay không. Sử dụng StringBuilder

Yêu cầu:

1. Nhập vào một chuỗi.

2. Kiểm tra nếu chuỗi đó là Palindrome (đối xứng).

3. In ra kết quả: "Chuỗi là Palindrome" hoặc "Chuỗi không phải là Palindrome".
 */
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String n = sc.nextLine();
        StringBuilder chuoi = new StringBuilder(n);
        int j = n.length()-1;
        boolean dieuKien= true;
        for (int i = n.length()-1; i >=0; i--) {
            if(chuoi.charAt(j) == n.charAt(i)) {
                j--;
                continue;
            }
            dieuKien = false;
            break;
        }
        if(dieuKien) {
            System.out.println("Chuỗi là Palindrome");
        }
        else {
            System.out.println("Chuỗi không phải là Palindrome");
        }
    }
}
