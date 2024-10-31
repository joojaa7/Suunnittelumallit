package A12;

import java.util.Date;

public class DocumentProxy implements DocumentInterface{

    private final Document document;


    public DocumentProxy(Document document){
        this.document = document;
    }



    @Override
    public String getName() {
        return this.document.getName();
    }

    @Override
    public Date getCreationDate(){
        return this.document.getCreationDate();
    }

    @Override
    public String getContent(User user) throws AccessDeniedException {
        AccessControlService accessControlService = AccessControlService.getInstance();
            if (accessControlService.isAllowed(this.document.getName(), user.getUsername())) {
                return this.document.getContent(user);
            }
            throw new AccessDeniedException("Access denied for document: " + this.document.getName());
    }




}
