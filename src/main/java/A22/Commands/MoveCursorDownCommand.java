package A22.Commands;

import A22.Receivers.Movement;

public class MoveCursorDownCommand implements Command{

    private final Movement receiver;

    public MoveCursorDownCommand(Movement receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute(){
        receiver.moveDown();
    }
}
