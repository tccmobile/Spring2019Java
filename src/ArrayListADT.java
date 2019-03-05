import java.util.ArrayList;

public class ArrayListADT {
    public static void printArrayList(ArrayList<Integer> numsList) {
        int i;

        for (i = 0; i < numsList.size(); ++i) {
            System.out.print(numsList.get(i));
            System.out.print(" ");
        }

        System.out.println("");
    }

    public static void main(String [] args) {
        ArrayList<Integer> numsList = new ArrayList<Integer>();

        numsList.add(101);
        numsList.add(200);
        numsList.add(103);

        /* Your solution goes here  */
        numsList.remove(1); // removed 200 - 101 103
        numsList.add(0,100); // add 100 - 100 101 103
        numsList.add(2,102); // add 102  - 100 101 102 103

        printArrayList(numsList);
    }
}