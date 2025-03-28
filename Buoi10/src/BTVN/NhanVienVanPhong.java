package BTVN;

public class NhanVienVanPhong extends NhanVien {
    private int soNgayLamViec;

    public NhanVienVanPhong(String maNV, String hoTen, int tuoi, double luongCoBan, int soNgayLamViec) {
        super(maNV, hoTen, tuoi, luongCoBan);
        this.soNgayLamViec = soNgayLamViec;
    }

    @Override
    public double tinhLuong() {
        return this.getLuongCoBan() + (double) soNgayLamViec*100000;
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
        return "NhanVienVanPhong{" +
                "soNgayLamViec=" + soNgayLamViec +
                '}';
    }
}
