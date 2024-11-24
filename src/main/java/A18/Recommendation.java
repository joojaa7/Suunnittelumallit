package A18;

import java.util.ArrayList;

public class Recommendation implements Cloneable {

    private String targetAudience;

    private ArrayList<Book> books;

    public Recommendation(String targetAudience){
        this.books = new ArrayList<>();
        this.targetAudience = targetAudience;
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public void deleteBook(int index){
        this.books.remove(index - 1);
    }

    public void setTargetAudience(String targetAudience){
        this.targetAudience = targetAudience;
    }

    public ArrayList<Book> getBooks(){
        return this.books;
    }

    @Override
    public Recommendation clone(){
        try {
            Recommendation cRec = (Recommendation) super.clone();
            cRec.books = new ArrayList<>();
            for (Book book: this.books){
                cRec.addBook(book);
            }
            return cRec;
        } catch (CloneNotSupportedException e){
            throw new RuntimeException("Oppa");
        }
    }

    @Override
    public String toString(){
        StringBuilder string = new StringBuilder("Recommended books for ");
        string.append(this.targetAudience);
        string.append(": \n");
        for (Book book : this.books) {
            string.append(book.toString());
            string.append("\n");
        }
        return string.toString();
    }

}
