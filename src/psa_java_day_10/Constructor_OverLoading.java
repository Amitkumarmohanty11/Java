package psa_java_day_10;

// Constructor Over Loading
// => Here we create more than one Constructor in same class provided they have different number of arguments or
// different type of arguments

public class Constructor_OverLoading {

    Constructor_OverLoading(){
        System.out.println("A");
    }
    Constructor_OverLoading(int x){
        System.out.println(x);
    }
    Constructor_OverLoading(int x , int y){
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {

        Constructor_OverLoading a1 = new Constructor_OverLoading();
        Constructor_OverLoading a2 = new Constructor_OverLoading(100);
        Constructor_OverLoading a3 = new Constructor_OverLoading(100 , 200);
    }
}
//o/p ==
// A
//100
//100
//200
