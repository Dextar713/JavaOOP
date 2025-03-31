import java.util.Locale;
import java.util.Objects;

public class Book {
    public String title;
    public String author;
    public String publisher;
    int pageCount;

    public Book(String title, String author, String publisher, int pageCount) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pageCount = pageCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pageCount == book.pageCount && Objects.equals(title, book.title)
                && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, pageCount);
    }

    public String toString() {
        return "Book Title: " + this.title.toUpperCase(Locale.ROOT) + "\nBook author: " + this.author
                + "\nBook publisher: " + this.publisher.toLowerCase(Locale.ROOT)
                + "\n-------------------";
    }
}


