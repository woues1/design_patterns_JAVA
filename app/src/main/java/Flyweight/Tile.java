
package Flyweight;

public class Tile {
    private final TileImage tileImage;

    public Tile(TileImage tileImage) {
        this.tileImage = tileImage;
    }

    public TileImage getTileImage() {
        return tileImage;
    }
}