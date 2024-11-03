package A13;

import A13.Elements.Directory;
import A13.Elements.File;
import A13.Elements.FileSystemElement;
import A13.Visitors.FileSystemVisitor;
import A13.Visitors.SearchVisitor;
import A13.Visitors.SizeCalculatorVisitor;

public class Main {

    public static void main(String[] args){

        SizeCalculatorVisitor sizeCalculatorVisitor = new SizeCalculatorVisitor();
        SearchVisitor searchVisitor = new SearchVisitor("txt");
        File file = new File("Testi.txt", 10);
        Directory directory = new Directory("Files");
        Directory subdirectory = new Directory("Subdirectory");
        directory.add(subdirectory);
        directory.add(new File("Kuva.png", 30));
        directory.add(new File("Teksi.txt", 3));
        subdirectory.add(new File("Teksi1.txt", 10));
        subdirectory.add(new File("Teksi2.txt", 15));
        subdirectory.add(new File("main.py", 2));


        file.accept(sizeCalculatorVisitor);
        file.accept(searchVisitor);

        directory.accept(sizeCalculatorVisitor);
        directory.accept(searchVisitor);


    }

}
