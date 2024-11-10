package A14.Builders;

import A14.Computer;

public class OfficeComputerBuilder implements ComputerBuilder {

    private final Computer computer;

    public OfficeComputerBuilder(){
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor(){
        computer.addComponents("Processor", "Apple Processor");
    }

    @Override
    public void buildRam(){
        computer.addComponents("RAM", "Apple RAM");
    }

    @Override
    public void buildHardDrive(){
        computer.addComponents("Harddrive", "Apple HardDrive");
    }

    @Override
    public void buildGraphicsCard(){
        computer.addComponents("Graphics card", "Apple Graphics Card");
    }

    @Override
    public void buildOperatingSystem(){
        computer.addComponents("Operating System", "OS X");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
