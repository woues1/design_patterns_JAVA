package AbstractFactory.ConcreteClassesB;
import AbstractFactory.Checkbox;

public class CheckboxB extends Checkbox {
    public CheckboxB(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("[B Checkbox: " + text + "]");
    }
}
