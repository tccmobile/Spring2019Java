public class Square extends Rectangle {

    public Square(){
        super();
    }

    public Square(double side){
        super(side,side);
    }

    public void setSide(double side){
        setWidth(side);
        setHeight(side);
    }

    public double getSide(){
        return getWidth();
    }

    @Override
    public double calcArea(){
        return super.calcArea();
    }

    @Override
    public String toString() {
        return "I'm a Square";
    }
}
