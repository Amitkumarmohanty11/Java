package iib;

public class Iib_5 {
    {//IIB
        System.out.println("From IIB");
    }
    Iib_5(){//Constructor
        System.out.println("From Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Start main");
        Iib_5 a1 = new Iib_5();
        System.out.println("End main");
    }
}
//O/P == Start main
//From IIB
//From Constructor
//End main
