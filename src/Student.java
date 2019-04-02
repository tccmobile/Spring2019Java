public class Student extends Person {
    private double gpa;

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void printMe() {
        super.printMe();
        System.out.println("My gpa is: "+ getGpa());
    }

    public Student() {
        gpa = 3.0;
    }

    public Student(String name, int age, double gpa) {
        super(name, age);
        this.gpa = gpa;
    }


    @Override
    public String toString(){
        return super.toString()+
                "My gpa is:  "+ gpa +
                '\n';
    }
}
