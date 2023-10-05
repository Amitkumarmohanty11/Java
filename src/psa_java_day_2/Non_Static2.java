package psa_java_day_2;

public class Non_Static2 {

    int x = 100;

    public static void main(String[] args) {

        Non_Static2 n1 = new Non_Static2();
        System.out.println(n1.x);

        Non_Static2 n2 = new Non_Static2();
        System.out.println(n2.x);
    }
}
