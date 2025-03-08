package Command;

public class ToggleColorCommand implements Command {
    private ToggleColor toggleColor;

    public ToggleColorCommand(ToggleColor toggleColor) {
        this.toggleColor = toggleColor;
    }

    @Override
    public void execute() {
        toggleColor.toggle();
    }

}
