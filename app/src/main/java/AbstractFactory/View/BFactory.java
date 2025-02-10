package AbstractFactory.View;

import AbstractFactory.Button;
import AbstractFactory.Checkbox;
import AbstractFactory.ConcreteClassesB.ButtonB;
import AbstractFactory.ConcreteClassesB.CheckboxB;
import AbstractFactory.ConcreteClassesB.TextFieldB;
import AbstractFactory.TextField;

public class BFactory extends UIFactory {
    @Override
    public Button createButton(String text) {
        return new ButtonB(text);
    }

    @Override
    public TextField createTextField(String text) {
        return new TextFieldB(text);
    }

    @Override
    public Checkbox createCheckbox(String text) {
        return new CheckboxB(text);
    }
}
