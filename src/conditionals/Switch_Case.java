package conditionals;
import java.util.Scanner;
public class Switch_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age =sc.nextInt();

        switch(age){
            case 18 :
                System.out.println("You are going to become an Adult!");
                break;
            case 24:
                System.out.println("You are going to join a job");
                break;
            case 60:
                System.out.println("You are going to get  Retired");
                break;
            default:
                System.out.println("Enjoy your life");
        }

    }

}
