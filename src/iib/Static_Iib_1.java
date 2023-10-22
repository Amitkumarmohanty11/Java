package iib;

public class Static_Iib_1 {
    static char x ;
    static boolean y ;
    {
        x= 'A';
        y=true;
        System.out.println(x);
        System.out.println(y);

    }

    public static void main(String[] args) {
        Static_Iib_1 a1 = new Static_Iib_1();
    }
}
//O/P ==  A
//true
