package Command;

public class GenerateCode {
    private PixelArtCursor pixelArtCursor;

    public GenerateCode(PixelArtCursor pixelArtCursor) {
        this.pixelArtCursor = pixelArtCursor;
    }

    public void generate() {
        int[][] grid = pixelArtCursor.getGrid();
        System.out.println("int[][] pixelArt = {");
        for (int i = 0; i < grid.length; i++) {
            System.out.print("    {");
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]);
                if (j < grid[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("}");
            if (i < grid.length - 1) {
                System.out.println(",");
            } else {
                System.out.println();
            }
        }
        System.out.println("};");
    }
}
