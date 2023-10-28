package iib_sib_con_methods;

public class F2 {
    {
        System.out.println("IIB");
    }
    static
    {
         new F2();
        System.out.println("SIB");
         new F2();
    }

    public static void main(String[] args) {
        F2 f= new F2();
        System.out.println("From main");
    }
}
//O/P == IIB
//SIB
//IIB
//IIB
//From main
