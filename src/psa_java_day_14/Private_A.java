package psa_java_day_14;
//Private
//1. Same class
//Ex.

public class Private_A {
    private  int x = 100;
    private void test(){
        System.out.println("From test");
    }

    public static void main(String[] args) {

        Private_A a1= new Private_A();
        System.out.println(a1.x);
        a1.test();
    }
}
//O/P == 100
//From test