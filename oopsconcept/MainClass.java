package oopsconcept;

public class MainClass {
    SingletonClass obj = SingletonClass.getInstance();
    SingletonClass obj2 = SingletonClass.getInstance();
    SingletonClass obj3 = SingletonClass.getInstance();

    // all 3 reference variable are pointing to just one object
}
