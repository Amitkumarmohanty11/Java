package problem_solved;
import java.util.Scanner;

public class Problem_04 {
    public static void main(String[] args) {
        System.out.println("Convert Km To miles");

        Scanner sc = new Scanner(System.in);

        double miles = 0.62137119;

        System.out.println("Enter KM");
        float km = sc.nextFloat();

        double mi = km * miles;

        System.out.println("Total Miles is : " + mi);


    }
}
