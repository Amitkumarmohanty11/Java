package problem_solved;
import java.util.Scanner;

public class Leap_year {
    public static void returnLeapYear(int year){
        if(year % 4==0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.print(year + " is a leap year ");
                } else {
                    System.out.println(year + "is not a leap year");
                }
            } else {
                System.out.println(year + "is a leap year");
            }
        }
        else{
                System.out.println(year + "is a leap year");
            }

    }
    public static void main(String[] args) {
        int b=2016;
        Leap_year even_number = new Leap_year();
        even_number.returnLeapYear(b);
    }
}
