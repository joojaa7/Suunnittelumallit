package A10;

import A10.Handlers.*;

public class Main {

    public static void main(String[] args){

        RequestHandler compensationHandler = new CompensationHandler();
        RequestHandler contactRequestHandler = new ContactRequestHandler();
        RequestHandler suggestionHandler = new SuggestionHandler();
        RequestHandler feedbackHandler = new FeedbackHandler();

        CustomerMessage compensationMessage = new CustomerMessage(Message.COMPENSATION, "Juoma maistui pahalta, haluan rahani takaisin!");
        CustomerMessage contactRequestMessage = new CustomerMessage(Message.CONTACT_REQUEST, "Tarvitsen apua.");
        CustomerMessage suggestionMessage = new CustomerMessage(Message.SUGGESTION, "Teidän pitäisi lukea minun yhteydenottopyyntöni");
        CustomerMessage feedbackMessage = new CustomerMessage(Message.FEEDBACK, "Hyvä applikaatio.");

        compensationHandler.setNextRequestHandler(contactRequestHandler);
        contactRequestHandler.setNextRequestHandler(suggestionHandler);
        suggestionHandler.setNextRequestHandler(feedbackHandler);

        compensationHandler.handleMessage(compensationMessage);
        compensationHandler.handleMessage(contactRequestMessage);
        compensationHandler.handleMessage(suggestionMessage);
        compensationHandler.handleMessage(feedbackMessage);

    }

}
