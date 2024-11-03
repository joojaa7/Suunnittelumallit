package A13.Visitors;

import A13.Elements.Directory;
import A13.Elements.File;

public interface FileSystemVisitor {

    void visitFile(File file);

    void visitDirectory(Directory directory);

}
