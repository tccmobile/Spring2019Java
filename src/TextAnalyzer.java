import java.util.Scanner;

public class TextAnalyzer {
    // Method counts the number of characters
    public static int getNumOfCharacters(final String usrStr) {
        /* Type your code here. */

        return usrStr.length();
    }
    public static void outputWithoutWhitespace(final String usrStr){
        System.out.print("String with no whitespace: ");

        for (int i = 0; i < usrStr.length() ; i++) {
            if ((usrStr.charAt(i)!=' ') && (usrStr.charAt(i)!='\t')){
                System.out.print(usrStr.charAt(i));
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /* Type your code here. */
        String userInput;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence or phrase:");
        userInput = scanner.nextLine();

        System.out.println("\nYou entered: "+userInput);
        System.out.println("\nNumber of characters: "+getNumOfCharacters(userInput));

        outputWithoutWhitespace(userInput);
    }
}