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
                    tileGraphics.put(type, new ForestTileImage("Forest.png", "A dense forest"));
                    break;
                case ROAD:
                    tileGraphics.put(type, new RoadTileImage("Road.png", "A dirt road"));
                    break;
                case SWAMP:
                    tileGraphics.put(type, new SwampTileImage("Swamp.png", "A murky swamp"));
                    break;
                case WATER:
                    tileGraphics.put(type, new WaterTileImage("Water.png", "A body of water"));
                    break;
            }
        }
        return image;
    }

}