import java.util.Scanner;

public class RectangleChecker {


    public static void main(String arg[]) {

        // Enter  your code
        Scanner scanner = new Scanner(System.in);
        int x,y,height,width;

        System.out.println("Enter x coordinate:");
        x= scanner.nextInt();

        System.out.println("Enter y coordinate:");
        y= scanner.nextInt();

        System.out.println("Enter width:");
        width = scanner.nextInt();

        System.out.println("Enter height:");
        height = scanner.nextInt();

        BetterRectangle myRect = new BetterRectangle(x,y,height,width);

        System.out.println("The perimeter of the rectangle is: "+myRect.getPerimeter());
        System.out.println("The area of the rectangle is: "+myRect.getArea());

    }
}
