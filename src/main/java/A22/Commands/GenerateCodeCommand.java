package A22.Commands;

import A22.Receivers.Movement;

public class GenerateCodeCommand implements Command{

    private final Movement receiver;

    public GenerateCodeCommand(Movement receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute(){
        receiver.generateCode();
    }

}
