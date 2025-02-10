package State;

public class NoviceState implements State {
    @Override
    public void train(GameCharacter character) {
        System.out.println(character.getName() + " is training...");
        character.increaseExperience(10);
        checkLevelUp(character);
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println("Novices cannot meditate.");
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println("Novices cannot fight.");
    }

    @Override
    public void checkLevelUp(GameCharacter character) {
        if (character.getExperiencePoints() >= 50) {
            character.setState(new IntermediateState());
            System.out.println(character.getName() + " has leveled up to Intermediate!");
        }
    }
}