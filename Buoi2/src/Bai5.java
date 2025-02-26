import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nam, thang, ngay;
        do{
            System.out.println("Nhập năm: ");
            nam = sc.nextInt();

            System.out.println("Nhập tháng: ");
            thang = sc.nextInt();
            if(!kiemTra(thang, nam)){
                System.out.println("Dữ liệu không hợp lệ ");
            }
        }while (!kiemTra(thang, nam));

        switch (thang){
            case 1: case 3: case 5:
            case 7: case 8: case 10: case 12: {
                ngay = 31;
                break;
            }
            case 4: case 6: case 9: case 11: {
                ngay = 30;
                break;
            }
            case 2: {
                if((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)){
                    ngay = 29;
                }else ngay = 28;
                break;
            }
            default: {
                ngay = 0;
            }
        }
        System.out.println("Tháng " + thang + " năm " + nam + " có " + ngay + " ngày.");
    }

    public static boolean kiemTra(int thang, int nam){
        if(thang <1 || thang >12 || nam <0) return false;
        return true;
    }
}
