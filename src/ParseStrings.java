import java.util.Scanner;

public class ParseStrings {
    public static void main(String arg[]) {

        // Enter  your code
        Scanner scanner = new Scanner(System.in);
        String userInput, firstName, lastName;

        System.out.println("Enter input string:");

        userInput = scanner.nextLine();

        while(!userInput.equals("q")) {
            while (userInput.indexOf(',') == -1) {
                System.out.println("Error: No comma in string.");
                System.out.println("\nEnter input string:");
                userInput = scanner.nextLine();
            }

            firstName = userInput.substring(0, userInput.indexOf(',')).trim();

            System.out.println("First word: " + firstName);

            lastName = userInput.substring(userInput.indexOf(',') + 1).trim();

            System.out.println("Second word: " + lastName);

            System.out.println("\nEnter input string:");
            userInput = scanner.nextLine();
        }
    }
}
