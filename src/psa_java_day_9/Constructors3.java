package psa_java_day_9;
//Point-4
//Inside Constructors we can use return keyword because Constructors are void

//Example

public class Constructors3 {
    Constructors3(){
        System.out.println("Amit");
        return;
    }

    public static void main(String[] args) {
        Constructors3 a1=new Constructors3();
    }
}
