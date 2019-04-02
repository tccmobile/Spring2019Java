public class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
        name = "None";
        age = 0;
    }

    public void printMe(){
        System.out.println("My name is: "+ getName());
        System.out.println("My age is: "+getAge());

    }

    @Override
    public String toString() {
        return "My name is: " +
                 name + '\n' +
                "My Age is: " + age +
                '\n';
    }
}
