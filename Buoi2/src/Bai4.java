import java.util.Scanner;

import static java.lang.Math.pow;

public class Bai4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int luaChon;
        do{
            System.out.println("+--------------------------+");
            System.out.println("1. Tính điểm sinh viên");
            System.out.println("2. Kiểm tra loại tam giác");
            System.out.println("3. Tính tiền điện");
            System.out.println("4. Kết thúc");
            System.out.println("+--------------------------+");
            do{
                System.out.print("Chọn chức năng: ");
                luaChon= scanner.nextInt();
                if(luaChon<1 || luaChon>4) System.out.println("Lựa chọn không hợp lệ");
            }while (luaChon<1 || luaChon>4);

            // Xử lý lựa chọn bằng switch
            switch (luaChon) {
                case 1:
                    tinhDiemSinhVien();
                    break;
                case 2:
                    kiemTraLoaiTamGiac();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình!");
                    scanner.close();
                    System.exit(0);
            }
        }while (luaChon != 4);
    }
    public static void tinhDiemSinhVien() {


        System.out.print("Nhập điểm chuyên cần: ");
        double diemChuyenCan = scanner.nextDouble();

        System.out.print("Nhập điểm giữa kỳ: ");
        double diemGiuaKy = scanner.nextDouble();

        System.out.print("Nhập điểm cuối kỳ: ");
        double diemCuoiKy = scanner.nextDouble();

        if (diemChuyenCan < 0 || diemChuyenCan > 10 ||
                diemGiuaKy < 0 || diemGiuaKy > 10 ||
                diemCuoiKy < 0 || diemCuoiKy > 10) {
            System.out.println("Điểm không hợp lệ! Vui lòng nhập điểm từ 0 đến 10.");
            return;
        }

        double diemTrungBinh = (diemChuyenCan + diemGiuaKy + diemCuoiKy) / 3;

        String xepLoai;
        if (diemTrungBinh >= 9) {
            xepLoai = "A";
        } else if (diemTrungBinh >= 7 && diemTrungBinh < 9) {
            xepLoai = "B";
        } else if (diemTrungBinh >= 5 && diemTrungBinh < 7) {
            xepLoai = "C";
        } else {
            xepLoai = "D";
        }

        System.out.printf("Điểm trung bình: %.2f\n", diemTrungBinh);
        System.out.println("Xếp loại: " + xepLoai);

    }

    public static void kiemTraLoaiTamGiac(){
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

    public static void tinhTienDien(){
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
