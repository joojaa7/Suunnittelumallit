package A10.Handlers;

import A10.CustomerMessage;
import A10.Message;

public class ContactRequestHandler extends RequestHandler{

    @Override
    public void handleMessage(CustomerMessage customerMessage){
        if (customerMessage.getMessageType().equals(Message.CONTACT_REQUEST)){
            System.out.println("Contact request message: " + customerMessage.getMessage());
            System.out.println("Contact request is being forwarded.");
        }
        else {
            this.getNextRequestHandler().handleMessage(customerMessage);
        }
    }

}
