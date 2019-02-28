import java.util.Scanner;

public class AuthoringAssistant {

   public static Scanner scanner = new Scanner(System.in);

    /**
     *  Prints a menu and validates user input
     * @return char - letter of user choice
     */

   public static char printMenu(){
        char choice='z';
        // Scanner scanner = new Scanner(System.in); ZyLab wont allow

        choice = scanner.nextLine().charAt(0); //use nextLine consistently

        return choice;
    }

    /**
     * This method returns the number of non-whitespace characters
     * @param usrStr String that the user provides
     * @return int - number of non white-space characters
     */

    public static int getNumOfNonWSCharacters(String usrStr){
        int count=0;

        return count;
    }

    public static int getNumOfWords(String usrStr){
        int count=0;

        return count;
    }

    /**
     * Searches for substrings in a strng
     * @param toBeFound - The string we are looking for
     * @param usrStr - The orginal user provided string
     * @return - int - the number of occurances of the found string
     */
    public static int findText(String toBeFound, String usrStr){
        int count=0;

        return count;
    }

    public static String  replaceExclamation(String usrStr){
        String temp="";


        return temp;
    }

    public static String shortenSpace(String usrStr){
        String temp="";

        return temp;
    }

    public static void main(String arg[]) {

        Scanner scanner = new Scanner(System.in);
        String userInput;
        char choice;

        // Enter  your code
        System.out.println("Enter a sample text:");
        userInput = scanner.nextLine();
        System.out.println("\nYou entered: "+userInput);

        do{
           choice = printMenu();
            //choice = printMenu(scanner);
           //switch based on choice
        } while (choice!='q');



    }
}
