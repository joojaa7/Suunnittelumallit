package A19.Mediators;

import A19.Colleagues.User;

import java.util.ArrayList;
import java.util.List;

public class MessageMediator implements Mediator {

    private final List<User> users;

    public MessageMediator(){
        this.users = new ArrayList<>();
    }

    public List<User> getUsers() {
        return users;
    }

    @Override
    public void addUser(User user){
        this.users.add(user);
    }

    @Override
    public void updateHistory(String message, InterractionType type, String sender, String receiver){
        User messageSender = null;
        User messageReceiver = null;
        for (User u : users){
            if (u.getUsername().equalsIgnoreCase(sender)){
                messageSender = u;
            }
            if (u.getUsername().equalsIgnoreCase(receiver)){
                messageReceiver = u;
            }
        }
        if (messageSender != null && messageReceiver != null){
            if (type == InterractionType.RECEIVER) {
                messageSender.getMessages().setText(
                        messageSender.getMessages().getText() +
                        message + " " + type + ": " + messageReceiver.getUsername() + "\n");
            }
            if (type == InterractionType.SENDER){
                messageReceiver.getMessages().setText(
                        messageReceiver.getMessages().getText() +
                        message + " " + type + ": " + messageSender.getUsername() + "\n");
            }
        }
    }

}
