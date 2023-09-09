package problem_solved;
import java.util.Scanner;
public class Problem_03 {
    public static void main(String[] args) {
        System.out.println("Showing a message");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name ");

        String name = sc.nextLine();

        System.out.println("Hello " + name + " have a good day");
    }
}
