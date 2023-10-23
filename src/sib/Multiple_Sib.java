package sib;

public class Multiple_Sib {
    static
    {
        System.out.println("From SIB_1");
    }
    static
    {
        System.out.println("From SIB_2");
    }

    public static void main(String[] args) {
        System.out.println("From main");
    }
}
//O/P == From SIB_1
//From SIB_2
//From main