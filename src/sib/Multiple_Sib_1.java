package sib;

//We can not initialize non_static variable inside SIB

//Example :-

public class Multiple_Sib_1 {
    int i; //non-static
    static
    {
        //i = 40; // Error
    }

    public static void main(String[] args) {
        System.out.println("From main");
    }

}
//O/P == Error
