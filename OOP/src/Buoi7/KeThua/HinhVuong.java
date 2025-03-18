package Buoi7.KeThua;

public class HinhVuong extends DaGiac{
    private int doDaiMotCanh;

    public void hienThiThongTin() {
        System.out.println("Độ dài 1 cạnh: " + doDaiMotCanh);
        super.hienThiThongTin();
    }
    public void setDienTich() {
        double dienTich = doDaiMotCanh*doDaiMotCanh;
        super.setDienTich(dienTich);
    }
    public void setChuvi() {
        double chuvi = doDaiMotCanh*4;
        super.setChuVi(chuvi);
    }

    public int getDoDaiMotCanh() {
        return doDaiMotCanh;
    }

    public void setDoDaiMotCanh(int doDaiMotCanh) {
        this.doDaiMotCanh = doDaiMotCanh;
    }
}
