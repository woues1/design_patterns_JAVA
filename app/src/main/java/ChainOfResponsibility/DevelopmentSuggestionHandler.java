package ChainOfResponsibility;

public class DevelopmentSuggestionHandler extends Handler {
    @Override
    public void handleMessage(Message message) {
        if (message.getType() == Message.MessageType.DEVELOPMENT_SUGGESTION) {
            System.out.println("Development suggestion: " + message.getContent());
        } else {
            super.handleMessage(message);
        }
    }
}
