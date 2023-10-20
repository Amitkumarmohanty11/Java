package psa_java_day_9;

public class Constructors_Arg_2 {
    Constructors_Arg_2(byte x){
        System.out.println(x);
    }

    public static void main(String[] args) {
        Constructors_Arg_2 a = new Constructors_Arg_2((byte) 100);
    }
}
//O/P = 100