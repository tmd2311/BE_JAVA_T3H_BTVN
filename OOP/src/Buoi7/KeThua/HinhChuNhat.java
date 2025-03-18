package Buoi7.KeThua;

public class HinhChuNhat extends DaGiac {
    private int chieuDai;
    private int chieuRong;

    public void hienThiThongTin(){
        System.out.println("Chiều dài: "+chieuDai);
        System.out.println("Chiều rộng: "+chieuRong);
        super.hienThiThongTin();
    }

    public void setChuVi(){
        double chuVi= 2* (chieuDai+chieuRong);
        super.setChuVi(chuVi);
    }
    public void setDienTich(){
        double dienTich= chieuDai*chieuRong;
        super.setDienTich(dienTich);
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }
}
