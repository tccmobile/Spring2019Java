public class PersonTest {
    public static void main(String arg[]) {

        // Enter  your code
        Person one = new Person();
        Person two = new Person("Carson",17);


        System.out.println("Person #1: "+one.getName()+" "+one.getAge());
        System.out.println("Person #2: "+two.getName()+" "+two.getAge());

        one.setName("Will");
        one.setAge(51);
        System.out.println("Person #1: "+one.getName()+" "+one.getAge());


    }
}
