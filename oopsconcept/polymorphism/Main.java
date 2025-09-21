package oopsconcept.polymorphism;

public class Main {
    public static void main(String[] args) {
//        Shapes shape = new Shapes();
//        Circle circle = new Circle();
//        Rectangle rect = new Rectangle();


        // runtime polymorphism or method overriding or dynamic method dispatch(Calling method at runtime instead of compile time
        Shapes shape = new Shapes();
        Shapes circle = new Circle();   // we can only access things which exist in Shapes
                                        // which one has to be call is decided at runtime so it should present at compile time in parent class
        Shapes rect = new Rectangle();

        // if refernce is of parent class and obj is of type child then
        //which method is called is depend on child
        // this is known as upcasting

        shape.area();
        circle.area();
        rect.area();


    }
}
