package A12;

import java.util.HashMap;

public class Library {

    private final HashMap<String, DocumentInterface> documents;

    public Library(){
        this.documents = new HashMap<>();
    }

    public void addDocument(String content, String documentName, User user, boolean isProtected){
        DocumentInterface document;
        AccessControlService accessControlService = AccessControlService.getInstance();
        if (isProtected){
            document = new DocumentProxy(new Document(content, documentName));
            accessControlService.addPermissions(documentName, user.getUsername());
            documents.put(documentName, document);
        }
        else {
            document = new Document(content, documentName);
            documents.put(documentName, document);
        }
    }

    public DocumentInterface getDocument(String documentName){
        return documents.get(documentName);
    }



}
