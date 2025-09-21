package oopsconcept;

public class Intro {
    public static void main(String[] args) {
        Student divya = new Student(26,"Divya" , 92.2f);// new allocates the memory at runtime and return its reference

        divya.rollno = 26;        // . operator binds instance variable with reference variables
        divya.name = "Divya Tyagi";
        divya.marks = 98.2f;

        System.out.println(divya);

        System.out.println(divya.rollno);
        System.out.println(divya.name);
        System.out.println(divya.marks);

        Student tyagiji = new Student(26,"TyagiJi",92.6f );
        System.out.println(tyagiji.rollno);


        Student random = new Student(divya);
        System.out.println(random.rollno);
        System.out.println(random.name);
        System.out.println(random.marks);

        // to call a constructor from another constructor
        Student newstudent = new Student();
        System.out.println(newstudent.rollno);
        System.out.println(newstudent.name);
        System.out.println(newstudent.marks);
    }
}

class Student{

    int rollno ;
    String name ;
    float marks;

    Student () {
        this(13 , "Default person" , 90.3f);
    }

    Student(int rollno , String name , float marks){
        this.rollno = rollno ;   // without using this you cannot assign value to the arguments of constructor
        this.name = name ;
        this.marks = marks;
    }

    Student (Student other){
        this.name = other.name;
        this.rollno = other.rollno;
        this.marks = other.marks;
    }
}