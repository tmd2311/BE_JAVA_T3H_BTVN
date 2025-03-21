public class Library implements ILibrary {
    private Book[] books;
    private int quantity;

    public Library() {
        books = new Book[10];
        quantity = 0;
    }

    @Override
    public void addBook(Book book) {
        if (quantity == books.length) {
            Book[] newBooks = new Book[books.length * 2];
            for (int i = 0; i < quantity; i++) {
                newBooks[i] = books[i];
            }
            newBooks[quantity++] = book;
            return;
        }
        books[quantity++] = book;
    }

    @Override
    public boolean deleteBook(int id) {
        int position =  findPosition(id);
        if (position== -1) {
            System.out.println("Không tồn tại ID: " + id);
            return false;
        }
        deleteByPosition(position);
        return true;
    }

    @Override
    public void updateBook(int id, Book bookUpdata) {
        int position = findPosition(id);
        if (position == -1) {
            System.out.println("Không tồn tại ID: " + id);
            return;
        }
        books[position] = bookUpdata;
    }

    @Override
    public Book[] searchBookByAuthor(String author) {
        Book[] result = new Book[quantity];
        int index = 0;
        for (int i = 0; i < quantity; i++) {
            if (books[i] == null) {
                continue;
            }
            if (books[i].getAuthor().equals(author)) {
                result[index++] = books[i];
            }
        }
        if (index == 0) {
            return null;
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
        for (int i = 0; i < quantity; i++) {
            if (books[i] != null && books[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    private void deleteByPosition(int position) {
        for (int i = position; i < quantity - 1; i++) {
            books[i] = books[i + 1];
        }
        quantity --;
    }
}