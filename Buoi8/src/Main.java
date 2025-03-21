import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ILibrary library = new Library();
        int choice;
        int id;
        int type;

        do {
            System.out.println("1. Add Book");
            System.out.println("2. Update Book");
            System.out.println("3. Delete Book");
            System.out.println("4. Search By Author");
            System.out.println("5. Display All Books");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter type (1: BusinessBook, 2: ScienceBook): ");
                    type = scanner.nextInt();
                    do {
                        System.out.println("Nhập ID: ");
                        id = scanner.nextInt();
                        if (library.findPosition(id) != -1) {
                            System.out.println("Đã tồn tại ID: " + id);
                        }
                    }while (library.findPosition(id) != -1);

                    if (type == 1) {
                        SachKinhDoanh sachKinhDoanh = new SachKinhDoanh();
                        sachKinhDoanh.inputInfo(id);
                        library.addBook(sachKinhDoanh);
                        break;
                    }
                    SachKhoaHoc sachKhoaHoc = new SachKhoaHoc();
                    sachKhoaHoc.inputInfo(id);
                    library.addBook(sachKhoaHoc);
                    break;
                case 2:
                    System.out.println("Enter type (1: BusinessBook, 2: ScienceBook): ");
                    type = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập ID: ");
                    id =id = scanner.nextInt();
                    if (library.findPosition(id) == -1) {
                        System.out.println("Không tìm thấy sách có ID: " + id);
                        break;
                    }
                    if (type == 1) {
                        SachKinhDoanh sachKinhDoanh = new SachKinhDoanh();
                        sachKinhDoanh.inputInfo(id);
                        library.updateBook(id, sachKinhDoanh);
                        break;
                    }
                    SachKhoaHoc sachKhoaHocUpdate = new SachKhoaHoc();
                    sachKhoaHocUpdate.inputInfo(id);
                    library.updateBook(id,sachKhoaHocUpdate);
                    break;
                case 3:
                    System.out.print("Enter Book ID to delete: ");
                    int deleteId = scanner.nextInt();
                    if(library.deleteBook(deleteId)){
                        System.out.println("Xóa thành công");
                        break;
                    }
                    System.out.println("Không thể xóa");

                    break;
                case 4:
                    System.out.print("Enter Author Name: ");
                    String searchAuthor = scanner.nextLine();
                    Book[] books = library.searchBookByAuthor(searchAuthor);
                    if (books == null) {
                        System.out.println("Không tìm thấy ");
                        break;
                    }
                    System.out.println("Danh sách sách có tác giả "+ searchAuthor + "là: ");
                    for (Book book : books){
                        if(book == null) continue;
                        book.displayInfo();
                    }
                    break;
                case 5:
                    library.displayAllBooks();
                    break;
                default:{
                    System.out.println("Giá trị nhập vào không hợp lệ");
                    break;
                }
            }
        } while (choice != 0);
    }


}