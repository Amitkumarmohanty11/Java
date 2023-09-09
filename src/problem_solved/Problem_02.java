package problem_solved;
import java.util.Scanner;
public class Problem_02 {
    public static void main(String[] args) {
        System.out.println("Sum of 3 no.");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st no");
        int no1 = sc.nextInt();

        System.out.println("Enter 2nd no");
        int no2 = sc.nextInt();

        System.out.println("Enter 3th no");
        int no3= sc.nextInt();

        int sum = no1 + no2 + no3;

        System.out.println("Sum is : " + sum);
    }
}
