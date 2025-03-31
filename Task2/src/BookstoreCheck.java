import java.util.ArrayList;

public class BookstoreCheck {
    private BookStoreTest bookstore;

    public BookstoreCheck(BookStoreTest bookstore) {
        this.bookstore = bookstore;
    }

    public boolean CheckDuplicate(Book b) {
        ArrayList<Book> books = bookstore.getAllBooks();
        int cnt = 0;
        for(Book book: books) {
            if(b.equals(book)) {
                cnt++;
                if(cnt>1) break;
            }
        }
        return cnt>1;
    }

    public boolean morePages(Book b1, Book b2) {
        return b1.pageCount > b2.pageCount;
    }
}
