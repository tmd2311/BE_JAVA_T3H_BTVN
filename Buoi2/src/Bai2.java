import java.util.Scanner;

import static java.lang.Math.pow;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        do {
            System.out.print("Nhập cạnh a: ");
            a = scanner.nextInt();

            System.out.print("Nhập cạnh b: ");
            b = scanner.nextInt();

            System.out.print("Nhập cạnh c: ");
            c = scanner.nextInt();
        }while (a<0 || b<0 || c<0);

        if(a+b<c || a+c<b || b+c<a){
            System.out.println("Đây không phải tam giác");
        }else if(a==b && b==c){
            System.out.println("Đây là tam giác đều");
        }else if(a==b  || b==c || c == a){
            if(pow(a,2)+pow(b,2)==pow(c,2) || pow(a,2)+pow(c,2)==pow(b,2) || pow(b,2)+pow(c,2)==pow(a,2)){
                System.out.println("Đây là tam giác vuông cân");
            }else System.out.println("Đây là tam giác cân");
        }else if(pow(a,2)+pow(b,2)==pow(c,2) || pow(a,2)+pow(c,2)==pow(b,2) || pow(b,2)+pow(c,2)==pow(a,2)){
            System.out.println("Đây là tam giác vuông");
        }else System.out.println("Đây là tam giác thường");
    }
}
