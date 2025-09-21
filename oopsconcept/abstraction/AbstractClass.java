package oopsconcept.abstraction;

//if a class contain one or more than one abstract method , then the class is called absract class.
//abstract class can also have non-abstract method
// if we know that methods are need to be overriden later , then make them abstract so everyone can create their own
// you can not create object of an abstract class
// but you can create reference variable of abstract class
// you cannot create abstract constructor as we cannot create object of abstract class
// static methods cannot be overridden so we cannot create abstract static method

class AbstractClass extends Career {

    AbstractClass(int age){
        this.age = age;
        System.out.println(age);
    }

    @Override
    void choose(String name){
        System.out.println("I am pursuing " + name);
    }
}

class Other extends Career{
    @Override
    void choose(String name){
        System.out.println("I don't have interest in my career but i choose it");
        System.out.println("I am pursuing " + name);
    }
}

abstract class Career {
    int age;

    final int VALUE ;

    public Career(){
       VALUE = 232442;
    }
    public Career (int age){
        this.age = age;
        VALUE = 2344231;
    }
    abstract void choose(String name);
    static void hello(){
        System.out.println("Hello guys");
    }
}