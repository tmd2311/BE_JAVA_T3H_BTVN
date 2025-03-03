import java.util.Scanner;

public class BaiTrenLop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] arr = new int[n];
        int soDuong = 0;
        int soAm = 0;
        int tongDuong= 0;
        int tongAm = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number : ");
            arr[i] = sc.nextInt();
            if (arr[i]>0) {
                soDuong++;
                tongDuong+= arr[i];
            }else{
                soAm++;
                tongAm+= arr[i];
            }
        }
        System.out.println("SoDuong : " + soDuong);
        System.out.println("SoAm : " + soAm);
        System.out.println("TongDuong : " + tongDuong);
        System.out.println("TongAm : " + tongAm);

    }

}
