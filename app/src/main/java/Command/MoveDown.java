package Command;

public class MoveDown {
    private PixelArtCursor cursor;

    public MoveDown(PixelArtCursor cursor) {
        this.cursor = cursor;
    }
    public void move() {
        cursor.moveDown();
    }
}
