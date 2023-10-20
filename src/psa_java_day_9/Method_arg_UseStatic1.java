package psa_java_day_9;

public class Method_arg_UseStatic1 {
    public static void main(String[] args) {
        int val = Method_arg_UseStatic1.test();
        System.out.println(val);
    }
    public static int test(){
        int x=100;
        return x;
    }
}
// O/P =100
