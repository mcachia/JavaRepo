package HomeWork.Store;

/**
 * Created by mcachia on 06/01/2016.
 */
public class Book extends Item {
    String author;
    String genre;

    private Book(String author) {
        setAuthor(author);
    }

    public Book(String author, String genre) {
        this.author = author;
        this.genre = genre;
    }

    @Override
    public void sell() {
        sell(1);
        System.out.println("Book was sold.");
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


}
