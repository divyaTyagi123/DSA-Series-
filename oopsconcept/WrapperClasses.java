package oopsconcept;

public class WrapperClasses {
    public static void main(String[] args) {
        Integer num = 10;

        byte n = num.byteValue();
        System.out.println(n);

        // primitive values are passed by value in functions, they only get copied to that function , not their reference

        final int a = 20; // a cannot be change

        final A kunal = new A("Kunal");
        kunal.name = "new name";
        //when a non primitive is final , you cannot reassign it
        //kunal = new A("new object");   // gives error

        A obj;
        for(int i = 0; i < 1000000;i++){
            obj = new A("new object");
        }
    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}
class A {
    final int num = 10;
    String name ;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("Object is destroyed");       // this will show when garbage collector destroy the object
    }
}


