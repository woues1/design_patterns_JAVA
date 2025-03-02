// Game.java
package Flyweight;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Game extends Application {
    private Map map = new WildernessMap(20, 20);
    private static final int TILE_SIZE = 80;
    private final int CANVAS_WIDTH = map.getWidth() * TILE_SIZE;
    private final int CANVAS_HEIGHT = map.getHeight() * TILE_SIZE;
    private Canvas canvas = new Canvas(CANVAS_WIDTH, CANVAS_HEIGHT);
    private GraphicsContext gc = canvas.getGraphicsContext2D();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("RPG Map Generator");

        Pane root = new Pane();
        root.getChildren().add(canvas);

        map.generateMap();
        map.render(gc);

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}