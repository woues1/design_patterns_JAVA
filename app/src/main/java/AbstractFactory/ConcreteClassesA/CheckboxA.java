package AbstractFactory.ConcreteClassesA;
import AbstractFactory.Checkbox;

public class CheckboxA extends Checkbox {
    public CheckboxA(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("[A Checkbox: " + text + "]");
    }
}