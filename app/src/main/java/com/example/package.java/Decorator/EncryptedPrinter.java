package Decorator;

import java.util.Base64;

public class EncryptedPrinter extends PrinterDecorator {
    public EncryptedPrinter(Printer decoratedPrinter) {
        super(decoratedPrinter);
    }

    @Override
    public void print(String message) {
        String encryptedMessage = Base64.getEncoder().encodeToString(message.getBytes());
        super.print(encryptedMessage);
    }
}