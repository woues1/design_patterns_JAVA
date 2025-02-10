// WildernessMap.java
package FactoryMethod;

public class WildernessMap extends Map {

    public WildernessMap(int width, int height) {
        super(width, height);
    }

    @Override
    Tile createTile() {
        int rand = random.nextInt(3);
        switch (rand) {
            case 0: return new SwampTile();
            case 1: return new WaterTile();
            case 2: return new ForestTile();
            default: return new SwampTile();
        }
    }
}
