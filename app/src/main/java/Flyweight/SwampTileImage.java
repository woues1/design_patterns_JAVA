package Flyweight;

import javafx.scene.image.Image;

public class SwampTileImage implements TileImage {
    private final Image image;
    private String description;

    public SwampTileImage(String img, String desc){
        this.image = new Image(getClass().getResourceAsStream("/" + img));
        this.description = desc;
    }

    @Override
    public char getCharacter() {
        return 'S';
    }

    @Override
    public String getType() {
        return "swamp";
    }

    @Override
    public Image getImage() {
        return image;
    }
}