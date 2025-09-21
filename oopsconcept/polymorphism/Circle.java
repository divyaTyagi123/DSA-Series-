package oopsconcept.polymorphism;

public class Circle extends Shapes{

    // this will run when obj of circle is created
    // hecnce it is overriding the parent method

    @Override    // this s called annotation
    void area(){
        System.out.println("area is pi * r * r ");
    }
}
