package Command;

public class MoveCursorLeftCommand implements Command {
    private MoveLeft moveLeft;

    public MoveCursorLeftCommand(MoveLeft moveLeft) {
        this.moveLeft = moveLeft;
    }

    @Override
    public void execute() {
        moveLeft.move();
    }
}
