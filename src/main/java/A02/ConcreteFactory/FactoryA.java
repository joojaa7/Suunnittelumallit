package A02.ConcreteFactory;

import A02.AbstractProducts.*;
import A02.ConcreteProducts.*;
import A02.UIFactory;

public class FactoryA extends UIFactory {


    public Checkbox createCheckbox(String text) {
        return new CheckboxA(text);
    }

    public TextField createTextField(String text){
        return new TextFieldA(text);
    }

    public Button createButton(String text) {
        return new ButtonA(text);
    }

}
