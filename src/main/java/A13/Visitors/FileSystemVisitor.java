package A13.Visitors;

import A13.Elements.Directory;
import A13.Elements.File;

public interface FileSystemVisitor {

    void visit(File file);

    void visit(Directory directory);

}
