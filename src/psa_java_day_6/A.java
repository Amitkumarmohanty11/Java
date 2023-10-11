package psa_java_day_6;

public class A {
    public static void main(String[] args) {
        A a1 = new A();
        a1.test();
    }
    public void test(){// non static
        int x = 10; // created local variable
        System.out.println(x);//using 10
    }
}
