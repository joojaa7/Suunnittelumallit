package A02.ConcreteFactory;

import A02.AbstractProducts.*;
import A02.ConcreteProducts.*;
import A02.UIFactory;

public class FactoryB extends UIFactory {

    public Checkbox createCheckbox(String text) {
        return new CheckboxB(text);
    }

    public TextField createTextField(String text){
        return new TextFieldB(text);
    }

    public Button createButton(String text) {
        return new ButtonB(text);
    }
}
