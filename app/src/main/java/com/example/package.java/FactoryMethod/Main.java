package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Game game = new Game() {
            @Override
            public WildernessMap createMap(int width, int height) {
                return new WildernessMap(width, height);
            }
        };
        game.play(10, 10); // Example dimensions
    }
}
