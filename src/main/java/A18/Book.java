package A18;

public class Book implements Cloneable{

    private final String author, title, genre;

    public Book(String author, String title, String genre){
        this.author = author;
        this.genre = genre;
        this.title = title;
    }

    @Override
    public Book clone(){
        try {
            return (Book) super.clone();
        } catch (CloneNotSupportedException e){
            throw new RuntimeException("Clone oopsie woopsie.");
        }
    }

    @Override
    public String toString(){
        return title + ", " + genre + ". " + author + ".";
    }
}
