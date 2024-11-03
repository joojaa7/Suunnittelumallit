package A13.Visitors;

import A13.Elements.Directory;
import A13.Elements.File;
import A13.Elements.FileSystemElement;

import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor{

    private final List<File> elements = new ArrayList<>();
    private final String extension;

    public SearchVisitor(String extension){
        this.extension = extension;
    }

    @Override
    public void visit(File file){
        System.out.println(file.getName() + " is not a directory.");
    }

    @Override
    public void visit(Directory directory){
        if (!directory.getSubElements().isEmpty()) {
            for (FileSystemElement f : directory.getSubElements()) {
                if (f instanceof Directory){
                    visit((Directory) f);
                }
                else {
                    assert f instanceof File : "Something went wrong";
                    File file = (File) f;
                    String extensions = file.getName().split("\\.")[1];
                    if (extensions.equals(this.extension)) {
                        this.elements.add(file);
                    }
                }
            }
            System.out.println("Files found in " + directory.getName() + ":");
            for (File file : this.elements){
                System.out.println(file.getName());
            }
        }
        else {
            System.out.println("Directory " + directory.getName() + " is empty.");
        }
    }

    public List<File> getElements() {
        return elements;
    }
}
