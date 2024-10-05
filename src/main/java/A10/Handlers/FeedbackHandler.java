package A10.Handlers;

import A10.CustomerMessage;

public class FeedbackHandler extends RequestHandler{

    @Override
    public void handleMessage(CustomerMessage customerMessage){
        if (customerMessage.getMessageType().equals(Message.FEEDBACK)){
            System.out.println("Thank you for your feedback.");
            System.out.println("Feedback: " + customerMessage.getMessage());
            System.out.println("Message deleted.");
        }
        else {
            this.getNextRequestHandler().handleMessage(customerMessage);
        }
    }

}
