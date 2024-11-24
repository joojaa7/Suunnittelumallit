package A19;

import A19.Colleagues.Client;
import A19.Colleagues.User;
import A19.Mediators.MessageMediator;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;


public class MediatorGui extends Application {

    private final MessageMediator messageMediator = new MessageMediator();

    public void start(Stage stage) {
        new Client("Fred", messageMediator);
        new Client("George", messageMediator);
        new Client("Velma", messageMediator);

        List<User> users = messageMediator.getUsers();
        for (User user : users){
            for (User u : users) {
                if (u != user) {
                    user.getUsers().getItems().addAll(u.getUsername());
                }
            }
            Scene newWindow = createScene(user);
            Stage newStage = new Stage();
            newStage.setTitle(user.getUsername());
            newStage.setScene(newWindow);
            newStage.show();
        }

    }

    private Scene createScene(User user){
        VBox vBox = new VBox();
        vBox.getChildren().addAll(user.getMessages(), user.getMessageToSend(), user.getUsers(), user.getSendButton());
        return new Scene(vBox, 300, 300);
    }



}
