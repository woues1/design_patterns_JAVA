package Prototype;

public class RecommendationBuilder {
    private Recommendation rec;

    public RecommendationBuilder() {
        reset();
    }

    public void reset() {
        rec = new Recommendation();
    }

    public void addBook(String author, String title, String genre, String publicationYear) {
        rec.addBook(new Book(author, title, genre, publicationYear));
    }

    public Recommendation getResult() {
        Recommendation builtRec = rec;
        reset();
        return builtRec;
    }
}
