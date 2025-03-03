import java.util.Scanner;

/*
Bài 1: Tính tổng S(n) = 1^3 + 2^3 + 3^3 + ... + n^3

Mô tả: Nhập n từ bàn phím (n dương, bắt nhập lại nếu n âm) và tính tổng dãy S(n).

Test Case:

1. Input: n = 3 Output: S(3) = 1^3 + 2^3 + 3^3 = 1 + 8 + 27 = 36

2. Input: n = 5 Output: S(5) = 1^3 + 2^3 + 3^3 + 4^3 + 5^3 = 1 + 8 + 27 + 64 + 125 = 225
 */
public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter the number : ");
            n = sc.nextInt();
        }while (n<0);
        int S=0;
        String daySn ="";
        for (int i = 0; i < n; i++) {
            S+= Math.pow(i,3);
            daySn+= (i+1) + "^3 ";
            if(i< n-1) daySn+=" +";

        }
        System.out.println(daySn+ " = "+ S);
    }
}
