package State;

public interface State {
    void train(GameCharacter character);
    void meditate(GameCharacter character);
    void fight(GameCharacter character);
    void checkLevelUp(GameCharacter character);
}