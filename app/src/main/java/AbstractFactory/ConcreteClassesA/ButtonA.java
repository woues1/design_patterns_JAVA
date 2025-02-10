package AbstractFactory.ConcreteClassesA;
import AbstractFactory.Button;

public class ButtonA extends Button {
    public ButtonA(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("[A Button: " + text + "]");
    }
}