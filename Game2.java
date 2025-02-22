import java.util.Scanner;

public class Game2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        // Initialize game variables
        double str = 0;
        double lky = 0;
        double spd = 0;
        double hp = 100;
        double ehp = 0;
        int move = 0;
        String rollName = "";

        // Character selection
        rollName = selectCharacter();
        switch (rollName) {
            case "arc":
                str = 4;
                lky = 5;
                spd = 9;
                break;
            case "bar":
                str = 9;
                lky = 3;
                spd = 5;
                break;
            case "jes":
                str = 5;
                lky = 9;
                spd = 6;
                break;
        }

        // Display character stats
        displayStats(rollName, str, lky, spd, hp);

        // Game loop
        boolean gameRunning = true;
        while (gameRunning) {
            move = getMove();

            switch (move) {
                case 1:
                    ehp = 100;
                    System.out.println("An enemy with 100 health approaches.");
                    gameRunning = handleBattle(str, ehp);
                    break;
                case 2:
                    displayStats(rollName, str, lky, spd, hp);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    gameRunning = false;
                    break;
                case 4:
                    rollName = selectCharacter();
                    switch (rollName) {
                        case "arc":
                            str = 4;
                            lky = 5;
                            spd = 9;
                            break;
                        case "bar":
                            str = 9;
                            lky = 3;
                            spd = 6;
                            break;
                        case "jes":
                            str = 3;
                            lky = 9;
                            spd = 6;
                            break;
                    }
                    displayStats(rollName, str, lky, spd, hp);
                    break;
                default:
                    System.out.println("Error: Invalid choice.");
                    break;
            }
        }
        
        keyboard.close();
    }

    // Method to select character
    public static String selectCharacter() {
        Scanner keyboard = new Scanner(System.in);
        int rollNum;
        System.out.println("Type your selected class number:");
        System.out.println("1. arc");
        System.out.println("2. bar");
        System.out.println("3. jes");

        rollNum = keyboard.nextInt();

        while (rollNum != 1 && rollNum != 2 && rollNum != 3) {
            System.out.println("Error: Select a valid number.");
            System.out.println("Type your selected class number:");
            System.out.println("1. arc");
            System.out.println("2. bar");
            System.out.println("3. jes");
            rollNum = keyboard.nextInt();
        }

        switch (rollNum) {
            case 1:
                return "arc";
            case 2:
                return "bar";
            case 3:
                return "jes";
            default:
                return "unknown"; // This should not be reached
        }
    }

    // Method to display stats
    public static void displayStats(String rollName, double str, double lky, double spd, double hp) {
        System.out.println("You selected " + rollName + ", your stats are:");
        System.out.println("Strength = " + str);
        System.out.println("Luck = " + lky);
        System.out.println("Speed = " + spd);
        System.out.println("Health = " + hp);
    }

    // Method to handle battle
    public static boolean handleBattle(double str, double ehp) {
        Scanner keyboard = new Scanner(System.in);
        double pdmg = str * 2;
        int move;

        while (ehp > 0) {
            System.out.println("What do you want to do?");
            System.out.println("1. Attack");
            System.out.println("2. Run");
            move = keyboard.nextInt();

            if (move == 1) {
                ehp -= pdmg;
                System.out.println("You did " + pdmg + " damage. The enemy still has " + ehp + " health.");
                if (ehp <= 0) {
                    System.out.println("Congratulations, you killed the enemy and gained 1 exp!");
                    return true;
                }
            } else if (move == 2) {
                System.out.println("You ran away.");
                return true;
            } else {
                System.out.println("Error: Invalid choice.");
            }
        }

        return false;
    }

    // Method to get user move choice
    public static int getMove() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What do you want to do?");
        System.out.println("1. Fight");
        System.out.println("2. Check Stats");
        System.out.println("3. Quit");
        System.out.println("4. Re-select Character");
        return keyboard.nextInt();
    }
}
