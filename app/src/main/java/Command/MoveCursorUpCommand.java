package Command;

import java.awt.*;

public class MoveCursorUpCommand implements Command {
    private MoveUp moveUp;

    public MoveCursorUpCommand(MoveUp moveUp) {
        this.moveUp = moveUp;
    }

    @Override
    public void execute() {
        moveUp.move();
    }
}
