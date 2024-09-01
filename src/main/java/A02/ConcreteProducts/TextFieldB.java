package A02.ConcreteProducts;

import A02.AbstractProducts.TextField;

public class TextFieldB extends TextField {

    private String textfieldElement;

    public TextFieldB(String text) {
        textfieldElement = "//__ Text for " + text + " __//";
    }

    @Override
    public void setText(String text) {
        textfieldElement = "//__ Text for " + text + " __//";
    }

    @Override
    public void display() {
        System.out.println(textfieldElement);
    }
}
