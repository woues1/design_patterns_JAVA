package AbstractFactory;

import AbstractFactory.View.AFactory;
import AbstractFactory.View.BFactory;
import AbstractFactory.View.UIFactory;

public class Main {
    public static void main(String[] args) {
        UIFactory factory = new BFactory();

        Button button = factory.createButton("Click Me");
        TextField textField = factory.createTextField("Enter Text");
        Checkbox checkbox = factory.createCheckbox("Check Me");

        button.display();
        textField.display();
        checkbox.display();

        button.setText("New Button Text");
        textField.setText("New TextField Text");
        checkbox.setText("New Checkbox Text");

        button.display();
        textField.display();
        checkbox.display();
    }
}
