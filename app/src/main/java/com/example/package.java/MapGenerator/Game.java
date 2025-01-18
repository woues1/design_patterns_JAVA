package MapGenerator;

public abstract class Game {
    protected CityMap map;

    public abstract CityMap createMap(int width, int height);

    public void play(int width, int height) {
        map = createMap(width, height);
        map.generateMap();
        map.display();
    }
}
