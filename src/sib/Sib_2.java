package sib;

public class Sib_2 {
    static int x;
    {
        x=10;
        System.out.println(x);
    }

    public static void main(String[] args) {
        Sib_2 a1 =new Sib_2();
        System.out.println("From main");
    }
}
// O/P == 10
//From main