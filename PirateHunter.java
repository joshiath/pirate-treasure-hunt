import java.util.Scanner;

/**
 * explores a mysterious island while searching for pirate treasure.
 */
public class PirateHunter {

    /**
     * The main method runs the Pirate Treasure Hunt game.
     */
    public static void main(String[] args) {

        // Create a Scanner to get input from the player
        Scanner input = new Scanner(System.in);

        // Display the title of the game
        System.out.println("================================");
        System.out.println("      PIRATE TREASURE HUNT");
        System.out.println("================================");
        System.out.println();

        // Ask the player for their name
        System.out.print("What is your name? ");
        String name = input.nextLine();

        // Welcome the player to the game
        System.out.println();
        System.out.println("Welcome, " + name + "!");
        System.out.println("After three weeks at sea, your ship crashes");
        System.out.println("onto the mysterious Skull Island.");
        System.out.println();

        // Set the player's starting health
        int health = 100;

        // Give the player their first three choices
        System.out.println("You see three possible places to explore:");
        System.out.println("1. The jungle");
        System.out.println("2. The beach");
        System.out.println("3. A mysterious cave");
        System.out.print("Where do you go? ");

        int choice = input.nextInt();

        // Decide what happens based on the player's first choice
        if (choice == 1) {

            // Jungle path
            System.out.println();
            System.out.println("You enter the jungle.");
            System.out.println("Suddenly, a giant parrot lands on your shoulder.");
            System.out.println("\"WHERE IS THE TREASURE?\" it screams.");
            System.out.println();

            // Give the player another choice in the jungle
            System.out.println("The parrot gives you two choices:");
            System.out.println("1. Follow the parrot.");
            System.out.println("2. Run away from the parrot.");
            System.out.print("Choose: ");

            int jungleChoice = input.nextInt();

            // Decide what happens based on the jungle choice
            if (jungleChoice == 1) {

                System.out.println();
                System.out.println("The parrot leads you through the jungle.");
                System.out.println("You discover a giant X carved into a tree.");
                System.out.println("You dig underneath it...");
                System.out.println();
                System.out.println("YOU FOUND THE TREASURE!");
                System.out.println("Congratulations, " + name + "!");
                System.out.println("You also receive 500 gold coins.");
                System.out.println("The parrot demands half of them.");
                System.out.println("THE END - TREASURE ENDING");

            } else {

                // Ending if the player runs away from the parrot
                System.out.println();
                System.out.println("You run away from the parrot.");
                System.out.println("Unfortunately, you run directly into a pirate");
                System.out.println("who has been hiding behind a tree.");
                System.out.println();
                System.out.println("\"ARRR! THAT'S MY TREE!\"");
                System.out.println("The pirate makes you walk the plank.");
                System.out.println("THE END - PIRATE ENDING");
            }

        } else if (choice == 2) {

            // Beach path
            System.out.println();
            System.out.println("You explore the beach.");
            System.out.println("You find a treasure chest!");
            System.out.println("Unfortunately, it is guarded by an extremely");
            System.out.println("angry crab wearing a tiny pirate hat.");
            System.out.println();

            // Give the player a choice when they meet the crab
            System.out.println("What do you do?");
            System.out.println("1. Fight the crab.");
            System.out.println("2. Give the crab a sandwich.");
            System.out.print("Choose: ");

            int beachChoice = input.nextInt();

            // Decide what happens based on the player's choice
            if (beachChoice == 1) {

                // Fighting the crab reduces the player's health
                health -= 50;

                System.out.println();
                System.out.println("You challenge the crab to battle!");
                System.out.println("The crab is surprisingly powerful.");
                System.out.println("You lose 50 health.");
                System.out.println("Health remaining: " + health);
                System.out.println();
                System.out.println("The crab wins.");
                System.out.println("You decide that treasure isn't worth this.");
                System.out.println("THE END - CRAB ENDING");

            } else if (beachChoice == 2) {

                // Giving the crab a sandwich allows the player to find the treasure
                System.out.println();
                System.out.println("You give the crab your sandwich.");
                System.out.println("The crab accepts the sandwich.");
                System.out.println("It opens the treasure chest for you.");
                System.out.println();
                System.out.println("YOU FOUND THE TREASURE!");
                System.out.println("The crab becomes your new first mate.");
                System.out.println("Congratulations, " + name + "!");
                System.out.println("THE END - CRAB FRIENDSHIP ENDING");

            } else {

                // Ending for an invalid beach choice
                System.out.println();
                System.out.println("The crab does not understand your choice.");
                System.out.println("It steals your shoe.");
                System.out.println("THE END - SHOELESS ENDING");
            }

        } else if (choice == 3) {

            // Cave path
            System.out.println();
            System.out.println("You enter the mysterious cave.");
            System.out.println("It is completely dark.");
            System.out.println("You hear a strange noise...");
            System.out.println();

            // Give the player a choice inside the cave
            System.out.println("You find a glowing lever.");
            System.out.println("1. Pull the lever.");
            System.out.println("2. Leave the cave.");
            System.out.print("Choose: ");

            int caveChoice = input.nextInt();

            // Decide what happens based on the player's cave choice
            if (caveChoice == 1) {

                System.out.println();
                System.out.println("You pull the lever.");
                System.out.println("The entire cave begins shaking!");
                System.out.println("A secret door opens behind you.");
                System.out.println();
                System.out.println("Inside is the legendary pirate treasure!");
                System.out.println();
                System.out.println("YOU FOUND THE TREASURE!");
                System.out.println("Congratulations, " + name + "!");
                System.out.println("THE END - SECRET CAVE ENDING");

            } else {

                // Ending if the player leaves the cave
                System.out.println();
                System.out.println("You decide to leave the cave.");
                System.out.println("As you walk outside, you realize...");
                System.out.println("you left your map inside.");
                System.out.println("You are now completely lost.");
                System.out.println("THE END - LOST ENDING");
            }

        } else {

            // Ending for an invalid first choice
            System.out.println();
            System.out.println("You chose an invalid location.");
            System.out.println("A coconut falls from a tree and knocks you out.");
            System.out.println("THE END - COCONUT ENDING");
        }

        // Close the Scanner when the game is finished
        input.close();
    }
}