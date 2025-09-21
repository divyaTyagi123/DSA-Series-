package oopsconcept.abstraction;

public class Main {
    public static void main(String[] args) {
        AbstractClass abs = new AbstractClass(30);
        abs.choose("B.Tech");

        Other other = new Other();
        other.choose("B.Pharma");

        Career obj = new AbstractClass(26);

        Career.hello();
    }
}
