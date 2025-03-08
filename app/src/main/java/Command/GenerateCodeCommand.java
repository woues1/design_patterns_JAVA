package Command;

public class GenerateCodeCommand implements Command {
    private GenerateCode generateCode;

    public GenerateCodeCommand(GenerateCode generateCode) {
        this.generateCode = generateCode;
    }

    @Override
    public void execute() {
        generateCode.generate();
    }
}
