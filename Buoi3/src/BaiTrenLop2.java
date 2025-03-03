import java.util.Scanner;

public class BaiTrenLop2 {
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
