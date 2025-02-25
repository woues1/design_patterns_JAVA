package Proxy;

import java.util.HashSet;
import java.util.Set;

public class AccessControlService {
    private static AccessControlService instance;
    private Set<String> allowedUsers;

    private AccessControlService() {
        allowedUsers = new HashSet<>();
    }

    public static AccessControlService getInstance() {
        if (instance == null) {
            instance = new AccessControlService();
        }
        return instance;
    }

    public void allowAccess(String documentId, String username) {
        allowedUsers.add(documentId + ":" + username);
    }

    public boolean isAllowed(String documentId, String username) {
        return allowedUsers.contains(documentId + ":" + username);
    }
}