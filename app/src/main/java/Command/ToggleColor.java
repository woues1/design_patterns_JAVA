package Command;

public class ToggleColor {
    private PixelArtCursor cursor;

    public ToggleColor(PixelArtCursor cursor) {
        this.cursor = cursor;
    }

    public void toggle() {
        cursor.toggleColor();
    }
}
