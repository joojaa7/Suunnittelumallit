package A10;

import A10.Handlers.Message;

public class CustomerMessage {

    private final Message messageType;

    private final String message;


    public CustomerMessage(Message messageType, String message){
        this.messageType = messageType;
        this.message = message;
    }

    public Message getMessageType() {
        return messageType;
    }

    public String getMessage() {
        return message;
    }
}
