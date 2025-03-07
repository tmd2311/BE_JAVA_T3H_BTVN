import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi cẩn xử lí");
        String chuoi = sc.nextLine();
        System.out.println("\na, Đếm từ: ");
        Map<String , Integer> map = demTu(chuoi);
        for (Map.Entry<String , Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + "từ");
        }

        System.out.println("\nb, Viết hoa chữ cái đầu:");
        System.out.println(vietHoa(chuoi));

        System.out.println("\nc, Bỏ nguyên âm:");
        System.out.println(xoaNguyenAm(chuoi));

    }

    /*
        PatternLớp - Xác định một mẫu (được sử dụng trong tìm kiếm)
        MatcherLớp - Được sử dụng để tìm kiếm mẫu
     */

    public static Map<String, Integer> demTu(String chuoi){
        Map<String, Integer> map = new HashMap<>();
        Pattern pattern = Pattern.compile("[\\p{L}]+"); // lớp mẫu có chữ cái có dấu
        Matcher matcher = pattern.matcher(chuoi); // tìm kiếm

        int soTu;
        while (matcher.find()) {
            String tu = matcher.group();
            soTu = map.get(tu) != null ? map.get(tu) : 0;
            map.put(tu, soTu+1);
        }
        return map;
    }


    public static String vietHoa(String chuoi){
        StringBuilder builder = new StringBuilder();
        String[] tu = chuoi.split(" ");
        for (String x : tu){
            builder.append(Character.toUpperCase(x.charAt(0)))
            .append(x.substring(1)).append(" ");
        }
        return builder.toString().trim();
    }
    public static String xoaNguyenAm(String chuoi){
        return chuoi.replaceAll("[aeiouAEIOUáàảãạăắằẳẵặâấầẩẫậéèẻẽẹêếềểễệíìỉĩịóòỏõọôốồổỗộơớờởỡợúùủũụưứừửữựýỳỷỹỵ]", "");
    }
}
