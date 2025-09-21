package oopsconcept.Inheritance;

import oopsconcept.accessmodifier.A;

public class singleInheritance {
    public static void main(String[] args) {
        Box box = new Box(2 , 3 , 1);
        Box2 box2 = new Box2();
        Box box3 = new Box2();
        //Box2 box4 = new Box();       //  error

        Box.greeting();
        Box b = new Box2();
        b.greeting(); //also call the same method as above Box.greeting called
    }
}

class Box{       // if i declared this class as final then all its methods are by default final and it prevent inheritance
    int l ;
    int b;
    int h ;

    public Box(){
        System.out.println(l + b + h);
    }
    public Box(int l , int b , int h){
        this.l = l ;
        this.b = b ;
        this.h = h;
    }

    static void greeting(){
        System.out.println("Hey , I am in box class. ");
    }
}

class Box2 extends Box{
    int w = 10;

//    @Override         static methods cannot be override
//    static void greeting(){
//        System.out.println("Hey Greeting");
//    }

    Box2(){
        super();
        this.w = w;
    }
    Box2(int l , int b , int h , int w){
        super(l , b , h);
        this.w = w;
    }
}

class OtherClass extends A {
    OtherClass(){
        super();        // if A() is not protected or public then we cannot use it in other package subclass
    }
}
