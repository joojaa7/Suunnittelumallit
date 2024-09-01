package A02.ConcreteProducts;

import A02.AbstractProducts.Button;

public class ButtonA extends Button {

    private String buttonElement;

    public ButtonA(String text) {
        buttonElement = "[__" + text + "__]";
    }

    @Override
    public void setText(String text) {
        buttonElement = "[__" + text + "__]";
    }

    @Override
    public void display() {
        System.out.println(buttonElement);
    }

}
