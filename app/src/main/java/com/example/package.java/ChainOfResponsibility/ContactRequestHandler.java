package ChainOfResponsibility;

public class ContactRequestHandler extends Handler {
    @Override
    public void handleMessage(Message message) {
        if (message.getType() == Message.MessageType.CONTACT_REQUEST) {
            System.out.println("Contact request: " + message.getContent());
        } else {
            super.handleMessage(message);
        }
    }
}
