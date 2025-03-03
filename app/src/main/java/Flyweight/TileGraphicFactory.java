package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class TileGraphicFactory {
    private static final Map<TileType, TileImage> tileGraphics = new HashMap<>();

    public static TileImage getTileGraphic(TileType type) {
        TileImage image = tileGraphics.get(type);
        if(image == null) {
            switch (type) {
                case FOREST:
                    image = new ForestTileImage("Forest.png", "A dense forest");
                    break;
                case ROAD:
                    image = new RoadTileImage("Road.png", "A dirt road");
                    break;
                case SWAMP:
                    image = new SwampTileImage("Swamp.png", "A murky swamp");
                    break;
                case WATER:
                    image = new WaterTileImage("Water.png", "A body of water");
                    break;
            }
            tileGraphics.put(type, image);
        }
        return image;
    }

}