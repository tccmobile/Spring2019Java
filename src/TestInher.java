import java.util.ArrayList;

public class TestInher {

    public static void main(String arg[]) {

        // Enter  your code
        Student one = new Student();
        Student two = new Student("Will Smith",52,4.0);
        Person three = new Person("Tom Jones", 17);

        //one.printMe();
        //two.printMe();
        //three.printMe();

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);


        Person four = new Student("Sue Cook",72,3.5);

        four.printMe();

        ArrayList<Person> people = new ArrayList<Person>();

        people.add(one);
        people.add(two);
        people.add(three);
        people.add(four);

        for (int i = 0; i < people.size(); i++) {

            people.get(i).printMe();
            //System.out.println(people.get(i));
        }

    }
}
