package Buoi7.KeThua;

public abstract class Hinh {
    private double dienTich;
    private double chuVi;

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public double getChuVi() {
        return chuVi;
    }

    public void setChuVi(double chuVi) {
        this.chuVi = chuVi;
    }
    public void hienThiThongTin(){
        System.out.println("Diện tích: "+dienTich);
        System.out.println("Chu Vi: "+chuVi);
    }

}
