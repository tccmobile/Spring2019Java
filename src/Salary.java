import java.util.Scanner;

public class Salary {
    public static void main(String [] args) {
        int wage=0;

        Scanner scanner = new Scanner(System.in);
        wage = scanner.nextInt();
        System.out.print("Salary is ");
        System.out.println(wage * 40 * 50);
    }
}