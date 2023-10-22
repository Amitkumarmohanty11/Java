package iib;
//Multiple IIB in a Program;
public class Multiple_Iib {
    {//IIB
        System.out.println("From IIB-1");
    }
    Multiple_Iib(){//Constructor
        System.out.println("From Constructor");
    }
    {//IIB
        System.out.println("From IIB-2");
    }

    public static void main(String[] args) {

        Multiple_Iib a1 = new Multiple_Iib();

    }
}
//O/P == From IIB-1
//From IIB-2
//From Constructor