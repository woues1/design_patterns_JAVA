package FactoryMethod;

public abstract class Game {
    protected Map map;

    public abstract Map createMap(int width, int height);

    public void play(int width, int height) {
        map = createMap(width, height);
        map.generateMap();
        map.display();
    }
}
