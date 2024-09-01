package A02.ConcreteProducts;

import A02.AbstractProducts.Checkbox;

public class CheckboxA extends Checkbox {

    private String checkboxElement;

    public CheckboxA(String text) {
        checkboxElement = "[ ] " + text;
    }

    @Override
    public void setText(String text) {
        checkboxElement = "[ ] " + text;
    }

    @Override
    public void display() {
        System.out.println(checkboxElement);
    }
}
