package State;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameCharacter character = new GameCharacter("Hero");

        while (!(character.getState() instanceof MasterState)) {
            character.displayStatus();
            System.out.println("Choose an action: train, meditate, fight");
            String action = scanner.nextLine();

            switch (action.toLowerCase()) {
                case "train":
                    character.train();
                    break;
                case "meditate":
                    character.meditate();
                    break;
                case "fight":
                    character.fight();
                    break;
                default:
                    System.out.println("Invalid action. Please choose again.");
            }
        }

        System.out.println(character.getName() + " has reached the Master level. Game over!");
        scanner.close();
    }
}