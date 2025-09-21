package oopsconcept.accessmodifier;

// default(if nothing specified then it is default) -- means inside same package accessible
// private -- only in class
// protected -- class , subclass(same package and diff package) , package
// public  -- can be accessed anywhere


public class A {
    protected static int num ;
    String name;
    int[] arr;

    protected A(){

    }

    A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }


}

class B extends A{
    int n = A.num;     // num can be directly accessed by class name because it is static
    String naam;
    B(){        // if we are creating parameterless constructor then parents class must have this type of constructor
        super();
    }
    B(int n , String naam){       // parameterized constructor can be created if parent class has the same one
        super(n , naam);
    }

    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj instanceof Object);

        System.out.println(obj.getClass());
        System.out.println(obj.getClass().getName());
        System.out.println(obj.getClass().getSimpleName());
    }

}