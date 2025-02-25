package Builder;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder builder = new GamingComputerBuilder();
        ComputerDirector director = new ComputerDirector(builder);
        director.constructComputer();
        Computer computer = builder.getComputer();
        System.out.println(computer);
    }
}
