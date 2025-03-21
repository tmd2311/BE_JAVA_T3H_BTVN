import java.lang.reflect.Array;

public interface ILibrary {
    void addBook(Book book);
    boolean deleteBook(int id);
    void updateBook(int id ,Book bookUpdata);
    Book[] searchBookByAuthor(String author);
    void displayAllBooks();
    int findPosition(int id);
}
