// Main.java
package Observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        TemperatureDisplay display1 = new TemperatureDisplay("Display 1");
        TemperatureDisplay display2 = new TemperatureDisplay("Display 2");
        TemperatureDisplay display3 = new TemperatureDisplay("Display 3");

        weatherStation.addObserver(display1);
        weatherStation.addObserver(display2);
        weatherStation.addObserver(display3);

        Thread weatherThread = new Thread(weatherStation);
        weatherThread.start();

    }
}