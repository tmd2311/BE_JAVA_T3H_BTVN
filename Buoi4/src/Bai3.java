import java.util.*;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int tongSoChan=0;
        int demChan=0;
        int demLe=0;
        int tongSoLe= 0;
        int trungBinh=0;
        int demSoNguyenTo=0;
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào phần tử thứ "+ (i+1)+": ");
            a[i]=sc.nextInt();
            if(a[i] %2 == 0) {
                tongSoChan+= a[i];
                demChan++;
            }
            else {
                tongSoLe+= a[i];
                demLe++;
            }
            if(kiemTra(a[i])){
                demSoNguyenTo++;
            }
            trungBinh+=a[i];
        }
        trungBinh = trungBinh/n;

        System.out.println("Mảng đã nhập là: ");
        inMang(a);
        System.out.println("\n2) ");
        System.out.println("    Tổng phần tử chẵn trong dãy: " + tongSoChan);
        System.out.println("    Tổng phần từ lẻ trong dãy: " + tongSoLe);

        System.out.println("3)");
        System.out.println("Các số nguyên tố: "+ demSoNguyenTo);
        inMang(soNguyenTo(a));


        System.out.println("\n4)");
        inMangChanLeDaSapXep(demChan,demLe,a);

        System.out.println("5");
        inHaiMangCon(a, trungBinh);

        System.out.println("6");
        inCacPhanTuTrung(a);

        System.out.println("Nhập vị trí can them: ");
        int viTri = sc.nextInt();

        System.out.println("Nhap gia tri can them: ");
        int giaTri = sc.nextInt();


        int[] b= themPhanTuMoi(a,viTri,giaTri);
        System.out.println("Mảng sau khi them: ");
        inMang(b);

        System.out.println("\nNhap so can xoa: ");
        int soXoa = sc.nextInt();
        System.out.println("\nMang sau khi xoa: ");
        in(b, soXoa);

    }

    public static int timKiem(int[] a, int giaTri){
        for (int i =0; i<a.length; i++){
            if(a[i] == giaTri) return i;
        }
        return -1;
    }
    public static int[] xoaPhanTu(int[] a, int viTri){
        for( int i = viTri; i< a.length -1; i++){
             a[i] = a[i+1];
        }
        a[a.length-1] = -1;
        return a;
    }
    public static void in(int[] a, int giaTri){
        int viTri;
        while ((viTri = timKiem(a, giaTri)) != -1){
            a= xoaPhanTu(a, viTri);
        }
        inMang(a);

    }
    public static boolean kiemTra(int x){
        if(x<2) return false;
        for(int i=2; i<=Math.sqrt(x); i++){
            if(x%i==0) return false;
        }
        return true;
    }
    public static int[] soNguyenTo(int[] a) {

        Set<Integer> setNguyenTo = new HashSet<>();
        for(int x : a){
            if(kiemTra(x)){
                setNguyenTo.add(x);
            }
        }
        int[] mangSoNguyenTo = new int[setNguyenTo.size()];
        int viTri =0;
        for( int x: setNguyenTo){
            mangSoNguyenTo[viTri]=x;
            viTri++;
        }
        return mangSoNguyenTo;
    }

    public static int[] sapXep(int[] x){
        int[] mangMoi = new int[x.length];
        int temp = 0;
        for(int i=0; i<x.length; i++){
            for(int j=0; j<x.length -1; j++){
                if(x[j] < x[j+1]){
                    temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                }
            }
        }
        return mangMoi;
    }
    public static void inMangChanLeDaSapXep(int demChan, int demLe, int[] a){
        int[] chan= new int[demChan];
        int[] le= new int[demLe];
        int viTriChan=0, viTriLe=0;
        for (int x : a){
            if(x%2==0){
                chan[viTriChan] = x;
                viTriChan++;
            }
            else {
                le[viTriLe] = x;
                viTriLe++;
            }
        }
        sapXep(chan);
        sapXep(le);
        inMangChanLe(chan,le);
    }
    public static void inMangChanLe(int[] chan, int[] le) {
        System.out.println("Dãy chẵn sắp xếp: ");
        for (int x : chan) {
            System.out.print(x + " ");
        }

        System.out.println("\nDãy lẻ sắp xếp: ");
        for (int i = le.length - 1; i >= 0; i--) {
            System.out.print(le[i] + " ");
        }
    }
    public static void inHaiMangCon(int[] a, int trungBinh){
        int demMang1=0, demMang2=0;
        for (int x : a){
            if(x > trungBinh) demMang2++;
            else demMang1++;
        }
        int[] mang1 = new int[demMang1];
        int[] mang2 = new int[demMang2];
        int vtMang1=0, vtMang2=0;
        for (int x : a){
            if(x > trungBinh){
                mang2[vtMang2] = x;
                vtMang2++;
            }else{
                mang1[vtMang1] = x;
                vtMang1++;
            }
        }
        System.out.println("Mảng nhỏ hơn trung bình: ");
        inMang(mang1);
        System.out.println("\nMảng lớn hơn trung bình: ");
        inMang(mang2);

    }
    public static void inMang(int[] a){
        for (int x : a){
            if(x<0) continue;
            System.out.print(x+" ");
        }
    }

    public static Map<Integer, Integer> demSoLanXuatHien(int[] a){
        Map<Integer, Integer> map = new HashMap<>();
        for (int x: a){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        return map;
    }

    public static  void  inCacPhanTuTrung(int[] a){
        Map<Integer, Integer> map = demSoLanXuatHien(a);
        int soLuongTrung=0;
        StringBuffer dayTrung = new StringBuffer();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1){
                soLuongTrung++;
                dayTrung.append(entry.getKey()+" xuất hiện: " + entry.getValue()+", ");
            }
        }
        System.out.println("Số lượng trùng lặp: "+ soLuongTrung+ "( "+dayTrung+" )");
    }
    public static int[] themPhanTuMoi(int[] a, int viTri, int giaTri){
        int[] mangMoi = new int[a.length +1];

        for (int i= 0, j = 0; i< mangMoi.length; i++) {
            if(i == viTri) mangMoi[i] = giaTri;
            else{
                mangMoi[i] = a[j];
                j++;
            }
        }
        return mangMoi;
    }
}
