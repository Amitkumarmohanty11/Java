package psa_java_day_8;
//Return Value
//--> You can use return value only inside not a void method
//--> It is mandatory to use return value inside not void method
//--> It will return value and control to method
public class Return_Value1 {
    public static void main(String[] args) {
        Return_Value1 a1= new Return_Value1();
        int x = a1.test();
        System.out.println(x);
    }
    public int test(){//non static
        return 100;
    }
}
//O/P = 100
