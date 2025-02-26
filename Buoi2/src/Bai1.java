import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        scanner.close();
    }
}
