package Prototype;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Director director = new Director();
        RecommendationBuilder builder = new RecommendationBuilder();
        director.constructRecommendation(builder);
        Recommendation rec = builder.getResult();

        Scanner scanner = new Scanner(System.in);

        String t = "";
        while(!t.equals("q")){
            System.out.println("\nEnter 1 to add a book, 2 to add favorite genre, 3 to show favorite genres, 4 to remove favorite genre, 5 to get recommendation, q to quit\n");
            t = scanner.nextLine();
            switch (t){
                case "1":
                    System.out.println("Enter the author of the book:");
                    String author = scanner.nextLine();
                    System.out.println("Enter the title of the book:");
                    String title = scanner.nextLine();
                    System.out.println("Enter the genre of the book:");
                    String genre = scanner.nextLine();
                    System.out.println("Enter the publication year of the book:");
                    String publicationYear = scanner.nextLine();
                    rec.addBook(new Book(author, title, genre, publicationYear));
                    break;
                case "2":
                    System.out.println("Add favorite genre:");
                    String favorite_genre = scanner.nextLine();
                    rec.addFavoriteGenre(favorite_genre);
                    break;
                case "3":
                    System.out.println("Show favorite genres:");
                    rec.getFavoriteGenres();
                    break;
                case "4":
                    System.out.println("Remove favorite genre:");
                    String remove_genre = scanner.nextLine();
                    rec.removeFavoriteGenre(remove_genre);
                    break;
                case "5":
                    System.out.println("Recommendation:");
                    Recommendation rec_clone = rec.clone();
                    rec_clone.getBooks();
                    break;
            }
        }

    }
}
