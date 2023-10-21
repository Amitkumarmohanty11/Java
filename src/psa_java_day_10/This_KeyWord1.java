package psa_java_day_10;

public class This_KeyWord1 {
    int x=10;

    public static void main(String[] args) {
        This_KeyWord1 a1=new This_KeyWord1();
        System.out.println(a1.x);
        a1.test();
    }
    public void test(){
        System.out.println(this.x);
    }
}
//O/P == both (Object and This) same output (10 and 10)
