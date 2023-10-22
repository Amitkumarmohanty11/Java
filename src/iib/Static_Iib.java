package iib;

public class Static_Iib {
    static int x;
    {
        x=100;
        System.out.println(x);
    }

    public static void main(String[] args) {

        Static_Iib a =new Static_Iib();

    }
}
//O/P == 100
