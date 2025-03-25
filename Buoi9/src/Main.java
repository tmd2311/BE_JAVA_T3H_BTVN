import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[5];
        for(int i =0; i< 5; i++){
            try {
                System.out.println("Nhập số thứ "+ (i+1));
                arr[i]= sc.nextInt();

            }
            catch(Exception e){
                sc.nextLine();
                System.out.println("Lỗi! nhập lại");
                i--;
            }

        }
    }
}