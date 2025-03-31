import java.util.ArrayList;
import java.util.Objects;

public class BookStoreTest {
    private ArrayList<Book> books;

    public BookStoreTest() {
        books = new ArrayList<>();
    }

    public void Add(Book b) {
        books.add(b);
    }

    public void Delete(int id) {
        books.remove(id);
    }

    public Book getBook(String title) {
        for(Book b: books) {
            if(Objects.equals(b.title, title)) {
                return b;
            }
        }
        return null;
    }

    public Book getBook(int id) {
        return books.size() > id ? books.get(id) : null;
    }

    public ArrayList<Book> getAllBooks() {
        return books;
    }

    public void Update(int id, Book newBook) {
        books.get(id).title =  newBook.title;
        books.get(id).author =  newBook.author;
        books.get(id).publisher =  newBook.publisher;
        books.get(id).pageCount =  newBook.pageCount;
    }

    public int CountBooks() {
        return books.size();
    }
}
