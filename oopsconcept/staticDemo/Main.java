package oopsconcept.staticDemo;

public class Main {
    public static void main(String[] args) {

//        Human kunal = new Human(25,"Kunal" , false , 10000);
//
//        System.out.println(kunal.population);    //1
//
//        Human divya = new Human(21, "Divya" , false , 1000000);
//        System.out.println(divya.population);  //2
//        System.out.println(Human.population);    //2

        //greeting();         // u cannot use anything non-static inside a static method

        Main.fun2();

    }

    static void message(int n){
        // System.out.println(this.n);
        // this will give error as this can't be used in static methods as static is not related to any object
        System.out.println(n);
    }

    static void fun2(){
        Main obj = new Main();
        obj.greeting();
    }

    void fun(){
        greeting();     // this is not static so can call non-static method
    }
    void greeting(){
        System.out.println("Hello");

    }
}
