package psa_java_day_15;


//Private constructor:-
// If a constructor is made private then its object can be created in same class but not outside the class;

//Same class
public class A {
    private A(){

    }

    public static void main(String[] args) {
        A a1 = new A();
    }
}

