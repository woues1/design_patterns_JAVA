package Flyweight;
import javafx.scene.image.Image;

public class ForestTileImage implements TileImage {
    private final Image image;
    private String description;
    public ForestTileImage(String img, String desc){
        this.image = new Image(getClass().getResourceAsStream("/" + img));
        this.description = desc;
    }

    @Override
    public char getCharacter() {
        return 'F';
    }

    @Override
    public String getType() {
        return "forest";
    }

    @Override
    public Image getImage(){
        return image;
    }
}
