package oopsconcept.interfaces;

// parent class has no idea of child classes but the child class has
// if child class is calling a function then both child and parent class should have the function at the compile time
// an interface can contain static and default methods
// static method is called via interface name
// access modifier for the overriden method should be same or better than that


public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.accelerate();
        car.start();
        car.brake();
        car.stop();

        Engine cars = new Car();     // we can do it but we cannot access the variables inside Car class
        // cars.price;               //we cannot do that as it is not accessible from reference variable cars
        // which version is to be accessed is define by Car(Object) and what to access is defined by Engine(reference) here
    }
}
