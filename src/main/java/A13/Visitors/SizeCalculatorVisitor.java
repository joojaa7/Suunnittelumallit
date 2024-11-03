package A13.Visitors;

import A13.Elements.Directory;
import A13.Elements.File;
import A13.Elements.FileSystemElement;

public class SizeCalculatorVisitor implements FileSystemVisitor{

    private int totalSize = 0;

    @Override
    public void visit(File file){
        System.out.println("Size of file " + file.getName() + ": " + file.getSize() + " megabytes.");
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
                    totalSize += file.getSize();
                }
            }
            System.out.println("The total size of all subdirectories and files in " + directory.getName() + ": " + this.totalSize + ".");
        }
        else {
            System.out.println("Directory " + directory.getName() + " is empty.");
        }
    }

    public int getTotalSize() {
        return totalSize;
    }
}
