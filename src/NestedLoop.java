import java.util.Scanner;
public class NestedLoop {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum;
        int i;
        int j;

        userNum = scnr.nextInt();

        /* Your solution goes here  */
        for (i = 0; i <= userNum; i++) {
            for ( j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(i);
        }

    }
}