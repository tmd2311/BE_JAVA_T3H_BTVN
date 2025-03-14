public class ConVat {
    private String ten;
    private int soChan;


    public void chay(){
        System.out.println(ten+ " Đang chạy");
    }

    public void an(){
        System.out.println(ten+ " Đang ăn");
    }


    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoChan() {
        return soChan;
    }

    public void setSoChan(int soChan) {
        this.soChan = soChan;
    }
}
