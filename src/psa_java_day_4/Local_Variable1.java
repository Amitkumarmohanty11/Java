package psa_java_day_4;

public class Local_Variable1 {
    public static void main(String[] args) {
        int x = 20;//Local_Variable
        System.out.println(x);
    }
    public void test(){
        int x = 10;
        System.out.println(x);//Error
    }
}
