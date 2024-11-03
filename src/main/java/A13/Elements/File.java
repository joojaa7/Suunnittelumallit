package A13.Elements;

import A13.Visitors.FileSystemVisitor;

public class File implements FileSystemElement{

    private final String name;
    private final int size;

    public File(String name, int size){
        this.name = name;
        this.size = size;
    }

    @Override
    public void accept(FileSystemVisitor visitor){
        visitor.visitFile(this);
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}
