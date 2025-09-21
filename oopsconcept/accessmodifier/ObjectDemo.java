package oopsconcept.accessmodifier;

public class ObjectDemo {
    int num;
    public ObjectDemo(int num){
        this.num = num;
    }

    @Override
    public int hashCode() {
        //return super.hashCode();
        return num;
    }

    @Override
    public boolean equals(Object obj) {
        //return super.equals(obj);
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34);
        ObjectDemo obj2 = new ObjectDemo(34);

        if(obj == obj2){      // == checks whether two objects pointing to the same reference
            System.out.println("obj1 is equal to obj2");
        }
        if(obj.equals(obj2)){      //check the content
            System.out.println("obj1 is equal to obj2");
        }

//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());
    }

}
