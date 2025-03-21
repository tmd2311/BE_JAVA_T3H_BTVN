public class Library implements ILibrary {
    private Book[] books;

    public Library() {
        books = new Book[10];
    }

    @Override
    public void addBook(Book book) {
        if (books[books.length - 1] != null) {
            Book[] newBooks = new Book[books.length * 2];
            for (int i = 0; i < books.length; i++) {
                newBooks[i] = books[i];
            }
            newBooks[books.length] = book;
            return;
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return;
            }
        }
    }

    @Override
    public boolean deleteBook(int id) {
        if (findPosition(id) == -1) {
            System.out.println("Không tồn tại ID: " + id);
            return false;
        }
        deleteByPosition(findPosition(id));
        return true;
    }

    @Override
    public void updateBook(int id, Book bookUpdata) {
        if (findPosition(id) == -1) {
            System.out.println("Không tồn tại ID: " + id);
            return;
        }
        books[findPosition(id)] = bookUpdata;
    }

    @Override
    public Book[] searchBookByAuthor(String author) {
        Book[] result = new Book[books.length];
        int index = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                continue;
            }
            if (books[i].getAuthor().equals(author)) {
                result[index++] = books[i];
            }
        }
        return result;
    }

    @Override
    public void displayAllBooks() {
        for (Book book : books) {
            if (book == null) {
                continue;
            }
            book.displayInfo();
            System.out.println("--------------------");
        }

    }

    @Override
    public int findPosition(int id) {
        if (books == null) {
            return -1;
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    private void deleteByPosition(int position) {
        for (int i = position; i < books.length - 1; i++) {
            books[i] = books[i + 1];
        }
    }
}