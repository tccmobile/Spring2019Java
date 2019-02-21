import java.util.Scanner;

public class PeopleWeights {

    public static void main(String arg[]) {

        // Enter  your code
        final int NUM_WEIGHTS = 5;
        double[] myWeights = new double[NUM_WEIGHTS];
        Scanner scanner =  new Scanner(System.in);
        double weight= 0.0,totalWeight = 0.0, maxWeight=0.0;
        int i;

        for (i = 0; i < myWeights.length; i++) {
            System.out.println("Enter weight "+(i+1)+":");
            weight = scanner.nextDouble();
            myWeights[i] = weight;
            totalWeight+=weight;
            if (weight>maxWeight){
                maxWeight = weight;
            }
        }

        System.out.print("You entered: ");
        for (double temp:myWeights) {
            System.out.print(temp+" ");
        }

        System.out.println("\n\nTotal weight: " + totalWeight);
        System.out.println("Average weight: "+(totalWeight/NUM_WEIGHTS));
        System.out.println("Max weight: "+maxWeight);
    }
}
