package oopsconcept.interfaces;

// all methods of an interface are by default public and abstract so no need to declare then as abstract

public interface Engine {

    int PRICE = 78000;    // by default static and final

    void start();
    void stop();
    void accelerate();
}
