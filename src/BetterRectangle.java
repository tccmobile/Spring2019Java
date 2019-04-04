import java.awt.*;

public class BetterRectangle extends Rectangle {

    public double getPerimeter(){
        double perimeter;

        perimeter = (2* height) + (2 * width);
        return perimeter;
    }

    public double getArea(){
        double area;

        area = height*width;
        return area;
    }

    public BetterRectangle(int x, int y, int h, int w){

        setLocation(x,y);
        setSize(h,w);
    }
}
