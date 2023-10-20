package psa_java_day_9;

public class Method_arg_UseStatic {
    public static void main(String[] args) {
        Method_arg_UseStatic.test(100);
    }
    public static void test(int x){
        System.out.println(x);
    }
}
//O/P = 100
//note..
//Static keyword use only before public or after public
