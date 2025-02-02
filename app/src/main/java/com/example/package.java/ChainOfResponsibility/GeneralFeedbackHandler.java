package ChainOfResponsibility;

public class GeneralFeedbackHandler extends Handler {
    @Override
    public void handleMessage(Message message) {
        if (message.getType() == Message.MessageType.GENERAL_FEEDBACK) {
            System.out.println("General feedback: " + message.getContent());
        } else {
            super.handleMessage(message);
        }
    }

}
