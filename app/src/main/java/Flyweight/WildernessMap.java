
package Flyweight;

public class WildernessMap extends Map {
    public WildernessMap(int width, int height) {
        super(width, height);
    }

    @Override
    Tile createTile() {
        TileType randomTileType = TileType.getRandomTile();
        System.out.println(randomTileType);
        TileImage tileImage = TileGraphicFactory.getTileGraphic(randomTileType);
        System.out.println(tileImage.getImage());
        return new Tile(tileImage);
    }

    @Override
    public void generateMap() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                tiles[i][j] = createTile();
            }
        }
    }
}