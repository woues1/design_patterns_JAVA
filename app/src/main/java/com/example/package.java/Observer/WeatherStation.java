package Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation implements Runnable {
    private List<Observer> observers;
    private int temperature;
    private Random random;
    private boolean running;

    public WeatherStation() {
        observers = new ArrayList<>();
        random = new Random();
        temperature = random.nextInt(41) - 10;
        running = true;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    private void updateTemperature() {
        int change = random.nextInt(3) - 1;
        temperature = Math.max(-10, Math.min(30, temperature + change));
    }

    @Override
    public void run() {
        while (running) {
            updateTemperature();
            notifyObservers();
            try {
                Thread.sleep((random.nextInt(5) + 1) * 1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void stop() {
        running = false;
    }
}