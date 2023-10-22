package iib;
//If we used IIB and constructor both in the program ,Then after creating an object IIB will executed 1st and
// then constructor executed

//Example:-
public class Iib_3 {
    {
        System.out.println("From IIB");
    }
    Iib_3(){
        System.out.println("From Constructor");
    }

    public static void main(String[] args) {
        Iib_3 a1 = new Iib_3();
    }
}
//O/P == From IIB
//From Constructor
