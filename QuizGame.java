import java.util.Scanner;

public class QuizGame {

    static float rightAnswers = 0;
    static float totalQuestions = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Quiz Game");
        System.out.println();
        System.out.println("Enter your Name");

        String name = scanner.nextLine();

        // Start the quiz and calculate score
        float score = playQuiz(scanner);
        
        // Show final results
        System.out.println("Congratulations " + name);
        System.out.println("Your Score: " + rightAnswers + " out of " + totalQuestions);
    }

    public static float playQuiz(Scanner scanner) {
        char option;
        float score = 0;

        System.out.println("Please enter 's' to start the Quiz");
        char start = scanner.next().charAt(0);

        if (start == 's' || start == 'S') {

            // Question 1
            System.out.println("Q1. Who wrote Romeo and Juliet?");
            System.out.println("(a) William Shakspeare (b) John Broke (c) Beren twin (d) Natasha roudlof");
            System.out.print("Your answer: ");
            option = scanner.next().charAt(0);
            totalQuestions++;
            if (option == 'a' || option == 'A') {
                rightAnswers++;
                System.out.println("Your answer is Right\n");
            } else {
                System.out.println("Wrong Answer. Correct Answer is Chittagong\n");
            }

            // Question 2
            System.out.println("Q2. What is the praimary function of router?");
            System.out.println("(a) Storage (b) Connectivity (c) Process (d) Output");
            System.out.print("Your answer: ");
            option = scanner.next().charAt(0);
            totalQuestions++;
            if (option == 'b' || option == 'B') {
                rightAnswers++;
                System.out.println("Your answer is Right\n");
            } else {
                System.out.println("Wrong Answer. Correct Answer is Elon Musk\n");
            }

            // Question 3
            System.out.println("Q3. Which language commonly used for web development?");
            System.out.println("(a) Python (b) C++ (c) Java (d) JavaScript");
            System.out.print("Your answer: ");
            option = scanner.next().charAt(0);
            totalQuestions++;
            if (option == 'c' || option == 'C') {
                rightAnswers++;
                System.out.println("Your answer is Right\n");
            } else {
                System.out.println("Wrong Answer. Correct Answer is 3M\n");
            }

            // Question 4
            System.out.println("Q4. Which device used primarily for data storage?");
            System.out.println("(a) Server (b) Switch  (c) Router (d) Hard Drive");
            System.out.print("Your answer: ");
            option = scanner.next().charAt(0);
            totalQuestions++;
            if (option == 'd' || option == 'D') {
                rightAnswers++;
                System.out.println("Your answer is Right\n");
            } else {
                System.out.println("Wrong Answer. Correct Answer is Bern\n");
            }

            // Question 5
            System.out.println("Q5. Which protocol ensures data transmission?");
            System.out.println("(a) HTTPs (b) FTP (c) HTTP (d) SMTP ");
            System.out.print("Your answer: ");
            option = scanner.next().charAt(0);
            totalQuestions++;
            if (option == 'a' || option == 'A') {
                rightAnswers++;
                System.out.println("Your answer is Right\n");
            } else {
                System.out.println("Wrong Answer. Correct Answer is Charles Babbage\n");
            }

        } else {
            System.out.println("Wrong Input...Please enter 's' or 'S'.");
            return playQuiz(scanner);  // Recursively retry the quiz if the input is incorrect
        }

        return score;  // Return the score if needed
    }
}
