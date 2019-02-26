import java.util.Scanner;

public class ArrayReversal {

    public static void reverseVals(int[] arrVals, int arrSize) {
        int i;             // Loop index
        int tmpStore;      // Temp variable for swapping



        for (i = 0; i < (arrSize / 2); ++i) {
            tmpStore = arrVals[i]; // Do swap
            arrVals[i] = arrVals[arrSize - 1 - i];
            arrVals[arrSize - 1 - i] = tmpStore;
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_VALUES = 8;              // Array size
        int[] userVals = new int[NUM_VALUES];  // User values
        int i;                                 // Loop index

        // Prompt user to populate array
        System.out.println("Enter " + NUM_VALUES + " values...");
        for (i = 0; i < NUM_VALUES; ++i) {
            System.out.print("Value:  ");
            userVals[i] = scnr.nextInt();
        }

        System.out.print("\nOriginal values: ");
        for (i = 0; i < NUM_VALUES; ++i) {
            System.out.print(userVals[i] + " ");
        }
        System.out.println();

        // Call method to reverse array values
        reverseVals(userVals, NUM_VALUES);

        // Print updated arrays
        System.out.print("\nNew values: ");
        for (i = 0; i < NUM_VALUES; ++i) {
            System.out.print(userVals[i] + " ");
        }
        System.out.println();
    }
}