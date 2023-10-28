package iib_sib_con_methods;
//We can create an object inside the SIB it's not give any error.

//Example:-

public class F {
    {
        System.out.println("IIB");
    }
    static
    {
        F f1=new F();
        System.out.println("SIB");
    }
    F(){
        System.out.println("F");
    }

    public static void main(String[] args) {
        System.out.println("main");
    }
}
//O/P = IIB
//F
//SIB
//main
