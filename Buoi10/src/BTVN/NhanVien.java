package BTVN;

public abstract class NhanVien {
    private String maNV;
    private String hoTen;
    private int tuoi;
    private double luongCoBan;
    public NhanVien(String maNV, String hoTen, int tuoi, double luongCoBan) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.luongCoBan = luongCoBan;
    }

    public abstract double tinhLuong();

    public void hienThiThongTin(){
        toString();
    }

    public void nhapThongTin(){

    }

    public String getMaNV() {
        return maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNV='" + maNV + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", luongCoBan=" + luongCoBan +
                '}';
    }
}
