package MapGenerator;

public class Main {
    public static void main(String[] args) {
        Game game = new Game() {
            @Override
            public CityMap createMap(int width, int height) {
                return new CityMap(width, height);
            }
        };
        game.play(10, 10); // Example dimensions
    }
}
