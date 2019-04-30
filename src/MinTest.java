import java.util.ArrayList;

public class MinTest {
    public static <T extends Comparable<T>>
    T FindSmallest(ArrayList<T> myList){
        T smallest = myList.get(0);

        for (int i = 1; i < myList.size(); i++) {
            if (myList.get(i).compareTo(smallest)<0){
                smallest = myList.get(i);
            }
        }

        return smallest;
    }

    public static void main(String arg[]) {

        // Enter  your code
        ArrayList<Double> one = new ArrayList<Double>();
        one.add(4.5);
        one.add(45.2);
        one.add(14.5);
        one.add(3.14);
        one.add(4.5);
        one.add(450.0);

        System.out.println("The smallest value in: "+one+" is: "+FindSmallest(one));

        ArrayList<Integer> two = new ArrayList<Integer>();

        two.add(4);
        two.add(42);
        two.add(15);
        two.add(3);
        two.add(5);
        two.add(17);

        System.out.println("The smallest value in: "+two+" is: "+FindSmallest(two));


    }
}
