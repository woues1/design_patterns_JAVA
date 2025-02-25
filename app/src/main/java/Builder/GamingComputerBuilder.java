package Builder;

public class GamingComputerBuilder implements ComputerBuilder{
    private Computer computer;

    public GamingComputerBuilder() { this.computer = new Computer(); }

    @Override
    public void buildProcessor() { computer.addPart(new Part("Ryzen 9800x3d", 589.9)); }

    @Override
    public void buildRam() { computer.addPart(new Part("Kingston FURY Beast DDR5-6000", 124)); }

    @Override
    public void buildHardDrive() { computer.addPart(new Part("Samsung 990 EVO Plus SSD 2TB", 129.99));}

    @Override
    public void buildGraphicsCard() { computer.addPart(new Part("RTX 5070 Ti GAMING TRIO OC", 1159.99));}

    @Override
    public void buildOperatingSystem() { computer.addPart(new Part("Windows 11", 145.00)); }

    @Override
    public Computer getComputer() { return computer; }
}
