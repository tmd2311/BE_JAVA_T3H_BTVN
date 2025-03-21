import java.util.Scanner;

public abstract class Book {


    private int id;
    private String title;
    private int year;
    private String author;
    public Book() {

    }
    public Book(int id) {
        this.id = id;
    }

    public void  displayInfo(){
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
        System.out.println("Author: " + author);
    }
    public  void inputInfo(int id){
        this.id = id;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Title: ");
        title = scanner.nextLine();
        System.out.print("Nhập Year: ");
        year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập Author: ");
        author = scanner.nextLine();
    }
    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }
}
