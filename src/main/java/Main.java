import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Book book3 = new Book();
        book3.setTitle("Guidebook for Hades");
        book3.setAuthor("Supergiant Games");
        book3.setIsbn(814519);
        Book book2 = new Book();
        book2.setTitle("Guidebook for SKUL");
        book2.setAuthor("SOUTHPAW GAMES");
        book2.setIsbn(19102211);
        Book book = new Book();
        book.setTitle("Guidebook for Dead Cells");
        book.setAuthor("Motion Twin");
        book.setIsbn(451435121);
        System.out.println(book);

        Library library = new Library();
        library.setBookArr(new Book[]{book, book2, book3});
        library.getBookArr();
        System.out.println(Arrays.toString(library.getBookArr()));
        System.out.println(library);



        Library library1 = new Library();
        library1.setBookArr(new Book[]{book, book2, book3});

        System.out.println(library1);

    }


}
