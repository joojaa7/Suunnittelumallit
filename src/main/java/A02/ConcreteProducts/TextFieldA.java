package A02.ConcreteProducts;

import A02.AbstractProducts.TextField;

public class TextFieldA extends TextField {

    private String textfieldElement;

    public TextFieldA(String text) {
        textfieldElement = "Text for " + text + " :";
    }

    @Override
    public void setText(String text) {
        textfieldElement = "Text for " + text + " :";
    }

    @Override
    public void display() {
        System.out.println(textfieldElement);
    }
}
