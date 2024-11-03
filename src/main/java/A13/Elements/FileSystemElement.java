package A13.Elements;

import A13.Visitors.FileSystemVisitor;

public interface FileSystemElement {
    void accept(FileSystemVisitor visitor);
}
