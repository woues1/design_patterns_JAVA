package Decorator;

import java.util.Base64;

public class DecryptedPrinter extends PrinterDecorator {
    public DecryptedPrinter(Printer decoratedPrinter) {
        super(decoratedPrinter);
    }

    public void print(String message) {
        String decryptedMessage = new String(Base64.getDecoder().decode(message));
        super.print(decryptedMessage);
    }
}
