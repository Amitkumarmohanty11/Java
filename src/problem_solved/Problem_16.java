package problem_solved;

public class Problem_16 {
    public static void main(String[] args) {
        System.out.println("Star Pattern");

        for(int i =1 ; i<=5 ; i++){

            for(int j = 5 ; j>= i ; j--){

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
