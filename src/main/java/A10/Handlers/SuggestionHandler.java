package A10.Handlers;

import A10.CustomerMessage;

public class SuggestionHandler extends RequestHandler{

    @Override
    public void handleMessage(CustomerMessage customerMessage){
        if (customerMessage.getMessageType().equals(Message.SUGGESTION)){
            System.out.println("Message has been logged.");
            System.out.println("Suggestion has been ignored.");
        }
        else {
            this.getNextRequestHandler().handleMessage(customerMessage);
        }
    }

}
