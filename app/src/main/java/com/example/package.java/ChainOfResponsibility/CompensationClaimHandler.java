package ChainOfResponsibility;

public class CompensationClaimHandler extends Handler {
    @Override
    public void handleMessage(Message message) {
        if (message.getType() == Message.MessageType.COMPENSATION_CLAIM) {
            System.out.println("Compensation claim: " + message.getContent());
        } else {
            super.handleMessage(message);
        }
    }
}
