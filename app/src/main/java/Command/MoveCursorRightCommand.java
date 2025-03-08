package Command;

import java.awt.*;

public class MoveCursorRightCommand implements Command {
    private MoveRight moveRight;

    public MoveCursorRightCommand(MoveRight moveRight) {
        this.moveRight = moveRight;
    }

    @Override
    public void execute() {
        moveRight.move();
    }
}
