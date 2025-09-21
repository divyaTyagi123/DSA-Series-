package oopsconcept.interfaces;

public class Car implements Engine , Brake{

    int price = 3000000;

    @Override            // internally Override is also an interface
    public void start(){
        System.out.println("I am starting ");
    }

    @Override
    public void stop(){
        System.out.println("I only stop using brake");
    }

    @Override
    public void accelerate(){
        System.out.println("I accelerate very fast ");
    }

    @Override
    public void brake(){
        System.out.println("I break smoothly");
    }

}
