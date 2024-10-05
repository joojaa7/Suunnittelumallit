package A10.Handlers;

import A10.CustomerMessage;

public class RequestHandler {

    private RequestHandler nextRequestHandler;

    public void handleMessage(CustomerMessage customerMessage){
        if (nextRequestHandler != null){
            nextRequestHandler.handleMessage(customerMessage);
        }
    }

    public void setNextRequestHandler(RequestHandler nextRequestHandler) {
        this.nextRequestHandler = nextRequestHandler;
    }

    public RequestHandler getNextRequestHandler(){
        return nextRequestHandler;
    }
}
