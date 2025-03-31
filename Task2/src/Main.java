import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookStoreTest tester = new BookStoreTest();
        Book[] b_arr = {new Book("Crypto", "Dex", "Dex", 713),
        new Book("Cdl", "Sam", "Crown", 43),
        new Book(".NET", "Microsoft", "IT sector", 532)};
        for(Book b: b_arr) {
            tester.Add(b);
        }

        System.out.println(tester.getBook("Cdl"));
        System.out.println(tester.getBook(2));
        tester.Update(2, tester.getBook(0));
        System.out.println(tester.getBook(2));
        tester.Delete(1);
        System.out.println(tester.CountBooks());
        BookstoreCheck b_check = new BookstoreCheck(tester);
        System.out.println(b_check.morePages(b_arr[0], b_arr[1]));
        tester.Add(new Book(".NET", "Microsoft", "IT sector2", 532));
        System.out.println(b_check.CheckDuplicate(tester.getBook(tester.CountBooks()-1)));

        // Part 2 -----------
        System.out.println("\n----------------------\n");

        Triangle tr1 = new Triangle(2, 5, "blue");
        Circle c1 = new Circle(7, "green");
        //System.out.println(tr1);
        //System.out.println(c1);
        Form[] forms = {tr1, c1};
        for(Form form: forms) {
            System.out.println(form);
            if(form instanceof Circle) {
                ((Circle) form).printCircleDimensions();
            } else if(form instanceof Triangle) {
                ((Triangle) form).printTriangleDimensions();
            }

            // Version 2 without instanceof
            try {
                ((Circle) form).printCircleDimensions();
            } catch (ClassCastException ex) {
                System.out.println("Cannot cast class "+form.getClass()+" to Circle");
            }
        }
    }
}
