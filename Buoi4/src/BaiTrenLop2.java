public class BaiTrenLop2 {
    /*
    Đặc điểm String:
        String dùng như 1 mảng
        String là duy nhất trong string pool
        Nơi lưu trữ String : ở String pool trong Heap, nếu thay đổi -> tạo ra string mới trong đây
                            nếu khai báo bắng new string -> lưu trữ như ở heap bình thường
       -So sánh: (==) hoặc (euqual)
            + (==) so sánh địa chỉ 2 ô nhớ
            + (equal) so sánh giá trị 2 ô nhớ
     Nếu muốn nối chuỗi thì nên dùng stringBuilder hoắc stringBuffer
     */
    public static void main(String[] args) {
        String name5 = "T3h";
        StringBuilder builder = new StringBuilder();
    }

}
