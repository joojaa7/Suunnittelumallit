package A19.Colleagues;

import A19.Mediators.InterractionType;
import A19.Mediators.Mediator;
import A19.Mediators.MessageMediator;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class User {

    private final String username;
    private final Text messages;
    private final TextField messageToSend;
    private final ListView<String> users;
    private final Button sendButton;
    private final Mediator messageMediator;

    public User(String username, MessageMediator messageMediator){
        this.username = username;
        this.messageMediator = messageMediator;
        this.messages = new Text();
        this.messageToSend = new TextField();
        this.users = new ListView<>();
        this.sendButton = new Button("Send");
        messageMediator.addUser(this);

        this.sendButton.setOnAction(e -> {
            // Send message
            updateMessages(this.messageToSend.getText(), InterractionType.RECEIVER, this.username, this.users.getSelectionModel().getSelectedItem());
            // Receive message
            updateMessages(this.messageToSend.getText(), InterractionType.SENDER, this.username, this.users.getSelectionModel().getSelectedItem());
        });
    }

    private void updateMessages(String message, InterractionType type, String sender, String receiver){
        messageMediator.updateHistory(message, type, sender, receiver);
    };


}
