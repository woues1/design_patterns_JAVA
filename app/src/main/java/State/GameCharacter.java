package State;

public class GameCharacter {
    private String name;
    private int level;
    private int experiencePoints;
    private int healthPoints;
    private State state;

    public GameCharacter(String name) {
        this.name = name;
        this.level = 1;
        this.experiencePoints = 0;
        this.healthPoints = 100;
        this.state = new NoviceState();
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void increaseExperience(int points) {
        this.experiencePoints += points;
    }

    public void increaseHealth(int points) {
        this.healthPoints += points;
    }

    public void decreaseHealth(int points) {
        this.healthPoints -= points;
    }

    public void train() {
        state.train(this);
    }

    public void meditate() {
        state.meditate(this);
    }

    public void fight() {
        state.fight(this);
    }
    
    public Object getState() {
        return state;
    }

    public void displayStatus() {
        System.out.println("Name: " + name);
        System.out.println("Level: " + level);
        System.out.println("Experience Points: " + experiencePoints);
        System.out.println("Health Points: " + healthPoints);
        System.out.println("Current State: " + state.getClass().getSimpleName());
    }
}