package oopsconcept;

public class SingletonClass {
    private SingletonClass(){

    }

    private static SingletonClass instance; // if this instance variable is not declared as static then we cannot call it inside getInstance

    public static SingletonClass getInstance(){      // if this fun is not static we cannot call is in mainclass
        // check whether 1 obj is created or not
        if(instance == null){
            instance = new SingletonClass();
        }


        return instance;
    }
}
