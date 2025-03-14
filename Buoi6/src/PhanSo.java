public class PhanSo {
    private int tu;
    private int mau;


    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau=mau;
    }



    public PhanSo() {   }


    public PhanSo cong2PhanSo(PhanSo phanSo2){
        PhanSo tong = new PhanSo();
        tong.setTu(this.tu*phanSo2.getMau()+ this.mau*phanSo2.getTu());
        tong.setMau(this.mau*phanSo2.getMau());
        return tong;
    }

    public PhanSo tru2PhanSo(PhanSo phanSo2){
        PhanSo hieu = new PhanSo();
        hieu.setTu(this.tu*phanSo2.getMau() - this.mau*phanSo2.getTu());
        hieu.setMau(this.mau*phanSo2.getMau());
        return hieu;
    }

    public PhanSo nhan2PhanSo(PhanSo phanSo2){
        PhanSo tich = new PhanSo();
        tich.setTu(this.tu*phanSo2.getTu());
        tich.setMau(this.mau*phanSo2.getMau());
        return tich;
    }
    public PhanSo chia2PhanSo(PhanSo phanSo2){
        PhanSo thuong = new PhanSo();
        thuong.setTu(this.tu*phanSo2.getMau());
        thuong.setMau(this.mau*phanSo2.getTu());
        return thuong;
    }
}
