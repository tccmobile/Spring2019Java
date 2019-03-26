import java.util.ArrayList;
import java.util.Scanner;

public class DataVisualizer {
    public static void main(String arg[]) {

        // Enter  your code
        Scanner scanner = new Scanner(System.in);
        String userInput,tableTitle, tableColumn1, tableColumn2;
        ArrayList<String> authorNames = new ArrayList<String>();
        ArrayList<Integer> authorPublications = new ArrayList<Integer>();

        System.out.println("Enter a title for the data:");
        tableTitle = scanner.nextLine();
        System.out.println("You entered: "+tableTitle);

        System.out.println("\nEnter the column 1 header:");
        tableColumn1 = scanner.nextLine();
        System.out.println("You entered: "+tableColumn1);

        System.out.println("\nEnter the column 2 header:");
        tableColumn2 = scanner.nextLine();
        System.out.println("You entered: "+tableColumn2);

        System.out.println("Enter a data point (-1 to stop input):");
        userInput = scanner.nextLine();

        while (!userInput.equals("-1")){

            if (userInput.indexOf(',')==-1){
                System.out.println("Error: No comma in string.");
            } else  {
                String secondWord = userInput.substring(userInput.indexOf(',')+1);
                if (secondWord.indexOf(',')!=-1){
                    System.out.println("Error: Too many commas in input.");
                }
            }

            System.out.println("Enter a data point (-1 to stop input):");
            userInput = scanner.nextLine();
        }

        // printing of charts



    }
}
