package Command;

public class MoveLeft {
    private PixelArtCursor cursor;

    public MoveLeft(PixelArtCursor cursor) {
        this.cursor = cursor;
    }

    public void move() {
        cursor.moveLeft();
    }

}
