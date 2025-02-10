package Observer;

public class TemperatureDisplay implements Observer {
    private String name;

    public TemperatureDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(int temperature) {
        System.out.println(name + " - Current Temperature: " + temperature + "°C");
    }
}