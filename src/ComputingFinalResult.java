import java.util.Scanner;

public class ComputingFinalResult {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        int number1;
        int number2;
        int finalResult=0;

        number1 = scnr.nextInt();
        number2 = scnr.nextInt();

        /* Your solution goes here  */
        finalResult = (number1 + number2)/3;


        System.out.print("Final result: ");
        System.out.println(finalResult);
    }
}