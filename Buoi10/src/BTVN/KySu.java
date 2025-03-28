package BTVN;

public class KySu extends NhanVien{
    private String chuyenMon;
    public KySu(String maNV, String hoTen, int tuoi, double luongCoBan, String chuyenMon) {
        super(maNV, hoTen, tuoi, luongCoBan);
        this.chuyenMon = chuyenMon;
    }
    @Override
    public double tinhLuong() {
        return this.getLuongCoBan() + 2000000;
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
        return "KySu{" +
                "chuyenMon='" + chuyenMon + '\'' +
                '}';
    }
}
