package A13.Elements;

import A13.Visitors.FileSystemVisitor;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement {

    private final List<FileSystemElement> subElements;
    private final String name;

    public Directory(String name) {
        this.subElements = new ArrayList<>();
        this.name = name;
    }

    public void add(FileSystemElement element) {
        subElements.add(element);
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }

    public List<FileSystemElement> getSubElements() {
        return subElements;
    }

    public String getName() {
        return name;
    }
}