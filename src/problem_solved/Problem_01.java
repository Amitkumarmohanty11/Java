package problem_solved;
import java.util.Scanner;
public class Problem_01 {
    public static void main(String[] args) {
        System.out.println("Calculate  Percentage");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st sub mark");
        int sub1 = sc.nextInt();
        System.out.println("Enter 2nd sub mark");
        int sub2 = sc.nextInt();
        System.out.println("Enter 3th sub mark");
        int sub3 = sc.nextInt();
        System.out.println("Enter 4th sub mark");
        int sub4 = sc.nextInt();
        System.out.println("Enter 5th sub mark");
        int sub5 = sc.nextInt();
        System.out.println("Enter 6th sub mark");
        int sub6 = sc.nextInt();

        int sub_sum = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;

        //System.out.println(sub_sum);

        System.out.println("Enter total  mark");
        int total = sc.nextInt();


        int percentage = sub_sum*100/total;
        System.out.println("Total Percentage is : " + percentage + "%");
    }
}
