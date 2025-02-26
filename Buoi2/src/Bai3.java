import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soDien;
        do{
            System.out.print("Nhập số điện: ");
            soDien= scanner.nextInt();
        }while (soDien<0);
        int tienDien=0;
        if(soDien<= 50){
            tienDien= soDien* 1678;
        }else if(soDien<= 100){
            tienDien= 50*1678+ (soDien-50)*1734;
        }else if(soDien<= 200){
            tienDien= 50*1678 + 50* 1734 + (soDien-100)*2014;
        }else if(soDien<= 300){
            tienDien= 50*1678 + 50* 1734 + 100* 2014+ (soDien-200)*2536;
        }else if(soDien<= 400){
            tienDien= 50*1678 + 50* 1734 + 100* 2014 + 100* 2536+ (soDien-300)*2834;
        }else tienDien= 50*1678 + 50* 1734 + 100* 2014 +100* 2536+ 100*2834+ (soDien-400)*2927;
        System.out.println("Tiền điện phải trả cho: " + soDien +" Số điện là: " + tienDien+ " VND");
    }
}
