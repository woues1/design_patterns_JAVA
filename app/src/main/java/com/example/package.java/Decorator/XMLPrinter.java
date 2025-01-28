package Decorator;

public class XMLPrinter extends PrinterDecorator {
    public XMLPrinter(Printer decoratedPrinter) {
        super(decoratedPrinter);
    }

    @Override
    public void print(String message) {
        String xmlMessage = "<message>" + message + "</message>";
        super.print(xmlMessage);
    }
}