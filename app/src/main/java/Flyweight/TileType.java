package Flyweight;

import java.util.Random;

public enum TileType {
    SWAMP, WATER, FOREST, ROAD;

    private static final TileType[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static TileType getRandomTile() {
        return VALUES[RANDOM.nextInt(SIZE)];
    }
}
