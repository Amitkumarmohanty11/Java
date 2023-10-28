package iib_sib_con_methods;

public class F1 {
    static
    {
        System.out.println("SIB");
    }
    static
    {
        System.out.println("Hello");
        F1 f=new F1();
    }
    {
        System.out.println("IIB");
    }

    public static void main(String[] args) {
        F1 f = new F1();
    }
}
//O/P = SIB
//Hello
//IIB
//IIB
