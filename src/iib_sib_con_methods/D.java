package iib_sib_con_methods;

public class D {
    {
        System.out.println("1");
    }
    {
        System.out.println("2");
    }
    static
    {
        System.out.println("3");
    }
    D(){
        System.out.println("4");
    }

    public static void main(String[] args) {
        D d1 = new D();
        System.out.println("Main");
    }
}

// O/P == 1
//2
//4
//Main
