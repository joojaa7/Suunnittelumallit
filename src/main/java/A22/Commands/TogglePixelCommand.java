package A22.Commands;

import A22.Receivers.Movement;

public class TogglePixelCommand implements Command{

    private final Movement receiver;

    public TogglePixelCommand(Movement receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute(){
        receiver.togglePixel();
    }

}
