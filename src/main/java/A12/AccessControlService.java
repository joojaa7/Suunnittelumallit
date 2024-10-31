package A12;

import java.util.HashMap;

public class AccessControlService {
    
    private static AccessControlService accessControlService = null;

    private static HashMap<String, String> permissions;
    
    private AccessControlService(){
        System.out.println("AccessControlService singleton created.");
    }
    
    public static AccessControlService getInstance(){
        if (accessControlService == null){
            permissions = new HashMap<>();
            accessControlService = new AccessControlService();
        }
        return accessControlService;
    }


    public boolean isAllowed(String documentName, String username){
        return permissions.get(documentName).equals(username);
    }

    public void addPermissions(String documentName, String username){
        permissions.put(documentName, username);
    }


    
}
