/*
    Tất cả các class trong java mặc định đều kế thừa từ
    class object cho dù khi tạo ra không được khai báo chính thức (class Person extends Object)
    - vì mặc định luôn kế thừa từ object -> tất cả các class đều có thể sử dụng
        và ghi đè lại các method
        +) equal() So sánh giá trị của 2 đối tượng của được tạo ra từ class
            thường được sử dụng trong cấu trúc lưu trữ như array
        +) hasdCode(): Sử dụng thuật toán hasing để tạo ra 1 giá trị cho giá trị hash cho mỗi object
            thường được sử dụng trong cấu trúc như map, hasmap, hashtable
        +) trong map, ... để xác định 2 phần tử trùng nhau thì java  sẽ sử dụng hashcode
            -> nếu khác nhau thì => 2 đối tượng khác nhau
            -> nếu giống nhau => tạm thời giống nhau , so sánh tiếp equal() -> nếu đúng thì mới là giống nhau
 */
public class Person{
    private String name;
    private int id;
    public Person() {

    }

    public Person(int id ,String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }


}
