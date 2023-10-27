package iib_sib_con_methods;

public class C {
    {
        System.out.println("IIB");//2nd output
    }
    C(){
        System.out.println("C");//3rd output
    }
    static
    {
        System.out.println("SIB");//1st output
    }

    public static void main(String[] args) {
        C c1 = new C();
    }
}
//O/P ==  SIB
//IIB
//C