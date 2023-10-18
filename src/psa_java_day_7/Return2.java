package psa_java_day_7;
//return
//if we write anything after return keyword then that code will never run , hence we will get unreachable code error
//Example
public class Return2 {
    public static void main(String[] args) {
        Return2 a1= new Return2();
                a1.test();
    }
    public void test(){
        return;
        //System.out.println(100);
    }
}
//O/P == unreachable statement
