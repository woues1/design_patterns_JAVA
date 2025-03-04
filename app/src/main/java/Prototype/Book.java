package Prototype;

public class Book implements Cloneable {
    private String author;
    private String title;
    private String genre;
    private String publicationYear;

    public Book(String author, String title, String genre, String publicationYear) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.publicationYear = publicationYear;
    }
    public Book clone(){
        try {
            return (Book) super.clone();
        } catch (CloneNotSupportedException e){
            throw new RuntimeException("Cloning failed", e);
        }
    }

    public String getAuthor(){
        return this.author;
    }
    public String getTitle(){
        return this.title;
    }
    public String getGenre(){
        return this.genre;
    }
    public String getPublicationYear() {
        return this.publicationYear;
    }
}
