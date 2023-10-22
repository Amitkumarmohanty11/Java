package iib;

public class Multiple_Iib_1 {

    Multiple_Iib_1(){//Constructor
        System.out.println("From Constructor");
    }
    {//IIB
        System.out.println("From IIB-2");
    }
    {//IIB
        System.out.println("From IIB-1");
    }

    public static void main(String[] args) {

        Multiple_Iib_1 a1 = new Multiple_Iib_1();

    }
}
//O/P == From IIB-2
//From IIB-1
//From Constructor
