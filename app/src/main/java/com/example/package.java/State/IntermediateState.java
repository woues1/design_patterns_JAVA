package State;

public class IntermediateState implements State {
    @Override
    public void train(GameCharacter character) {
        System.out.println(character.getName() + " is training...");
        character.increaseExperience(15);
        checkLevelUp(character);
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println(character.getName() + " is meditating...");
        character.increaseHealth(10);
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println("Intermediates cannot fight.");
    }

    @Override
    public void checkLevelUp(GameCharacter character) {
        if (character.getExperiencePoints() >= 100) {
            character.setState(new ExpertState());
            System.out.println(character.getName() + " has leveled up to Expert!");
        }
    }
}