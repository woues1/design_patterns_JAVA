package Command;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUI extends Application {
    private PixelArtCursor pixelArtCursor;
    private GridPane gridPane;
    private Command moveCursorRight;
    private Command moveCursorLeft;
    private Command moveCursorUp;
    private Command moveCursorDown;
    private Command toggleColorCommand;
    private Command generateCodeCommand;

    @Override
    public void start(Stage primaryStage) {
        this.pixelArtCursor = new PixelArtCursor();
        this.gridPane = new GridPane();
        setupCommands();
        setupGUI(primaryStage);
    }

    private void setupCommands() {
        MoveRight moveRight = new MoveRight(pixelArtCursor);
        MoveLeft moveLeft = new MoveLeft(pixelArtCursor);
        MoveUp moveUp = new MoveUp(pixelArtCursor);
        MoveDown moveDown = new MoveDown(pixelArtCursor);
        ToggleColor toggleColor = new ToggleColor(pixelArtCursor);
        GenerateCode generateCode = new GenerateCode(pixelArtCursor);


        generateCodeCommand = new GenerateCodeCommand(generateCode);
        moveCursorRight = new MoveCursorRightCommand(moveRight);
        moveCursorLeft = new MoveCursorLeftCommand(moveLeft);
        moveCursorUp = new MoveCursorUpCommand(moveUp);
        moveCursorDown = new MoveCursorDownCommand(moveDown);
        toggleColorCommand = new ToggleColorCommand(toggleColor);
    }

    private void setupGUI(Stage primaryStage) {
        VBox root = new VBox();
        Button createCodeButton = new Button("Create Code");
        createCodeButton.setOnMouseClicked(event -> {
            generateCodeCommand.execute();
        });
        createCodeButton.setFocusTraversable(false);
        root.getChildren().add(createCodeButton);


        root.getChildren().add(gridPane);

        Scene scene = new Scene(root, 400, 400);
        scene.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case RIGHT -> moveCursorRight.execute();
                case LEFT -> moveCursorLeft.execute();
                case UP -> moveCursorUp.execute();
                case DOWN -> moveCursorDown.execute();
                case SPACE -> toggleColorCommand.execute();
            }
            updateGridView();
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void updateGridView() {
        gridPane.getChildren().clear();
        int[][] grid = pixelArtCursor.getGrid();
        int cursorRow = pixelArtCursor.getRow();
        int cursorCol = pixelArtCursor.getCol();

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Pane cell = new Pane();
                cell.setPrefSize(50, 50);
                String bg;
                if (row == cursorRow && col == cursorCol) {
                    bg = "lightgray";
                } else {
                    bg = (grid[row][col] == 1) ? "black" : "white";
                }
                cell.setStyle("-fx-border-color: black; -fx-background-color: " + bg + ";");
                gridPane.add(cell, col, row);
            }
        }
    }

}