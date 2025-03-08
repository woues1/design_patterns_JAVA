package Command;

public class MoveUp {
    private PixelArtCursor cursor;

    public MoveUp(PixelArtCursor cursor) {
        this.cursor = cursor;
    }
    public void move() {
        cursor.moveUp();
    }
}
