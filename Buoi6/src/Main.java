import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // =============Con Vat====================
//        ConVat[] danhSach = new ConVat[6];
//        String[] ten= {"Hổ", "Mèo", "Chó", "Lợn", "Bò", "Trâu"};
//
//        for (int i = 0; i < 6; i++) {
//            ConVat cv = new ConVat();
//            cv.setTen(ten[i]);
//            cv.setSoChan(4);
//            cv.chay();
//            cv.an();
//            System.out.println(ten[i] +" Đã được thêm vào danh sách");
//            System.out.println("------------------\n");
//            danhSach[i] = cv;
//
//        }
        //========Phan So====================
//        PhanSo phanSo1 = new PhanSo(5,4);
//        PhanSo phanSo2 = new PhanSo(1,2);
//        System.out.println("Cộng 2 phân số");
//        inPhanSo(phanSo1.cong2PhanSo(phanSo2));
//
//        System.out.println("Trừ 2 phân số");
//        inPhanSo(phanSo1.tru2PhanSo(phanSo2));
//
//        System.out.println("Nhân 2 phân số");
//        inPhanSo(phanSo1.nhan2PhanSo(phanSo2));
//
//        System.out.println("Chia 2 phân số");
//        inPhanSo(phanSo1.chia2PhanSo(phanSo2));
//    }
//    public static void inPhanSo(PhanSo phanSo) {
//        if (phanSo.getTu() == phanSo.getMau()) {
//            System.out.println("1");
//            return;
//        }
//        if(phanSo.getTu() % phanSo.getMau() == 0) {
//            System.out.println(phanSo.getTu()/ phanSo.getMau());
//            return;
//        }
//        System.out.println(phanSo.getTu()+ "/"+ phanSo.getMau());

        //==============Tai Khoan============
        Scanner sc = new Scanner(System.in);
        Account account = new Account(1122, 20000, 4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("So du hien tai: "+ account.getBalance()+" USD");
        System.out.println("Tien lai hang thang: "+ account.getMonthlyInterest());
        System.out.println("Ngay tao: "+ account.getDateCreated());

        Account[] accounts = new Account[10];
        for (int i = 0; i < 10; i++) accounts[i] = new Account(i, 100);
        int id, luaChon;
        double soTien;

        do {
            do {
                System.out.println("Nhập ID tài khoản(0 -> 9): ");
                id = sc.nextInt();
                if (id < 0 || id > 9){
                    System.out.println("Tài khoản không tồn tại!");
                }
            }while (id < 0 || id > 9);
            System.out.println("===== MENU CHÍNH =====");
            System.out.println("1. Xem số dư");
            System.out.println("2. Rút tiền");
            System.out.println("3. Gửi tiền");
            System.out.println("4. Thoát");
            System.out.print("===> Nhập lựa chọn: ");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.println("Số dư hiện tại là: " + accounts[id].getBalance() + " $");
                    break;
                case 2:
                    System.out.print("Nhập số tiền cần rút: ");
                    soTien = sc.nextDouble();
                    accounts[id].withdraw(soTien);
                    System.out.println("Số dư hiện tại là: " + accounts[id].getBalance() + " USD");
                    break;
                case 3:
                    System.out.print("Nhập số tiền cần gửi: ");
                    soTien = sc.nextDouble();
                    accounts[id].deposit(soTien);
                    System.out.println("Số dư hiện tại là: " + accounts[id].getBalance() + " USD");
                    break;
                case 4:
                    System.out.println("Thoát thành công");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
        }while (luaChon !=4);


    }
}