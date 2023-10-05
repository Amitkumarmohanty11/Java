package psa_java_day_2;

public class Static4 {

    static  int x = 100;

    public static void main(String[] args) {
        //Correct
        System.out.println(Static4.x);
        System.out.println(x);

        //wrong
        Static4 a1 = new Static4();
        System.out.println(a1.x);
    }
}
