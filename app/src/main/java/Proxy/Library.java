package Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Document> documents;

    public Library() {
        documents = new HashMap<>();
    }

    public void addDocument(Document Document) {
        documents.put(Document.getIdentifier(), Document);
    }

    public Document getDocument(String identifier) {
        return documents.get(identifier);
    }

    public void createProtectedDocument(String identifier, Date creationDate, String content) {
        RealDocument RealDocument = new RealDocument(identifier, creationDate, content);
        DocumentProxy documentProxy = new DocumentProxy(RealDocument);
        addDocument(documentProxy);
    }

}

