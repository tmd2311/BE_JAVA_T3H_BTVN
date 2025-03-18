package Buoi7.KeThua;

public class DaGiac extends Hinh {
    private int soCanh;
    private int soGoc;


    public void hienThongTin(){
        System.out.println("Số cạnh: "+soCanh);
        System.out.println("Số góc: "+soGoc);
        super.hienThiThongTin();
    }

    public int getSoCanh() {
        return soCanh;
    }

    public void setSoCanh(int soCanh) {
        this.soCanh = soCanh;
    }

    public int getSoGoc() {
        return soGoc;
    }

    public void setSoGoc(int soGoc) {
        this.soGoc = soGoc;
    }
}
