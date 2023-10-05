package psa_java_day_2;

public class Static3 {

    static int x = 40;

    public static void main(String[] args) {
        //wrong way

        Static3 a1 = new Static3();
        System.out.println(a1.x); // Static3.x
    }
}
