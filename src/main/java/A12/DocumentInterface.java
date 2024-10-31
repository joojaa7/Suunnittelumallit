package A12;

import java.util.Date;

public interface DocumentInterface {

    Date getCreationDate();

    String getContent(User user) throws AccessDeniedException;

    String getName();

}
