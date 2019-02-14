import java.util.Scanner;

public class DivideByTwoLoop {
    public static void main (String [] args) {
        int userNum;
        Scanner scnr = new Scanner(System.in);
        userNum = scnr.nextInt();

        /* Your solution goes here  */
        while (userNum>=2){
            userNum/=2;
            System.out.print(userNum+" ");
        }

        System.out.println("");
    }
}