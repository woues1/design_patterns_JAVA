package AbstractFactory.ConcreteClassesA;

import AbstractFactory.TextField;

public class TextFieldA extends TextField {
    public TextFieldA(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("[A TextField: " + text + "]");
    }
}