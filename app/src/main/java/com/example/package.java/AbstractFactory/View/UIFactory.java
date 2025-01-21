package AbstractFactory.View;
import AbstractFactory.Button;
import AbstractFactory.Checkbox;
import AbstractFactory.TextField;

public abstract class UIFactory {
    public abstract Button createButton(String text);
    public abstract TextField createTextField(String text);
    public abstract Checkbox createCheckbox(String text);
}