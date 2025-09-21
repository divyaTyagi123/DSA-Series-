package oopsconcept.staticDemo;
// static public InnerClasses   --->   this will give error as outside class cannot be static
public class InnerClasses {
    static class Test {
        static String name;

        public Test(String name){
            this.name = name;
        }

        @Override
        public String toString(){
            return "Test{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }



    public static void main(String[] args) {
        //Test a = new Test("Kunal");     giving error as this is an inner class and dependent on another class
        //Test b = new Test("Rahul");

        Test a = new Test("kunal");    // this does not give error because inner class Test is now static
        // due to static we do not need to make its object to use it , we can directly use it
        Test b = new Test("Rahul");

        //both statements print resp. names as Test is static and don't need Innerclasses object, Test can have its own individual identity

        System.out.println(a.name);
        System.out.println(b.name);

        // but if we declare name as static then both statements will print same name

        System.out.println(a.name);
        System.out.println(b.name);

        // printing object

        System.out.println(a);

    }
}
