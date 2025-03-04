package Prototype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Recommendation implements Cloneable {
    private ArrayList<Book> books;
    private ArrayList<String> favoriteGenres;

    public Recommendation(){
        this.books = new ArrayList<>();
        this.favoriteGenres = new ArrayList<>();
    }
    public void addBook(Book book){
        this.books.add(book);
    }
    public void addFavoriteGenre(String genre){
        this.favoriteGenres.add(genre);
    }

    @Override
    public Recommendation clone() {
        try {
            Recommendation rec = (Recommendation) super.clone();
            rec.books = new ArrayList<>();
            for(Book book : this.books){
                if(favoriteGenres.contains(book.getGenre())) {
                    rec.books.add(book.clone());
                }
            }
            rec.favoriteGenres = new ArrayList<>();
            for(String genre : this.favoriteGenres){
                rec.favoriteGenres.add(genre);
            }
            return rec;
        } catch (CloneNotSupportedException e){
            throw new RuntimeException("Cloning failed", e);
        }

    }

    public void getBooks() {
        for(Book book : this.books){
            System.out.println(book.getAuthor() + " " + book.getTitle() + " " + book.getGenre() + " " + book.getPublicationYear());
        }
    }

    public void removeFavoriteGenre(String removeGenre) {
        this.favoriteGenres.remove(removeGenre);
    }

    public void getFavoriteGenres() {
        for (String genre : this.favoriteGenres){
            System.out.println(genre);
        }
    }
}
