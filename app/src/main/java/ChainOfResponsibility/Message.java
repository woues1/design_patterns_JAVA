package ChainOfResponsibility;

public class Message {

    public enum MessageType {
        COMPENSATION_CLAIM,
        CONTACT_REQUEST,
        DEVELOPMENT_SUGGESTION,
        GENERAL_FEEDBACK
    }

    private MessageType type;
    private String content;
    private String sender;

    public Message(MessageType type, String content, String sender) {
        this.type = type;
        this.content = content;
        this.sender = sender;
    }

    public MessageType getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }
}
