package A22.Commands;

import A22.Receivers.Movement;

public class MoveCursorLeftCommand implements Command{


    private final Movement receiver;

    public MoveCursorLeftCommand(Movement receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute(){
        receiver.moveLeft();
    }
}
