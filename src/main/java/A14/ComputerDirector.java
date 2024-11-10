package A14;

import A14.Builders.ComputerBuilder;

public class ComputerDirector {

    private final ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder){
        this.computerBuilder = computerBuilder;
    }

    public void buildComputer(){
        computerBuilder.buildGraphicsCard();
        computerBuilder.buildHardDrive();
        computerBuilder.buildProcessor();
        computerBuilder.buildRam();
        computerBuilder.buildOperatingSystem();
    }

}
