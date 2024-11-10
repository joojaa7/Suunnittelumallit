package A14.Builders;

import A14.Computer;

public class GamingComputerBuilder implements ComputerBuilder {

    private final Computer computer;

    public GamingComputerBuilder(){
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor(){
        computer.addComponents("Processor", "Core i5 12600K");
    }

    @Override
    public void buildRam(){
        computer.addComponents("RAM", "G.Skill Trident Z5 RGB");
    }

    @Override
    public void buildHardDrive(){
        computer.addComponents("Harddrive", "Lexar SL500");
    }

    @Override
    public void buildGraphicsCard(){
        computer.addComponents("Graphics card", "Nvidia GeForce RTX 470 Super");
    }

    @Override
    public void buildOperatingSystem(){
        computer.addComponents("Operating System", "Windows 10");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }

}
