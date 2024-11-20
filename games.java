import java.util.Random;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class games {

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Welcome to the Math Game!");

        // Step 1: Get the user's name
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        // Infinite loop to play multiple rounds
        while (true) {
            System.out.println("\nPress 'S' to start the game or 'Q' to quit.");
            String userInput = scanner.nextLine().toUpperCase();

            if (userInput.equals("Q")) {
                System.out.println("Thanks for playing! Goodbye!");
                break;
            } else if (userInput.equals("S")) {
                // Step 2: Choose difficulty level
                int difficultyLevel = chooseDifficultyLevel();

                // Step 3: Start the game
                startGame(difficultyLevel, playerName);
            } else {
                System.out.println("Invalid input. Please press 'S' to start or 'Q' to quit.");
            }
        }
    }

    // Method to choose difficulty level
    private static int chooseDifficultyLevel() {
        int level = 0;
        while (level < 1 || level > 3) {
            System.out.println("\nChoose a difficulty level (1 = Easy, 2 = Medium, 3 = Hard): ");
            level = scanner.nextInt();
            scanner.nextLine();  // Clear buffer
        }
        return level;
    }

    // Method to start the game based on selected difficulty
    private static void startGame(int level, String playerName) {
        int correctAnswers = 0;
        int totalQuestions = 5;

        System.out.println("\nStarting the game! Answer the questions:");

        for (int i = 0; i < totalQuestions; i++) {
            int num1 = random.nextInt(10 * level) + 1;  // Generate numbers based on difficulty
            int num2 = random.nextInt(10 * level) + 1;
            int correctAnswer = num1 + num2;

            System.out.printf("Question %d: What is %d + %d? ", i + 1, num1, num2);

            int playerAnswer = scanner.nextInt();
            scanner.nextLine();  // Clear buffer

            if (playerAnswer == correctAnswer) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("Incorrect! The correct answer was: " + correctAnswer);
            }
        }

        // Step 4: Show result at the end of the game
        showResults(playerName, correctAnswers, totalQuestions);
    }

    // Method to display the result
    private static void showResults(String playerName, int correctAnswers, int totalQuestions) {
        System.out.println("\nGame Over!");
        System.out.println("Player: " + playerName);
        System.out.println("Correct Answers: " + correctAnswers + "/" + totalQuestions);
        System.out.println("Score: " + ((correctAnswers * 100) / totalQuestions) + "%");

        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = now.format(formatter);
        System.out.println("Date & Time: " + formattedDate);
    }
}
