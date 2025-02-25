package Builder;

public class OfficeComputerBuilder implements ComputerBuilder {
    Computer computer;

    public OfficeComputerBuilder(ComputerBuilder builder){ this.computer = new Computer(); }

    @Override
    public void buildProcessor() { computer.addPart( new Part("Intel Core i5-13600", 250) );}

    @Override
    public void buildRam() { computer.addPart( new Part("16GB DDR4 3200MHz", 50) );}

    @Override
    public void buildHardDrive() { computer.addPart( new Part("512GB NVMe SSD", 60) );}

    @Override
    public void buildGraphicsCard() { }

    @Override
    public void buildOperatingSystem() { computer.addPart( new Part("Windows 11 Pro", 140) );}

    @Override
    public Computer getComputer() { return computer; }
}
