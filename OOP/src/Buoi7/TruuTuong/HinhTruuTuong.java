package Buoi7.TruuTuong;
/*
Biến class -> class trừu tượng (abstract)
- Định nghĩa là class thông thường nhưng có thêm cacasd method trừu tượng
- method trừu tượng là các method thông thường nhưng không có thân hàm và có từ khóa abstract
- là class chuyên để các subclass có cùng bản chất kế thừa và nó không thể tạo ra được đối tượng trực tiếp
    bằng từ khóa new mà bắt buộc phải khởi tạo thông qua subclass
 */
public abstract class HinhTruuTuong {
    private String dienTich;
    private String chuVi;

    public void hienThiThongTin(){
        System.out.println("Diện tích: "+dienTich);
        System.out.println("Chu Vi: "+chuVi);
    }

    /*
    Demo method abstract
    Có thể có tham số đầu vào
    Cac class kế thừa thì phải override lại tất cả các method abatract
     */
    public abstract  void tinhChuVi();
}
