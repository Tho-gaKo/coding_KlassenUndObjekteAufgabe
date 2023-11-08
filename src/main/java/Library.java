import java.util.Arrays;

public class Library {

    private Book[] bookArr;

    public void setBookArr(Book[] books) {
        this.bookArr = books;
    }
    public Book[] getBookArr() {
        return bookArr;
    }
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(bookArr) +
                '}';

    }


}
