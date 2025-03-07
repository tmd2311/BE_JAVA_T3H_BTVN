import java.util.Scanner;
 // 1 2 3 4 5 6 7
public class BaiTrenLop1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int[] day= new int[n];
        int tong =0;
        int soLonNhat=0;
        int soNhoNhat=10000000;
        String mang ="";
        for(int i=0;i<n;i++){
            System.out.println("Enter the day of "+(i+1)+":");
            day[i]=sc.nextInt();
            tong+=day[i];
            mang+=day[i]+ " ";
            if(day[i]>soLonNhat) soLonNhat=day[i];
            if(day[i]<soNhoNhat) soNhoNhat=day[i];
        }
        System.out.println("Mang: "+mang);
        System.out.println("Tong: "+tong);
        System.out.println("So nho nhat: "+soNhoNhat);
        System.out.println("So lon nhat: "+soLonNhat);

    }
}
