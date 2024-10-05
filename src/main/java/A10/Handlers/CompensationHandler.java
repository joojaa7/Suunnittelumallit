package A10.Handlers;

import A10.CustomerMessage;
import A10.Message;

import java.util.Random;

public class CompensationHandler extends RequestHandler{

    private final Random random = new Random();

    @Override
    public void handleMessage(CustomerMessage customerMessage){
        if (customerMessage.getMessageType().equals(Message.COMPENSATION)){
            System.out.println("Reviewing compensation claim...");
            int coinflip = random.nextInt(2);
            if (coinflip > 100){
                System.out.println("Compensation approved.");
            }
            else {
                System.out.println("Compensation denied for: ");
                System.out.println(customerMessage.getMessage());
            }
        }
        else {
            this.getNextRequestHandler().handleMessage(customerMessage);
        }
    }

}
