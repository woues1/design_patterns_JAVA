package Prototype;

public class Director {
    public void constructRecommendation(RecommendationBuilder builder) {
        builder.addBook("J.K. Rowling", "Harry Potter and the Sorcerer's Stone", "Fantasy", "1997");
        builder.addBook("Suzanne Collins", "The Hunger Games", "Dystopian", "2008");
        builder.addBook("George Orwell", "1984", "Dystopian", "1949");
        builder.addBook("J.R.R. Tolkien", "The Hobbit", "Fantasy", "1937");
        builder.addBook("Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides", "Design Patterns", "Computer Science", "1994");


    }


}
