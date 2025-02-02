package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        // Create handlers
        Handler compensationHandler = new CompensationClaimHandler();
        Handler contactHandler = new ContactRequestHandler();
        Handler suggestionHandler = new DevelopmentSuggestionHandler();
        Handler feedbackHandler = new GeneralFeedbackHandler();

        // Chain handlers
        compensationHandler.setNextHandler(contactHandler);
        contactHandler.setNextHandler(suggestionHandler);
        suggestionHandler.setNextHandler(feedbackHandler);

        // Create messages
        Message[] messages = {
                new Message(Message.MessageType.COMPENSATION_CLAIM, "I want a refund for my purchase.", "customer1@example.com"),
                new Message(Message.MessageType.CONTACT_REQUEST, "Please contact me regarding my order.", "customer2@example.com"),
                new Message(Message.MessageType.DEVELOPMENT_SUGGESTION, "I suggest adding a new feature.", "customer3@example.com"),
                new Message(Message.MessageType.GENERAL_FEEDBACK, "Great service!", "customer4@example.com")
        };

        // Process messages
        for (Message message : messages) {
            compensationHandler.handleMessage(message);
        }
    }
}