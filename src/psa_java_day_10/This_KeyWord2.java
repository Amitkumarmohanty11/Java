package psa_java_day_10;
//note:-
//this keyword point to create object runing in the program;
public class This_KeyWord2 {
    public static void main(String[] args) {

        This_KeyWord2 a1 = new This_KeyWord2();
        a1.test();

        This_KeyWord2 a2 = new This_KeyWord2();
        a2.test();
        a1.test();
        a2.test();

    }
    public void test(){
        System.out.println(this);
    }
}
