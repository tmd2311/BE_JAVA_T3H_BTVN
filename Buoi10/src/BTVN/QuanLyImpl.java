package BTVN;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class QuanLyImpl implements IQuanLy{
    private List<NhanVien> danhSachNhanVien=  new ArrayList<NhanVien>();

    @Override
    public void khoiTaoNhanVienMacDinh() {
        danhSachNhanVien.add(new NhanVienVanPhong("NV001", "Nguyen Van A", 30, 5000000, 20));
        danhSachNhanVien.add(new KySu("KS002", "Tran Thi B", 28, 7000000, "Cong nghe thong tin"));
        danhSachNhanVien.add(new QuanLy("QL003", "Le Quang C", 35, 10000000, 1.5));
    }

    @Override
    public void themNhanVien() throws EmployeeException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien: ");
        String maNV = scanner.nextLine();

        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getMaNV().equals(maNV)) {
                throw new EmployeeException("Ma nhan vien da ton tai!");
            }
        }

        System.out.print("Nhap ho ten: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        int tuoi = scanner.nextInt();
        System.out.print("Nhap luong co ban: ");
        double luongCoBan = scanner.nextDouble();

        System.out.println("Chon loai nhan vien: 1. Van phong 2. Ky su 3. Quan ly");
        int loai = scanner.nextInt();
        scanner.nextLine();

        switch (loai) {
            case 1:
                System.out.print("Nhap so ngay lam viec: ");
                int soNgay = scanner.nextInt();
                danhSachNhanVien.add(new NhanVienVanPhong(maNV, hoTen, tuoi, luongCoBan, soNgay));
                break;
            case 2:
                System.out.print("Nhap chuyen mon: ");
                String chuyenMon = scanner.nextLine();
                danhSachNhanVien.add(new KySu(maNV, hoTen, tuoi, luongCoBan, chuyenMon));
                break;
            case 3:
                System.out.print("Nhap he so chuc vu: ");
                double heSo = scanner.nextDouble();
                danhSachNhanVien.add(new QuanLy(maNV, hoTen, tuoi, luongCoBan, heSo));
                break;
        }
    }

    @Override
    public void hienThiDanhSach() {
        danhSachNhanVien.forEach(NhanVien::hienThiThongTin);
    }

    @Override
    public double tinhTongLuong() {
        return danhSachNhanVien.stream().mapToDouble(NhanVien::tinhLuong).sum();
    }

    @Override
    public void timLuongCaoNhat() {
        danhSachNhanVien.stream().max(Comparator.comparingDouble(NhanVien::tinhLuong)).ifPresent(NhanVien::hienThiThongTin);
    }

    @Override
    public void timTheoMaNV(String maNV) {
        danhSachNhanVien.stream().filter(nv->nv.getMaNV().equals(maNV)).findFirst().ifPresentOrElse(
            NhanVien::hienThiThongTin,
                ()-> System.out.println("Nhan vien khong ton tai!")

        );
    }

    @Override
    public void sapXepTheoTen() {
        danhSachNhanVien.sort(Comparator.comparing(NhanVien::getHoTen));
    }

    @Override
    public void sapXepTheoLuongGiamDan() {
        danhSachNhanVien.sort(Comparator.comparingDouble(NhanVien::tinhLuong).reversed());
    }
}
