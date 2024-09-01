package A02.ConcreteProducts;

import A02.AbstractProducts.Checkbox;

public class CheckboxB extends Checkbox {

    private String checkboxElement;

    public CheckboxB(String text) {
        checkboxElement = "//__// " + text;
    }

    @Override
    public void setText(String text) {
        checkboxElement = "//__// " + text;
    }

    @Override
    public void display() {
        System.out.println(checkboxElement);
    }
}
