package A02;

import A02.AbstractProducts.Button;
import A02.AbstractProducts.Checkbox;
import A02.AbstractProducts.TextField;

public abstract class UIFactory {

    public abstract Checkbox createCheckbox(String text);

    public abstract Button createButton(String text);

    public abstract TextField createTextField(String text);

}
