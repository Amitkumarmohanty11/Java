package psa_java_day_2;

public class Non_Static3 {

    int x = 40 ;
    int y = 50;

    public static void main(String[] args) {

        Non_Static3 n1 = new Non_Static3();

        System.out.println(n1.x);

        Non_Static3 n2 = new Non_Static3();
        System.out.println(n2.x);

        Non_Static3 n3 = new Non_Static3();
        System.out.println(n3.y);

    }
}
