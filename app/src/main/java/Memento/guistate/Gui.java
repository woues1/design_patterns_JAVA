package Memento.guistate;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.input.KeyCode;

import java.util.List;

public class Gui extends Application {

    // create a GUI with three adjacent ColorBoxes and one CheckBox below them
    private Controller controller;
    private ColorBox colorBox1;
    private ColorBox colorBox2;
    private ColorBox colorBox3;
    private CheckBox checkBox;

    public void start(Stage stage) {

        controller = new Controller(this);

        // Insets for margin and padding
        Insets insets = new Insets(10, 10, 10, 10);

        // Create three ColorBoxes
        colorBox1 = new ColorBox(1, controller);
        colorBox2 = new ColorBox(2, controller);
        colorBox3 = new ColorBox(3, controller);

        // Create a CheckBox
        checkBox = new CheckBox("Click me!");
        checkBox.setPadding(insets);

        // Add the ColorBoxes and CheckBox to a HBox
        HBox hBox = new HBox(colorBox1.getRectangle(), colorBox2.getRectangle(), colorBox3.getRectangle());
        hBox.setSpacing(10);

        hBox.setMargin(colorBox1.getRectangle(), insets);
        hBox.setMargin(colorBox2.getRectangle(), insets);
        hBox.setMargin(colorBox3.getRectangle(), insets);


        Label label = new Label("Press Ctrl-Z to undo the last change.");
        label.setPadding(insets);

        // create a VBox that contains the HBox and the CheckBox
        Button showHistoryButton = new Button("Show Memento History");
        VBox vBox = new VBox(hBox, checkBox, label, showHistoryButton);
        // call controller when the CheckBox is clicked
        checkBox.setOnAction(event -> {
            controller.setIsSelected(checkBox.isSelected());
        });
        showHistoryButton.setOnAction(event -> {
            showMementoWindow();
        });




        // Set the HBox to be the root of the Scene
        Scene scene = new Scene(vBox);
        scene.setOnKeyPressed(event -> {
            if (event.isControlDown() && event.getCode() == KeyCode.Z) {
                controller.undo();
            } else if (event.isControlDown() && event.getCode() == KeyCode.Y) {
                controller.redo();
            }
        });


        stage.setScene(scene);
        stage.setTitle("Memento Pattern Example");
        stage.show();
    }

    public void updateGui() {
        // called after restoring state from a Memento
        colorBox1.setColor(controller.getOption(1));
        colorBox2.setColor(controller.getOption(2));
        colorBox3.setColor(controller.getOption(3));
        checkBox.setSelected(controller.getIsSelected());
    }

    private void showMementoWindow() {
        Stage mementoStage = new Stage();
        mementoStage.initModality(Modality.APPLICATION_MODAL);
        mementoStage.setTitle("Memento History");

        VBox vBox = new VBox();
        List<IMemento> history = controller.getHistory();
        for (int i = 0; i < Math.min(history.size(), 10); i++) {
            int index = i;
            Memento memento = (Memento) history.get(i);
            String buttonText = String.format("Memento %d - Options: [%d, %d, %d], Selected: %b",
                    i + 1,
                    memento.getOptions()[0],
                    memento.getOptions()[1],
                    memento.getOptions()[2],
                    memento.isSelected());
            Button mementoButton = new Button(buttonText);
            mementoButton.setOnAction(event -> {
                controller.restoreFromHistory(index);
                mementoStage.close();
            });
            vBox.getChildren().add(mementoButton);
        }
        Scene scene = new Scene(vBox, 200, 300);
        mementoStage.setScene(scene);
        mementoStage.show();
        }
}
