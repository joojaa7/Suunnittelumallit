package A14;

import A14.Builders.ComputerBuilder;
import A14.Builders.GamingComputerBuilder;
import A14.Builders.OfficeComputerBuilder;

public class Main {

    public static void main(String[] args){

        ComputerBuilder builder = new GamingComputerBuilder();
        ComputerDirector director = new ComputerDirector(builder);
        director.buildComputer();
        System.out.println(builder.getComputer());

        builder = new OfficeComputerBuilder();
        director = new ComputerDirector(builder);
        director.buildComputer();
        System.out.println(builder.getComputer());

    }

}
