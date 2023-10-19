package psa_java_day_10;
// different type of arguments ( data type )
public class Constructor_OverLoading_1 {

    Constructor_OverLoading_1(int x){
        System.out.println(x);
    }
    Constructor_OverLoading_1(char y){
        System.out.println(y);
    }
    Constructor_OverLoading_1(String z){
        System.out.println(z);
    }

    public static void main(String[] args) {

        Constructor_OverLoading_1 a1  = new Constructor_OverLoading_1(100);
        Constructor_OverLoading_1 a2 = new Constructor_OverLoading_1('A');
        Constructor_OverLoading_1 a3 = new Constructor_OverLoading_1("Amit");
    }

}

//O/P ==
// 100
//A
//Amit

