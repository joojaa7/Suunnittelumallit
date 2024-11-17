package A17;


import A17.Tiles.Tile;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class TileGui extends Application {

    private final int STAGE_WIDTH = 640;
    private final int STAGE_HEIGHT = 640;
    private final int TILE_SIZE = 32;


    public void start(Stage stage) {

        VBox vBox = new VBox();

        for (int i = STAGE_HEIGHT; i > 0; i -= TILE_SIZE){
            HBox hBox = new HBox();
            for (int j = STAGE_WIDTH; j > 0; j -= TILE_SIZE){
                Tile tileObject = TileGraphicFactory.getTileObject();
                Rectangle tile = tileObject.getTileRender(TILE_SIZE);
                Text text = new Text(tileObject.getType());
                text.setFill(Color.WHITE);
                text.setWrappingWidth(TILE_SIZE);
                StackPane stackPane = new StackPane(tile, text);
                hBox.getChildren().add(stackPane);
            }
            vBox.getChildren().add(hBox);
        }

        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.setTitle("Tile Renderer");
        stage.show();

    }


    private void setTraversed(Rectangle tile, Tile tileObject){
        tile.setOnMouseClicked(e -> {
            tileObject.setTraversed(true);
            tile.setFill(Color.CRIMSON);
        });
    }

}