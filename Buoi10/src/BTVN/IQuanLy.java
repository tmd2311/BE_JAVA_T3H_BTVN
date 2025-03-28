package BTVN;

public interface IQuanLy {
    void khoiTaoNhanVienMacDinh();
    void themNhanVien() throws EmployeeException;
    void hienThiDanhSach();
    double tinhTongLuong();
    void timLuongCaoNhat();
    void timTheoMaNV(String maNV);
    void sapXepTheoTen();
    void sapXepTheoLuongGiamDan();
}
