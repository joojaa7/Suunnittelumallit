package A22.Commands;

import A22.Receivers.Movement;

public class MoveCursorRightCommand implements Command{


    private final Movement receiver;

    public MoveCursorRightCommand(Movement receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute(){
        receiver.moveRight();
    }
}
