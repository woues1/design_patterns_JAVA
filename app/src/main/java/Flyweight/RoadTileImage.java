package Flyweight;

import javafx.scene.image.Image;

public class RoadTileImage implements TileImage {
    private final Image image;
    private String description;

    public RoadTileImage(String img, String desc){
        this.image = new Image(getClass().getResourceAsStream("/" + img));
        this.description = desc;

    }
    @Override
    public char getCharacter() {
        return 'R';
    }

    @Override
    public String getType() {
        return "road";
    }
    @Override
    public Image getImage(){
        return image;
    }
}
