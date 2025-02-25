package Proxy;

import java.util.Date;

public class DocumentProxy implements Document {
    private RealDocument RealDocument;
    private AccessControlService accessControlService;

    public DocumentProxy(RealDocument RealDocument) {
        this.RealDocument = RealDocument;
        this.accessControlService = AccessControlService.getInstance();
    }

    @Override
    public String getIdentifier() {
        return RealDocument.getIdentifier();
    }

    @Override
    public Date getCreationDate() {
        return RealDocument.getCreationDate();
    }

    @Override
    public String getContent(User user) throws AccessDeniedException {
        if (accessControlService.isAllowed(RealDocument.getIdentifier(), user.getUsername())) {
            return RealDocument.getContent(user);
        } else {
            throw new AccessDeniedException("Access denied for user: " + user.getUsername());
        }
    }
}