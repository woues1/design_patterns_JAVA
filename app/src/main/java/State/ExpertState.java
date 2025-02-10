package State;

public class ExpertState implements State {
    @Override
    public void train(GameCharacter character) {
        System.out.println(character.getName() + " is training...");
        character.increaseExperience(20);
        checkLevelUp(character);
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println(character.getName() + " is meditating...");
        character.increaseHealth(15);
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println(character.getName() + " is fighting...");
        character.decreaseHealth(10);
        character.increaseExperience(30);
        checkLevelUp(character);
    }

    @Override
    public void checkLevelUp(GameCharacter character) {
        if (character.getExperiencePoints() >= 200) {
            character.setState(new MasterState());
            System.out.println(character.getName() + " has leveled up to Master!");
        }
    }
}