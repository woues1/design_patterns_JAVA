package Flyweight;

import javafx.scene.image.Image;

public class WaterTileImage implements TileImage {
    private final Image image;
    private String description;

    public WaterTileImage(String img, String desc){
        this.image = new Image(getClass().getResourceAsStream("/" + img));
        this.description = desc;
    }

    @Override
    public char getCharacter() {
        return 'W';
    }

    @Override
    public String getType() {
        return "water";
    }

    @Override
    public Image getImage(){
        return image;
    }
}
