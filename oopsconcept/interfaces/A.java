package oopsconcept.interfaces;

public class A {
    // nested interface
    // nested interface can be declared as public , protected or private
    // but top level interface can be declared as only public or default

    public interface NestedInterface{
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface{

    @Override
    public boolean isOdd(int num){
        return (num & 1) == 1;
    }
}


class Mains{
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.isOdd(5));

    }
}