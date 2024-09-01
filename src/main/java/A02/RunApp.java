package A02;

import A02.AbstractProducts.*;
import A02.ConcreteFactory.*;

public class RunApp {

    public static void main (String[] args) {

        UIFactory uiFactory = new FactoryA();
        Button button = uiFactory.createButton("Click here");
        TextField textField = uiFactory.createTextField("tests.");
        Checkbox checkbox = uiFactory.createCheckbox("Confirm by clicking.");
        button.display();
        textField.display();
        checkbox.display();
        System.out.println();

        button.setText("Jahuu");
        textField.setText("Bahuu");
        checkbox.setText("Jippii");

        button.display();
        textField.display();
        checkbox.display();


    }

}
