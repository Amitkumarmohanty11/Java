package psa_java_day_10;
//This_KeyWord_limitation
//note:-
//we can not use this keyword inside the static method
//Example

public class This_KeyWord_limitation {
    public static void main(String[] args) {
        //System.out.println(this);//(error)
    }
    public static void test(){
        //System.out.println(this);//(error)
    }

}
//O/p  ---   non-static variable this cannot be referenced from a static context (error)
