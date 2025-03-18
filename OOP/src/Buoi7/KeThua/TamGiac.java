package Buoi7.KeThua;

public class TamGiac extends DaGiac {
    private int canhA;
    private int canhB;
    private int canhC;

    public void hienThongTinh(){
        System.out.println("Độ dài 3 cạnh: "+ canhA + "  " + canhB + "  " + canhC);
        super.hienThongTin();
    }

    public void setChuVi(){
        double chuVi= canhA+canhB+canhC;
        super.setChuVi(chuVi);
    }

    public void setDienTich(){
        double chuVi= (canhA+canhB+canhC)/2;
        double dienTich= Math.sqrt(chuVi*(chuVi-canhA)*(chuVi-canhB)*(chuVi-canhC));
        super.setDienTich(dienTich);
    }

    public int getCanhA() {
        return canhA;
    }

    public void setCanhA(int canhA) {
        this.canhA = canhA;
    }

    public int getCanhB() {
        return canhB;
    }

    public void setCanhB(int canhB) {
        this.canhB = canhB;
    }

    public int getCanhC() {
        return canhC;
    }

    public void setCanhC(int canhC) {
        this.canhC = canhC;
    }
}
