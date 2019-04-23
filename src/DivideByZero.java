import java.util.Scanner;

public class DivideByZero {
    public static void main(String arg[]) {

        // Enter  your code
        Scanner scanner = new Scanner(System.in);

        int a,b;

        System.out.println("Enter 2 numbers:");
        a=scanner.nextInt();
        b=scanner.nextInt();

        try{

            if (b==0){
                throw new ArithmeticException();
            }

            if (a/b<0){
                throw new Exception();
            }

            System.out.println("a/b = "+((double)a/b));

        }catch(ArithmeticException e){
            System.out.println("Exception: Division by zero");
        }catch (Exception e){
            System.out.println("Exception: Division is negative");
        }


    }
}
