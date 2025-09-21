package oopsconcept.polymorphism;

public class Shapes {
    // if area is declared as final then we cannot override this method in child classes

    // this is late binding as it will be resolved at runtime
    void area(){
        System.out.println("I am in shapes ");
    }

    // this is early binding as due to final keyword this will be converted to bytecode at the compile time

//    final void area(){
//        System.out.println("I am in shapes ");
//    }
}
