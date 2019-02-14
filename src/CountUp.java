import java.util.Scanner;

public class CountUp {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int currPower;
        char userChar='z';

        currPower = 2;


        do {
            System.out.println(currPower);
            currPower = currPower * 2;
            userChar = scnr.next().charAt(0);
        } while (userChar == 'y');

        System.out.println("Done");
    }
}