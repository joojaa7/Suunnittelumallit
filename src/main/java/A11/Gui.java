package A11;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.input.KeyCode;

import java.util.*;

public class Gui extends Application {

    // create a GUI with three adjacent ColorBoxes and one CheckBox below them
    private Controller controller;
    private ColorBox colorBox1;
    private ColorBox colorBox2;
    private ColorBox colorBox3;
    private CheckBox checkBox;
    private  Button historyButton;
    private HBox historyBox;
    private ListView<HBox> history;
    private ColorBox[] colorBoxes;

    public void start(Stage stage) {

        controller = new Controller(this);

        // Insets for margin and padding
        Insets insets = new Insets(10, 10, 10, 10);

        // Create three ColorBoxes
        colorBox1 = new ColorBox(1, controller);
        colorBox2 = new ColorBox(2, controller);
        colorBox3 = new ColorBox(3, controller);
        colorBoxes = new ColorBox[]{colorBox1, colorBox2, colorBox3};

        // Create a CheckBox
        checkBox = new CheckBox("Click me!");
        checkBox.setPadding(insets);

        historyButton =  new Button("History");
        historyBox = new HBox(historyButton);
        historyBox.setAlignment(Pos.CENTER);
        historyButton.setOpacity(0.8);


        // Add the ColorBoxes and CheckBox to a HBox
        HBox hBox = new HBox(colorBox1.getRectangle(), colorBox2.getRectangle(), colorBox3.getRectangle());
        hBox.setSpacing(10);

        hBox.setMargin(colorBox1.getRectangle(), insets);
        hBox.setMargin(colorBox2.getRectangle(), insets);
        hBox.setMargin(colorBox3.getRectangle(), insets);


        Label label = new Label("Press Ctrl-Z to undo the last change.");
        label.setPadding(insets);

        VBox vBox = new VBox(hBox, checkBox, historyBox, label);
        checkBox.setOnAction(event -> {
            controller.setIsSelected(checkBox.isSelected());
        });

        // Set the HBox to be the root of the Scene
        Scene scene = new Scene(vBox);
        scene.setOnKeyPressed(event -> {
            if (event.isControlDown() && event.getCode() == KeyCode.Z) {
                System.out.println("Undo key combination pressed");
                controller.undo();
            }
            if (event.isControlDown() && event.getCode() == KeyCode.Y) {
                System.out.println("Redo key combination pressed");
                controller.redo();
            }
        });
        historyButton.setOnMouseClicked(e -> {
            openHistory(controller.getHistory());
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

    private void openHistory(LinkedHashMap<Date, String> savedStates){
        history = new ListView<>();
        savedStates.forEach((date, options) -> {
            HBox historyHBox = new HBox(8);
            Text dateText = new Text(String.valueOf(date));
            Text optionsText = new Text(options);
            historyHBox.getChildren().addAll(dateText, optionsText);
            historyHBox.setOnMouseClicked(e -> setColoursFromHistory(options));
            history.getItems().addAll(historyHBox);
            double rowWidth = dateText.getLayoutBounds().getWidth() + optionsText.getLayoutBounds().getWidth() + 24;
            history.setPrefWidth(rowWidth);
        });
        Scene scene = new Scene(history);
        Stage stage = new Stage();
        stage.setTitle("History");
        stage.setScene(scene);
        stage.show();
    }

    private void setColoursFromHistory(String options){
        String[] s = options.split(" ");
        for (int i = 0; i < s.length; i++){
            int index = 0;
            switch (s[i]){
                case "Red":
                    break;
                case "Blue":
                    index = 1;
                    break;
                case "Yellow":
                    index = 2;
                    break;
                default:
                    throw new IllegalArgumentException("Woopsie");
            }
            colorBoxes[i].setColor(index);
        }
    }
}