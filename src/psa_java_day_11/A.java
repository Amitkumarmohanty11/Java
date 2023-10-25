package psa_java_day_11;
//this()
//Using this() keyword while calling constructor from another constructor it should always be first statement

//Example:-

public class A {
    A(int x){
        System.out.println(x);
    }
    A(){
        System.out.println(100);
        this(100);// Error because it can not be second statement
    }

    public static void main(String[] args) {
        A a1 = new A();
    }

}
//Error
