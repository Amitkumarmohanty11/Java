package psa_java_day_2;

public class Non_Static4 {

    int x = 1000;
    String y = "Amit";

    public static void main(String[] args) {

        Non_Static4 n1 = new Non_Static4();
        System.out.println(n1.x);

        Non_Static4 s1 = new Non_Static4();
        System.out.println(s1.y);
    }
}
