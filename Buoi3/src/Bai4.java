public class Bai4 {
    public static void main(String[] args) {
        int x1 = 0, x2;

        do {
            x2 = 0; // Reset x2 mỗi lần lặp x1
            do {
                int temp = 200 - (x1 * 1 + x2 * 2);
                if (temp >= 0 && temp % 5 == 0) {
                    System.out.println("x1= " + x1 + " || x2= " + x2 + " || x3= " + (temp / 5));
                }
                x2++;
            } while (x1 * 1 + x2 * 2 <= 200);
            x1++;
        } while (x1 * 1 <= 200);
    }
}
