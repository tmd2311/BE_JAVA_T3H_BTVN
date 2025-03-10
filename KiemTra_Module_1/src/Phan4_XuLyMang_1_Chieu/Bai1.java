package Phan4_XuLyMang_1_Chieu;

import java.util.Scanner;

/*
Câu 1 Viết chương trình nhập vào một mảng số nguyên từ người dùng và tìm ra giá trị lớn nhất và giá trị nhỏ nhất trong mảng. In ra các giá trị này.

Yêu cầu:

1. Nhập vào số lượng phần tử mảng.

2. Nhập các phần tử mảng.

3. Tìm giá trị lớn nhất và giá trị nhỏ nhất và in ra kết quả.

4. Tính tổng các phần tử của mảng.

5. Thêm 1 phần tử vào mảng với vị trí do người dùng nhập, nếu mảng không đủ ô nhớ sẽ tự động tăng thêm 100% ô nhớ hiện tại.

6. Cho người dùng nhập vào 1 phần tử, xóa đi tất cả các phần tử đó trong mảng

7. Tìm phần tử lớn thứ 3 trong mảng
 */
public class Bai1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int size;
        do {
            System.out.println("Nhập kích thước mảng: ");
            size = sc.nextInt();
            System.out.println("Nhập số lượng phần tử: ");
            n = sc.nextInt();
            if(n<0 || n> size) System.out.println("Dữ liệu không hợp lệ");
        }while (size <= 0||n<=0 || n> size);
        int a[] = new int[size];
        int tong=0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " +(i+1)+": ");
             a[i] = sc.nextInt();
             tong+=a[i];
        }
        int[] b = sapXep(a, n) ;

        System.out.println("\nTổng các phẩn tử: "+ tong);
        System.out.println("Giá trị lớn nhất: "+ b[n-1]);
        System.out.println("Giá trị nhỏ nhât: "+ b[0]);

        if(n<3){
            System.out.println("Không đủ phần tử để xét!!!");
        }else {
            System.out.println("Phần tử lớn thứ 3 là: "+ b[2]);
        }

        int virTri, giaTri;
        do {
            System.out.println("Nhập vị trí muốn thêm: ");
            virTri = sc.nextInt();
            if(virTri == n+1)  n++;
            if(virTri<0 || virTri>n+1) System.out.println("Vị trí không hợp lệ!!!!!");
        }while (virTri<0 || virTri>n+1);


        System.out.println("Nhập giá trị muốn thêm: ");
        giaTri = sc.nextInt();

        a= themPhanTu(a, n, virTri, giaTri);
        n++;
        System.out.println("Mảng sau khi thêm: ");
        inMang(a, n);

        System.out.println("\nNhập giá trị muốn xóa");
        giaTri = sc.nextInt();
        if(timKiem(a, n, giaTri) == -1) System.out.println("Không có giá trị này!!!");
        else {
            while ((virTri = timKiem(a, n, giaTri)) != -1){
                a= xoaPhanTu(a, n, virTri);
                n--;
            }
            System.out.println("Mảng sau khi xóa: ");
            inMang(a, n);
        }
    }

    public static void inMang(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+ " ");
        }
    }

    public static int[] sapXep(int[] a, int n) {
        int temp = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n -i -1; j++) {
                if(a[j]>a[j+1]) {
                     temp = a[j];
                     a[j] = a[j+1];
                     a[j+1] = temp;
                }
            }
        }
        return a;
    }
    // 1, 2, 3, 4 b
    // 1, 2, 3, 4  a   vitri =1, giatri = 10
    public static int[] themPhanTu(int[] a, int n, int viTri, int giaTri) {
        int[] b;
        if (n >= a.length) {
            b = new int[a.length * 2];
        } else {
            b = new int[a.length];
        }
        for (int i = 0, j = 0; i < n + 1; i++) {
            if (i == viTri) {
                b[i] = giaTri;
            } else {
                b[i] = a[j];
                j++;
            }
        }
        return b;
    }

    public static int timKiem(int[] a, int n, int giaTri) {
        for (int i = 0; i < n; i++) {
            if (a[i] == giaTri) {
                return i;
            }
        }
        return -1;
    }

    public static int[] xoaPhanTu(int[] a,int n, int viTri){
        for( int i = viTri; i< n-1; i++){
            a[i] = a[i+1];
        }
        return a;
    }


}
