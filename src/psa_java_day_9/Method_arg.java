package psa_java_day_9;

public class Method_arg {
    public static void main(String[] args) {
        Method_arg a1=new Method_arg();
        a1.test(10,20,30,40);

    }
    public void test(int... x){
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);

    }
}