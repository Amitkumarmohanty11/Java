package conditionals;

public class Else_if {

    public static void main (String[] args) {
        int age= 20 ;
        if(age > 18) {
            System.out.println("Enjoy your drive ");
        }
        else if(age == 18) {
            System.out.println("You can drive");
        }

        else {
            System.out.println("You can not drive");

        }
    }
}
