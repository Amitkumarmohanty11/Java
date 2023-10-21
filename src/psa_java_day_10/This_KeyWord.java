package psa_java_day_10;
//This Keyword
//Note:-
// this keyword is a special reference variable that automatically gets created to store objects address
//Example..

public class This_KeyWord {
    int x=10;
    public static void main(String[] args) {
        This_KeyWord a1 = new This_KeyWord();
        System.out.println(a1);
        a1.test();
    }
    public void test(){
        System.out.println(this);

    }
}
//O/P = both same address
