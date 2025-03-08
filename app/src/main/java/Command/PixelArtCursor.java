package Command;

public class PixelArtCursor {
    private int[][] grid;
    private int row;
    private int col;

    public PixelArtCursor() {
        this.grid = new int[8][8];
        this.row = 0;
        this.col = 0;
    }

    public void moveRight() {
        if (col < 7) {
            col++;
        }
    }

    public void moveLeft() {
        if (col > 0) {
            col--;
        }
    }

    public void moveUp() {
        if (row > 0) {
            row--;
        }
    }

    public void moveDown() {
        if (row < 7) {
            row++;
        }
    }

    public void toggleColor() {
        grid[row][col] = grid[row][col] == 0 ? 1 : 0;
    }

    public int[][] getGrid() {
        return grid;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }


}