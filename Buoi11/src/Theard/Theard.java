package Theard;

public class Theard implements Runnable {
    private int batDau;
    public int ketThuc;
    public String ten;

    public Theard(int batDau, int ketThuc, String ten) {
        this.batDau = batDau;
        this.ketThuc = ketThuc;
        this.ten = ten;
    }

    @Override
    public void run() {
        System.out.println(ten+ " bắt đầu chạy");
        for (int i = batDau; i <= ketThuc; i++) {
            System.out.println("i = " + i);
        }
        System.out.println(ten+ " kết thúc");
        System.out.println("\n\n_____________________________________");
    }
}
