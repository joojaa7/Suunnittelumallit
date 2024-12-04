package A22;

import A22.Commands.Command;

public class Invoker {

    private Command left, up, down, right;
    private Command togglePixel;
    private Command generateCode;

    public Invoker(Command left, Command up, Command right, Command down, Command togglePixel, Command generateCode){
        this.left = left;
        this.up = up;
        this.right = right;
        this.down = down;
        this.togglePixel = togglePixel;
        this.generateCode = generateCode;
    }

    public void left(){
        left.execute();
    }

    public void up(){
        up.execute();
    }

    public void right(){
        right.execute();
    }

    public void down(){
        down.execute();
    }

    public void togglePixel(){
        togglePixel.execute();
    }

    public void generateCode(){
        generateCode.execute();
    }


}
