package A19.Mediators;

import A19.Colleagues.User;

public interface Mediator {

    void addUser(User user);

    void updateHistory(String message, InterractionType type, String sender, String receiver);


}
