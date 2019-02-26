import java.util.Scanner;

public class TimeConverter {
    public static void convHrMin (int timeVal, Integer hrVal, Integer minVal) {
        //hrVal.intValue().;
        minVal = new Integer(timeVal % 60);
    }

    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        int totTime;
        int usrHr;
        int usrMin;

        totTime = 0;
        usrHr = 0;
        usrMin = 0;

        Integer Hr = new Integer(usrHr);
        Integer Min = new Integer(usrMin);

        System.out.print("Enter tot minutes: ");
        totTime = scnr.nextInt();

        convHrMin(totTime, Hr, Min);

        System.out.print("Equals: " + usrHr + " hrs " +
                usrMin + " mins");
    }
}