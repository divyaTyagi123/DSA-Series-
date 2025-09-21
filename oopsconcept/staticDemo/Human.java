package oopsconcept.staticDemo;

public class Human {
    String name;
    int age ;
    int salary;
    boolean married;
    static int population;

    public Human(int age , String name , boolean married , int salary) {
        this.age = age;
        this.name = name;
        this.married = married;
        this.salary = salary;
        this.population += 1;   // we can also write Humans.population as static variables can be accessed with class names

    }
}
