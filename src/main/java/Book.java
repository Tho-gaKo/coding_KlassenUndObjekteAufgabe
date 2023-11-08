public class Book {

    private String title;

    private String author;

    private int isbn;


    Book() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }




    private String getAuthor() {
        return author;
    }
    private String getTitle() {
        return title;
    }
    private int getIsbn() {
        return isbn;
    }

    public String toString() {
        return author +" "+title  +" "+ isbn;
    }





}
