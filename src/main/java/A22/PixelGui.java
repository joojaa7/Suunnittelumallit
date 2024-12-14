package A22;

import A22.Commands.*;
import A22.Receivers.Movement;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PixelGui extends Application {

    private final int PIXEL_SCALE = 100;
    private final int PIXEL_AMOUNT = 8;
    private int CURSOR_X = 1;
    private int CURSOR_Y = 1;
    private VBox vBox;


    public void start(Stage stage) {

        Invoker invoker = getInvoker();
        vBox = new VBox();

        for (int i = 0; i < PIXEL_AMOUNT; i++){
            HBox hBox = new HBox();
            for (int j = 0; j < PIXEL_AMOUNT; j++){
                Rectangle pixel = new Rectangle(PIXEL_SCALE, PIXEL_SCALE);
                pixel.setFill(Color.WHITE);
                hBox.getChildren().add(pixel);
            }
            vBox.getChildren().add(hBox);
        }

        // Initialize cursor
        HBox row = (HBox) vBox.getChildren().get(CURSOR_Y);
        Rectangle rec = (Rectangle) row.getChildren().get(CURSOR_X);
        rec.setFill(Color.GREEN);

        //Initialize scene and keypress events.
        Scene scene = new Scene(vBox, PIXEL_AMOUNT * PIXEL_SCALE, PIXEL_AMOUNT * PIXEL_SCALE);
        scene.addEventHandler(KeyEvent.KEY_PRESSED, key -> {
            switch (key.getCode()) {
                case LEFT -> invoker.left();
                case UP -> invoker.up();
                case RIGHT -> invoker.right();
                case DOWN -> invoker.down();
                case SPACE -> invoker.togglePixel();
                case ENTER -> invoker.generateCode();
            }
        });


        stage.setScene(scene);
        stage.setTitle("PixelArt");
        stage.show();

    }

    // Initialize invoker
    private Invoker getInvoker() {
        Movement receiver = new Movement(this, CURSOR_Y, CURSOR_X, PIXEL_AMOUNT);
        Command left = new MoveCursorLeftCommand(receiver);
        Command up = new MoveCursorUpCommand(receiver);
        Command right = new MoveCursorRightCommand(receiver);
        Command down = new MoveCursorDownCommand(receiver);
        Command togglePixel = new TogglePixelCommand(receiver);
        Command generate = new GenerateCodeCommand(receiver);

        return new Invoker(left, up, right, down, togglePixel, generate);
    }

    public void moveCursor(int x, int y){
        HBox row = (HBox) vBox.getChildren().get(CURSOR_Y);
        Rectangle rec = (Rectangle) row.getChildren().get(CURSOR_X);
        // Only clear the previous pixel if it wasn't toggled.
        if (rec.getFill().equals(Color.GREEN)) {
            rec.setFill(Color.WHITE);
        }

        row = (HBox) vBox.getChildren().get(y);
        rec = (Rectangle) row.getChildren().get(x);
        // If cursor goes on toggled pixel
        if (!rec.getFill().equals(Color.BLACK)){
            rec.setFill(Color.GREEN);
        }

        CURSOR_X = x;
        CURSOR_Y = y;
    }

    public void togglePixel(){
        HBox row = (HBox) vBox.getChildren().get(CURSOR_Y);
        Rectangle rec = (Rectangle) row.getChildren().get(CURSOR_X);
        // Clear pixel
        if (rec.getFill().equals(Color.BLACK)){
            rec.setFill(Color.GREEN);
        }
        else {
            rec.setFill(Color.BLACK);
        }

    }

}