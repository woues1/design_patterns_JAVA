package Command;

public class MoveCursorDownCommand implements Command {
    private MoveDown moveDown;

    public MoveCursorDownCommand(MoveDown moveDown) {
        this.moveDown = moveDown;
    }

    @Override
    public void execute() {
        moveDown.move();
    }
}
