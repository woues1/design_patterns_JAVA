// Map.java
package Flyweight;

import javafx.scene.canvas.GraphicsContext;

import java.util.Random;

public abstract class Map {
    protected Tile[][] tiles;
    protected int width;
    protected int height;
    protected Random random = new Random();

    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        this.tiles = new Tile[width][height];
    }

    abstract Tile createTile();

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void render(GraphicsContext gc) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Tile tile = tiles[i][j];
                System.out.println(tile.getTileImage().getImage());
                //gc.drawImage(tile.getTileImage().getImage(), i * 32, j * 32);
            }
        }
    }

    public void generateMap() {
    }
}