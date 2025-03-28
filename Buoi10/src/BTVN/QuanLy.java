package BTVN;

public class QuanLy extends NhanVien{
    private double heSoChucVu;

    public QuanLy(String maNV, String hoTen, int tuoi, double luongCoBan, double heSoChucVu) {
        super(maNV, hoTen, tuoi, luongCoBan);
        this.heSoChucVu = heSoChucVu;
    }
    @Override
    public double tinhLuong() {
        return this.getLuongCoBan()*heSoChucVu;
    }
    public void hienThiThongTin(){
        super.hienThiThongTin();
        toString();
    }
    public void nhapThongTin(){
        super.nhapThongTin();

    }

    @Override
    public String toString() {
        return "QuanLy{" +
                "heSoChucVu=" + heSoChucVu +
                '}';
    }
}
