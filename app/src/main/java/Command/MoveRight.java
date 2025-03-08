package Command;

public class MoveRight {
    private PixelArtCursor cursor;

    public MoveRight(PixelArtCursor cursor) {
        this.cursor = cursor;
    }

    public void move() {
        cursor.moveRight();
    }
}
