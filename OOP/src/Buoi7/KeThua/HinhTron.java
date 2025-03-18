package Buoi7.KeThua;

public class HinhTron extends Hinh {

    private int banKinh;

    public HinhTron() {
        super();
        banKinh = 0;
    }
    public void setChuVi() {
        double chuVi= 3.14*2*banKinh;
        super.setChuVi(chuVi);
    }

    public void setDienTich(){
        double dienTich= 3.14*banKinh*banKinh;
        super.setDienTich(dienTich);
    }
    public void hienThongTin(){
        setChuVi();
        setDienTich();
        System.out.println("Bán kính hình tròn: "+ banKinh);
        super.hienThiThongTin();
    }


    public int getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(int banKinh) {
        this.banKinh = banKinh;
    }

}
