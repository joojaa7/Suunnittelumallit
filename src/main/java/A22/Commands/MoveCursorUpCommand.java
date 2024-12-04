package A22.Commands;

import A22.Receivers.Movement;

public class MoveCursorUpCommand implements Command{

    private final Movement receiver;

    public MoveCursorUpCommand(Movement receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute(){
        receiver.moveUp();
    }
}
